package inc.codeman.jdbc.demo;
import java.sql.*;

public class DemoDML {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
		String userName = "user";
		String password = "pass";
		Connection con = DriverManager.getConnection(url,userName,password);
		String sql = "insert into myTable values(4,'Pari Mohan',12,'d')";
		Statement stmt = con.createStatement();
		int res = stmt.executeUpdate(sql);
		System.out.println(res+ " rows inserted");	
		int id =5;
		String name="Prem Kumar";
		int classNo = 12;
		String section ="a";
		String query = "insert into myTable values(?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, classNo );
		pstmt.setString(4, section);
		int res1 = pstmt.executeUpdate();
		System.out.println(res1+ " rows inserted");
		stmt.close();
		pstmt.close();
		con.close();
	}

}
