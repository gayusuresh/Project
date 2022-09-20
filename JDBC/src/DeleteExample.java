import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7462new","root","root");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("delete from personinfo where personid=?");
		
		
		
		statement.setInt(1, 12);
		statement.executeUpdate();
		con.close();
		System.out.println("deleted successfully");

	}

}
