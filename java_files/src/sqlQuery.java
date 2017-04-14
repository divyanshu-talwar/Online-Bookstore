import java.sql.*;
import javax.swing.*;
public class sqlQuery {
	public sqlQuery(String s){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","02015028");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(s);
			int i = 0;
			String [][] data = new String [11][3];
			while(rs.next()){
				data[i][0] = rs.getString(1);
				data[i][1] = rs.getString(2);
				data[i][2] = rs.getString(3);
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));//adjust this accordingly
			}
			String []columns = { "something", "result", "something"};
			JTable table = new JTable(data, columns);
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}