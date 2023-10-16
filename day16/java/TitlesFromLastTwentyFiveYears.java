import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TitlesFromLastTwentyFiveYears {
	public static void main(String[] args) throws Exception {
		String sql= "select title, pubdate from titles where pubdate >= DATEADD(year, -25, GETDATE())";
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString(1));
		}
		rs.close();
		st.close();
		c.close();
	}
}
