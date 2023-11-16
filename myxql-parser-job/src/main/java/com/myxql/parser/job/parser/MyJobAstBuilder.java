package com.myxql.parser.job.parser;

import com.myxql.parser.job.antlr4.MyxqlJobParser;
import com.myxql.parser.job.antlr4.MyxqlJobParserBaseVisitor;
import com.myxql.parser.model.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyJobAstBuilder extends MyxqlJobParserBaseVisitor<StatementLineage> {
    private Optional<String> jobCommands = Optional.empty();

    private List<StatementLineage> tableDatas = new ArrayList<>();

    @Override
    public StatementLineage visitJobCommond(MyxqlJobParser.JobCommondContext ctx) {
        StatementLineage tableData = super.visitJobCommond(ctx);
        tableDatas.add(tableData);
        return tableData;
    }

    @Override
    public StatementLineage visitExecCommond(MyxqlJobParser.ExecCommondContext ctx) {
        String resourceName = ctx.resourceNameExpr().getText();
        String className = ctx.classNameExpr().getText();

        List<String> params = new ArrayList<>();

        if(ctx.paramsExpr() != null) {
            for(ParseTree item : ctx.paramsExpr().children) {
                if(item instanceof MyxqlJobParser.ParamExprContext) {
                    MyxqlJobParser.ParamExprContext param = (MyxqlJobParser.ParamExprContext) item;
                    String value = StringUtils.substring(jobCommands.get(), param.start.getStartIndex(), param.stop.getStopIndex() + 1);
                    if (StringUtils.startsWith(value, "/")) { //解决连续多个文件路径，不能正确解析
                        value = replaceWhitespace(value);

                        params.addAll(Arrays.asList(StringUtils.split(value, " ")));
                    } else {
                        value = ModelHelper.cleanQuote(value);
                        params.add(value);
                    }
                }
            }
        }

        JobData jobData = new JobData(resourceName, className, Optional.of(params));
        return new StatementLineage(StatementType.JOB, Optional.ofNullable(jobData));
    }

    @Override
    public StatementLineage visitSetCommond(MyxqlJobParser.SetCommondContext ctx) {
        String key = ctx.keyExpr().getText();
        String value = StringUtils.substring(jobCommands.get(), ctx.value.start.getStartIndex(), ctx.value.stop.getStopIndex() + 1);

        value = ModelHelper.cleanQuote(value);
        SetData data = new SetData(key, Optional.ofNullable(value));
        return new StatementLineage(StatementType.JOB_SET, Optional.ofNullable(data));
    }

    @Override
    public StatementLineage visitUnsetCommond(MyxqlJobParser.UnsetCommondContext ctx) {
        String key = ctx.keyExpr().getText();
        UnSetData unSetData = new UnSetData(key);
        return new StatementLineage(StatementType.JOB_UNSET, Optional.ofNullable(unSetData));
    }

    @Override
    public StatementLineage visitUseCommond(MyxqlJobParser.UseCommondContext ctx) {
        String dbName = ctx.ID().getText();
        JobUse jobUse = new JobUse(dbName);
        return new StatementLineage(StatementType.JOB_USE, Optional.ofNullable(jobUse));
    }

    @Override
    public StatementLineage visitSqlCommond(MyxqlJobParser.SqlCommondContext ctx) {
        JobSql data = new JobSql(ctx.getText());
        return new StatementLineage(StatementType.JOB_SQL, Optional.ofNullable(data));
    }

    private String replaceWhitespace(String str) {
        if (str != null) {
            int len = str.length();
            if (len > 0) {
                char[] dest = new char[len];
                int destPos = 0;
                for (int i = 0; i< len; i++) {
                    char c = str.charAt(i);
                    if (!Character.isWhitespace(c)) {
                        dest[destPos++] = c;
                    } else {
                        dest[destPos++] = ' ';
                    }
                }
                return new String(dest, 0, destPos);
            }
        }
        return str;
    }

    public List<StatementLineage> getTableDatas() {
        return this.tableDatas;
    }

    void setCommand(String commands) {
        this.jobCommands = Optional.ofNullable(commands);
    }

}
