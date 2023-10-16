//Delete rows from title author for author with first_name as dean.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DeleteRows {
	public static void main(String[] args) throws Exception {
		String sql= "delete from titleauthor where au_id IN (select au_id from authors where au_fname = 'Dean')";
		Connection c = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database = pubs;user=sa;password=<YourStrong@Passw0rd>;database= pubs;encrypt=true;trustServerCertificate=true");
		Statement st = c.createStatement();
		System.out.println(st.execute(sql));
		st.close();
		c.close();
	}
}
