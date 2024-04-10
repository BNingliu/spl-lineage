package com.myxql.parser.db;

public enum Platform {
	
	mysql(1,"mysql"),
	oracle(2,"oracle"),
	oracle2(3,"oracle2"),
	SQLServer(4,"sqlserver"),
	kylin(5,"kylin"),
	es(6,"es"),
	rabbitmq(7,"rabbitmq"),
	besmq(8,"besmq"),
	hive(10,"hive"),
	spark(11,"spark"),
	impala(12,"impala"),
	kudu(13,"kudu"),
	postgre(14,"postgre"),
	postgresql(14,"postgresql"),

	greenplum(15,"greenplum"),
	argodb(16,"argodb"),
	GBase(17,"gbase"),
	ClickHouse(18,"clickhouse"),
	Doris(19,"doris"),
	kafka(20,"kafka"),
	openGauss(21,"opengauss"),
	OBMysql(23,"obmysql"),
	OBOracle(24,"oboracle"),
	TBDS(25,"tbds"),
	txt(27,"txt"),
	ftp(30,"ftp"),
	sftp(31,"sftp"),
	hdfs(33,"hdfs"),
	neo4j(40,"neo4j"),
	tugraph(41,"tugraph"),
	mongoDb(45,"mongodb"),
	api(50,"api"),
	oss(60,"oss"),
	qianbase(61,"qianbase"),
	aft(62,"aft"),

	teledb(63,"teledb"),

	datax(99,"datax"),
	txtfile(-100,"txtfile")


	;

	private int platform;
	private String name;

	private Platform(int platform){
		this(platform,null);
	}

	private  Platform(int platform, String name) {
		this.platform = platform;
		this.name = name;
	}

	public int getPlatform() {
        return platform;
    }
	public String getName() {
		return name;
	}
    
    public static Platform getPlatform(int platform) {
        for(Platform pf : values()) {
            if(pf.getPlatform()==platform) return pf;
        }
		throw new RuntimeException("db type is not support");
    }

	public static Platform getPlatform(String name) {
		for(Platform pf : values()) {
			if(pf.getName().equals(name)) return pf;
		}
		throw new RuntimeException("db type is not support");
	}

}
