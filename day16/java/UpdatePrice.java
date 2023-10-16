//Update the price of the book BU1111 with the Price of book MC2222.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class UpdatePrice {
	public static void main(String[] args) throws Exception {
		String sql= "update titles set price = (select price from titles where title_id = 'MC2222') where title_id = 'BU1111'";
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st = c.createStatement();
		System.out.println(st.execute(sql));
		st.close();
		c.close();
	}
}
