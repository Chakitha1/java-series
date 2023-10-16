//Display publishers who published books by author who wrote more than 2 titles.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class MoreThanTwoTitles {
	public static void main(String[] args) throws Exception {
		String sql= "select publishers.pub_name from publishers join titles on publishers.pub_id = titles.pub_id join titleauthor on titleauthor.title_id= titles.title_id group by publishers.pub_id, publishers.pub_name having count(titleauthor.title_id)>2";
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
