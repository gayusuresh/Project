import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7462new","root","root");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("update personinfo set address=? where personid=?");
		
		
		statement.setString(1, "HYD");
		statement.setInt(2, 12);
		statement.executeUpdate();
		con.close();
		System.out.println("updated successfully");

	}

}
