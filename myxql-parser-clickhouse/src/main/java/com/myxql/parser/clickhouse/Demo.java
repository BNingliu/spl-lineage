package com.myxql.parser.clickhouse;

import com.alibaba.fastjson2.JSON;
import com.myxql.parser.clickhouse.parser.ClickHouseSQLParser;
import com.myxql.parser.db.Platform;
import com.myxql.parser.model.ColumnLineage;
import com.myxql.parser.model.StatementLineage;

import java.util.List;

/**
 * @program: spl-lineage
 * @description:
 * @author: liuningbo
 * @create: 2023/11/28 09:29
 */
public class Demo {
    public static void main(String[] args) {
        String sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, name FROM ( SELECT id1 + id2 AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

        sql =
                " INSERT INTO TABLE db_test.table_result SELECT\n" +
                        "    a.id\n" +
                        ",a.appid\n" +
                        ",a.point_id\n" +
                        ",e.name point_name\n" +
                        ",a.activity_id\n" +
                        ",ifnull(d.activity_name,f.name) as activity_name\n" +
                        ",d.landing_page_id\n" +
                        ",g.name landing_page_name\n" +
                        ",case when a.activity_type=1 then '营销场景' when a.activity_type=2 then '抽奖' when  a.activity_type=3 then '自定义页面'\n" +
                        "\twhen a.activity_type=4 then '自定义表单' when a.activity_type=5 then '转介' when a.activity_type=6 then '支付'\n" +
                        "\twhen a.activity_type=7 then '任务' when a.activity_type=8 then '手工发放奖励' when a.activity_type=9 then '权益中心'\n" +
                        "    when a.activity_type=10 then '答题' when a.activity_type=11 then 'H5静态页面' when a.activity_type=12 then '组队'\n" +
                        "    when a.activity_type=13 then '投票' when a.activity_type=14 then '积分商城' when a.activity_type=15 then '签到'\n" +
                        "    when a.activity_type=16 then '集卡' when a.activity_type=17 then '线下录单' when a.activity_type=18 then '手工充值'\n" +
                        "    when a.activity_type=19 then '关卡游戏' when a.activity_type=20 then '客制化活动' when a.activity_type=21 then '养成活动'\n" +
                        "    when a.activity_type=22 then '话题PK' end as activity_type\n" +
                        ",a.owner_id as account_id\n" +
                        ",c.core_account_id\n" +
                        ",case when c.account_type = 1 then '微信'\n" +
                        "      when c.account_type = 4 then '手机银行'\n" +
                        "      when c.account_type = 5 then '企业微信'\n" +
                        "      when c.account_type = 10 then '浏览器' else '其他' end account_type\n" +
                        ",b.province\n" +
                        ",b.city\n" +
                        ",a.amount\n" +
                        ",case a.log_type when 1 then '奖励中心发放'\n" +
                        "                when 2 then '过期消耗'\n" +
                        "                when 3 then '兑换'\n" +
                        "                when 4 then '退回'\n" +
                        "                when 5 then '系统扣减' else null end as log_type\n" +
                        ",a.reason\n" +
                        ",a.grant_time\n" +
                        ",a.expense_time\n" +
                        ",substr(a.grant_time,1,10) dt\n" +
                        "\n" +
                        "FROM t_account_point_log a\n" +
                        "left join t_account c on c.id = a.owner_id and c.appid = a.appid and c.is_deleted = 0\n" +
                        "left join t_wechat_user b on c.open_id = b.open_id and c.open_id > '0' and b.appid = a.appid and b.is_deleted = 0\n" +
                        "LEFT JOIN t_user_activity d on a.activity_id = d.id and d.appid = a.appid and d.is_deleted = 0\n" +
                        "left join t_point e on a.point_id = e.id and e.appid = a.appid and e.is_deleted = 0\n" +
                        "left join t_hand_award f on a.activity_id = f.id and a.activity_type = 8 and f.appid = a.appid and f.is_deleted = 0\n" +
                        "left join t_landing_page g on d.landing_page_id = g.id and g.appid = a.appid and g.is_deleted = 0\n" +
                        "WHERE a.is_deleted = 0 and a.appid = '600210787264368640' and g.id is null  ";

        System.out.println(sql.length());
        ClickHouseSQLParser parserService = new ClickHouseSQLParser(Platform.ClickHouse.getPlatform(),1);
        StatementLineage data = parserService.parseSqlTableLineage(sql);
        System.out.println(JSON.toJSONString(data));


        System.out.printf("\n");
        List<ColumnLineage> columnLineages = parserService.parseSqlFieldLineage2(sql);
        System.out.println(JSON.toJSONString(columnLineages));

//        String s = parserService.parseSqlFormatter(sql);
//        System.out.println(s);


    }

}
