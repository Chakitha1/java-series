//create a view to contain title, publisher, year of publishing, price and type. Make sure when price is null display dero and type is null display Zero.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class PubDeetsView {
	public static void main(String[] args) throws Exception {
		//String sql= "create view ImaginaryTablee(title, publisher, year_of_publishing, price, type) as select title, isnull(pub_name, 'Zero') as publisher, year(pubdate) as year_of_publishing, isnull(convert(varchar, price), 'Zero') as price, isnull(type, 'Zero') as type from titles left join publishers ON titles.pub_id = publishers.pub_id";
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st = c.createStatement();
//		ResultSet rs = st.executeQuery(sql);
		String sql2="select * from ImaginaryTablee";
		ResultSet rs = st.executeQuery(sql2);
		while (rs.next()) {
			System.out.println(rs.getString(1)+rs.getString(2)+rs.getInt(3)+rs.getString(4)+rs.getString(5));
		}
		rs.close();
		st.close();
		c.close();
	}
}
