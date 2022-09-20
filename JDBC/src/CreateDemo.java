import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		//create the connection 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/7462new","root","root");
		//create the statement
		Statement s=con.createStatement();
		//query create
        String query="create table personinfo1(personid int primary key not null,pname varchar(34),address varchar(88))";
        //execute query
        s.execute(query);
        //closing the connection
        con.close();
        System.out.println("created");
 
	}

}
