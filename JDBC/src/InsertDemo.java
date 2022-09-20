import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7462new","root","root");
		
		//create the statement
		PreparedStatement statement =con.prepareStatement("insert into personinfo1 values(?,?,?)");
		statement.setInt(1, 12);
		statement.setString(2,"gayathri");
		statement.setString(3, "kknagar");
		statement.executeUpdate();
		con.close();
		System.out.println("inserted successfully");

	}

}
