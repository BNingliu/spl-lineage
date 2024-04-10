package com.myxql.parser.datax.util;

/**
 * @program: spl-lineage
 * @description:
 * @author: liuningbo
 * @create: 2023/12/22 11:25
 */
import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class DatabaseUrlParser {

    public static String extractDatabaseName(String url) {
        String regex = "jdbc:(\\w+):\\/\\/(\\S+):(\\d+)\\/([^?]+)";
        String[] result = new String[4];
        if (url.startsWith("jdbc:oracle")) {
            regex = "jdbc:(\\w+):thin:@\\/\\/([\\d\\.]+):(\\d+)\\/(\\w+)";
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            return matcher.group(4); // 数据库名称
        }
        return "";
    }

    public static String extractIpPortAndDatabase(Integer dbType,String url) {
        String regex = "jdbc:(\\w+):\\/\\/(\\S+):(\\d+)\\/([^?]+)";
        String[] result = new String[4];
        if (url.startsWith("jdbc:oracle")) {
            regex = "jdbc:(\\w+):thin:@\\/\\/([\\d\\.]+):(\\d+)\\/(\\w+)";
        } else  if (url.startsWith("hdfs")) {
            regex = "hdfs:\\/\\/(\\S+):(\\d+)";
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            if (url.startsWith("hdfs")) {
                result[0] = matcher.group(1); // 数据库类型
                result[1] = matcher.group(2); // IP地址
                return dbType+":"+result[0]+":"+result[1];
            }else {
                result[0] = matcher.group(1); // 数据库类型
                result[1] = matcher.group(2); // IP地址
                result[2] = matcher.group(3); // 端口号
                result[3] = matcher.group(4); // 数据库名称
                return dbType+":"+result[1]+":"+result[2];
            }


        }

        return "";
    }

    public static void main(String[] args) {
        String jdbcUrl1 = "jdbc:mysql://192.168.2.131:3306/test1_core?useUnicode=true&useSSL=false&characterEncoding=UTF-8&tinyInt1isBit=false&zeroDateTimeBehavior=convertToNull";
        String jdbcUrl2 = "jdbc:postgresql://192.168.2.131:15432/qianbase";
        String jdbcUrl3 = "jdbc:oracle:thin:@//192.168.2.131:1521/helowin";

        String dbName1 = extractIpPortAndDatabase(1,jdbcUrl1);
        String dbName2 = extractIpPortAndDatabase(1,jdbcUrl2);
        String dbName3 = extractIpPortAndDatabase(1,jdbcUrl3);

        System.out.println("Database Name 1: " + dbName1);
        System.out.println("Database Name 2: " + dbName2);
        System.out.println("Database Name 3: " + dbName3);
    }

}
