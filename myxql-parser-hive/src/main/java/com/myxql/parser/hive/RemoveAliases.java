package com.myxql.parser.hive;

public class RemoveAliases {
    public static void main(String[] args) {
        String query = "select id as distinct_id , tag_value_enum as tag_value , to_date(now()) as 'base_day'  ,to_date(now())  'sc'  from (\n" +
                "SELECT a.id ,b.tag_id,b.tag_value_enum,case when c.tag_enum!='' THEN '0' else '1' end te\n" +
                "FROM test_123.ods_company a LEFT JOIN  test_123.ods_portarit_lixian b \n" +
                "on a.id=b.id LEFT JOIN  test_123.ods_portrait_sftp c\n" +
                "on a.id=c.id\n" +
                "    )x";

        String result = removeQuotesFromAliases(query);
        System.out.println(result);
    }

    public static String removeQuotesFromAliases(String query) {
        String[] words = query.split("\\s+");

        // 标记，用于指示下一个单词是否是字段别名的一部分
        boolean inAlias = false;

        // 遍历查询语句中的每个单词
        for (int i = 0; i < words.length - 1; i++) {
            String currentWord = words[i];

            // 判断当前单词是否是 AS 关键字
            if (currentWord.equalsIgnoreCase("AS")) {
                inAlias = true; // 进入字段别名部分
                continue;
            }

            // 去除字段别名中的单引号或双引号
            if (inAlias) {
                words[i] = words[i].replaceAll("[\"']", "");
                inAlias = false; // 字段别名处理完成
            }
        }

        // 重新构建处理后的查询语句
        return String.join(" ", words);
    }
}
