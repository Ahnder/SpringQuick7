package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUtil {
	
	// getConnection() 
	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}
	
	// close(stmt, conn)
	public static void close(PreparedStatement stmt, Connection conn) {
		// if (stmt != null) stmt.close()
		if (stmt != null) {
			try {
				if (!stmt.isClosed()) stmt.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				stmt = null;
				
			}
		}
		
		// if (conn != null) conn.close()
		if (conn != null) {
			try {
				if (!conn.isClosed()) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				conn = null;
				
			}
		}
		
	}
	
	// close(rs, stmt, conn)
	public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) {
		// if(rs != null) rs.close()
		if (rs != null) {
			try {
				if (!rs.isClosed()) rs.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				rs = null;
				
			}
		}
		
		// stmt.close()
		if (stmt != null) {
			try {
				if (!stmt.isClosed()) stmt.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				stmt = null;
				
			}
		}
		
		// conn.close()
		if (conn != null) {
			try {
				if (!conn.isClosed()) conn.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			} finally {
				conn = null;
				
			}
		}
	}
	
}
