package inc.codeman.jdbc.demo;
import java.sql.*;

public class DemoDql {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String userName = "user";
		String password = "pass";
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement stmt = con.createStatement();
		String sql = "select * from myTable where class = 12";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		}
		rs.close();
		stmt.close();
		con.close();
	}

}
