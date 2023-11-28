package com.myxql.parser.datax;



import com.myxql.parser.datax.enums.SqlTypeEnum;
import com.myxql.parser.datax.model.lineage.FieldLineageModel;
import com.myxql.parser.datax.model.lineage.TableLineageModel;
import com.myxql.parser.datax.model.metadata.TableMetadataModel;

import java.util.List;

/**
 * @ClassName SqlParserAbstractFactory
 * @description:
 * @author: again
 * @Date: 2021/3/10 8:14 下午
 */
public abstract class SqlParserAbstract implements SqlParserService {

//    public static final Logger logger = LoggerFactory.getLogger(SqlParserAbstract.class);

    private void notSupport(String msg) {
//        logger.error("not support {}", msg);
//        throw new RuntimeException("not support");
    }

    @Override
    public SqlTypeEnum parseSqlType(String sql) {
        notSupport("parseSqlType");
        return null;
    }

    @Override
    public TableMetadataModel parseSqlMetadata(String sql) {
        notSupport("parseSqlMetadata");
        return null;
    }

    @Override
    public String parseSqlFormatter(String sql) {
        notSupport("parseSqlFormatter");
        return null;
    }

    @Override
    public TableLineageModel parseSqlTableLineage(String sql) {
        notSupport("parseSqlTableLineage");
        return null;
    }

    @Override
    public List<FieldLineageModel> parseSqlFieldLineage(String sql) {
        notSupport("parseSqlFieldLineage");
        return null;
    }
}
