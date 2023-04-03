package com.tenco.BDHelper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATABASE_NAME = "qna";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER_NAME = "root";
	private static final String DB_PASSWORD = "1234";
	// 데이터베이스마다 연결방법이 다르면 귀찮아서 인터페이스로 편하게 쓰라고 만들어둠
	private Connection conn;

	// 싱글톤 패턴
	// 생성자가 여러번 호출 되더라도 최초에 호출된 하나의 생성자의 객체만 리턴한다
	// 1번 기본 생성자를 만들어 서 private 으로 설정
	private DBHelper() {
	}

	// 2번 자기 자신을 private로 선언
	private static DBHelper dbClient;

	// 3번 외부 어디서든지 접근 가능한 static 매서드를 만들어준다.
	public static DBHelper getInstance() {
		if (dbClient == null) {
			dbClient = new DBHelper();
		}
		return dbClient;
	}

	public Connection getConnection() {
		if (conn == null) {
			// 한번도 생성하지 않았다면 동작
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATABASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, DB_USER_NAME, DB_PASSWORD);
				System.out.println(">> DB 연결 완료 <<");
			} catch (Exception e) {
				System.out.println(">> DBHelper 에서 오류가 발생 했어! <<");
				e.printStackTrace();
			}
		}
		return conn;
	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		conn = null;
	}

}
