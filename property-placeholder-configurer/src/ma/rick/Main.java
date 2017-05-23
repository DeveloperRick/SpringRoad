/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.hibernate.criterion.Expression.sql;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author M
 */
public class Main {

	static ApplicationContext ac = null;
	static ComboPooledDataSource dataSource = null;
	static Connection conn = null;
	static Statement stmt = null;
	static String sql = null;
	static PreparedStatement pstmt = null;
	static CallableStatement cstmt = null;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		getConn();
		setStmt();
		exeSql();

	}

	private static void getConn() {
		ac = new ClassPathXmlApplicationContext("ma/rick/config.xml");
		System.out.println("--------------------------");
		dataSource = (ComboPooledDataSource) ac.getBean("dataSource");

		try {
			conn = dataSource.getConnection();

		} catch (SQLException ex) {
			System.out.println("数据库连接失败！");
			ex.printStackTrace();
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	private static void setStmt() {

		sql = "select * from subject";
		try {
			//    1、执行静态SQL语句。通常通过Statement实例实现。
			stmt = conn.createStatement();
			//      2、执行动态SQL语句。通常通过PreparedStatement实例实现。 
			// sql ="show tables";// 
			pstmt = conn.prepareStatement(sql);
			//     3、执行数据库存储过程。通常通过CallableStatement实例实现。   
			cstmt = conn.prepareCall("{CALL demoSp(? , ?)}");

		} catch (SQLException ex) {
			System.out.println("执行SQL语句失败！001");
			ex.printStackTrace();
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

	private static void exeSql() {

		try {
			// 1、ResultSet executeQuery(String sqlString)：执行查询数据库的SQL语句，返回一个结果集（ResultSet）对象。
			System.out.println("sql:" + sql);
			ResultSet rs = stmt.executeQuery(sql);
			// 2、int executeUpdate(String sqlString)：用于执行INSERT、UPDATE或DELETE语句以及SQL DDL语句，
			//如：CREATE TABLE和DROP TABLE等   
			//int rows = pstmt.executeUpdate("INSERT INTO ...");
			// 3、execute(sqlString):用于执行返回多个结果集、多个更新计数或二者组合的语句。
			//boolean flag = pstmt.execute(sql);

			//使用结果集（ResultSet）对象的访问方法获取数据：   
			while (rs.next()) {
				String name = rs.getString("name");
				String description = rs.getString(3); // 此方法比较高效   
				System.out.println("名字:" + name);
				System.out.println("描述:" + description);
			}

		} catch (SQLException ex) {
			System.out.println("执行SQL语句失败！002");
			ex.printStackTrace();
			Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
