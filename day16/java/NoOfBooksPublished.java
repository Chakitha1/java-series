//Create a view to display publisher name, city, and no of books published.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class NoOfBooksPublished {
	public static void main(String[] args) throws Exception {
		String sql= "create view ViewTablee(title, publisher, year_of_publishing, price, type) as select title, isnull(pub_name, 'Zero') as publisher, year(pubdate) as year_of_publishing, isnull(convert(varchar, price), 'Zero') as price, isnull(type, 'Zero') as type from titles left join publishers ON titles.pub_id = publishers.pub_id";
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st = c.createStatement();
//		ResultSet rs = st.executeQuery(sql);
		String sql2="select * from ViewTablee";
		ResultSet rs1 = st.executeQuery(sql2);
		while (rs1.next()) {
			System.out.println(rs1.getString(1)+rs1.getString(2)+rs1.getInt(3)+rs1.getString(4)+rs1.getString(5));
		}
		rs1.close();
		st.close();
		c.close();
	}
}
