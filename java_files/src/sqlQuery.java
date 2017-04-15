import java.sql.*;
import javax.swing.*;
public class sqlQuery {
	public void sqlQuery_update(String s){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","02015028");
			Statement statement = con.createStatement();
			int a = statement.executeUpdate(s);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			int columnsNumber = rsmd.getColumnCount();
//			System.out.println(columnsNumber);
			
//			String []columns = { "something", "result", "something"};
//			JTable table = new JTable(data, columns);
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("hi there");
		}
	}
	public String [][] sqlQuery_run(String s){
		String [][] data = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","02015028");
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(s);
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			System.out.println(columnsNumber);
			int i = 0;
			data = new String [30][columnsNumber];
			while(rs.next()){
				for(int j = 0; j<columnsNumber; j++){
					data[i][j] = rs.getString(j+1);
//					System.out.println(data[0][0]);
				}
				i++;
			}
			
//			String []columns = { "something", "result", "something"};
//			JTable table = new JTable(data, columns);
			con.close();
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("hi there");
		}
		return(data);
	}
}