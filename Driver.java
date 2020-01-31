import java.sql.*;

import javax.xml.transform.Result;
public class Driver {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/day3exercise", "root", "password");
			Statement stmt = con.createStatement();
			String sqlStatement = "DROP TABLE new_table1;";
			Boolean result = stmt.execute(sqlStatement);
			System.out.println(result.booleanValue());
			/*ResultSetMetaData rsmd = result.getMetaData();*/
			/*System.out.println(rsmd);*/
			/*while(result.next())
			{
				System.out.println(result.getRow());
			}*/
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
