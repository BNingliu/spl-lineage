package com.myxql.parser.db;

public enum Platform {
	
	mysql(1),
	oracle(2),
	oracle2(3),
	SQLServer(4),
	kylin(5),
	es(6),
	rabbitmq(7),
	besmq(8),
	hive(10),
	spark(11),
	impala(12),
	kudu(13),
	postgre(14),
	greenplum(15),
	argodb(16),
	GBase(17),
	ClickHouse(18),
	Doris(19),
	kafka(20),
	openGauss(21),
	OBMysql(23),
	OBOracle(24),
	TBDS(25),
	txt(27),
	ftp(30),
	sftp(31),
	hdfs(33),
	neo4j(40),
	tugraph(41),
	mongoDb(45),
	api(50),
	oss(60),
	qianbase(61);

	private int platform;
	
	private Platform(int platform){
		this.platform = platform;
	}
	
    public int getPlatform() {
        return platform;
    }
    
    public static Platform getPlatform(int platform) {
        for(Platform pf : values()) {
            if(pf.getPlatform()==platform) return pf;
        }
		throw new RuntimeException("db type is not support");
    }
    

}
