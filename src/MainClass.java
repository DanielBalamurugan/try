import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost:3306/sathya";
        Class.forName(myDriver);
        Connection conn = DriverManager.getConnection(myUrl, "root", "");
        System.out.println("");
        conn.close();
	}
}
