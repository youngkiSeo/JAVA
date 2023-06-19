package com.green.java.Academic_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConm {

	public Connection conn = null;

	static String driver = "com.mysql.jdbc.Driver";// 여기로 연결하겠다 driver 인스턴스
	static String user = "root";
	static String pass = "1234";
	static String dbURL = "jdbc:mysql://localhost:3306/university?severTimezone=Asia/Seoul";

	DBConm() throws SQLException {
		try {
			// Class.forName() 통해 JDBC 드라이버 클래스 로드 메모리 적재(드라이버 클래스)
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("MYSQL 드라이버 검색 성공");

			// JDBD 드라이버 연결 위한 예외 처리 ClassNotFoundException
		} catch (ClassNotFoundException e) {
			System.out.println("MYSQL 드라이버 검색 오류");
		}

		try {
			// DriverManager.getConnection()을 통해 Connection 객체 생성
			conn = DriverManager.getConnection(dbURL, user, pass);
			System.out.println("MYSQL 연결 성공");
			// 데이터 베이스 연결 위한 예외처리 SQLException
		} catch (SQLException e) {
			System.out.println("MYSQL 연결 객체 생성 실패" + e);
			System.exit(0);
		}
	}
}
