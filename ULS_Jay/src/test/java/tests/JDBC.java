package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@imalcs";
		String userName = "IMAL145_QC_O19";
		String password = "IMAL145_QC_O19";
		List<String> listOfOptName = new ArrayList<>();
		Connection connection = DriverManager.getConnection(url, userName, password);
		Statement stmt = connection.createStatement();
		String optName = "A002MA";
		String prgRef="";
		String idPrefix="_selenuim";
		
		while (true) {
			
			String stringQuery="select prog_ref,app_name, parent_ref, prog_order, menu_title_eng, disp_order from opt where prog_ref = '"+optName+"' and app_name = 'RET'";
			System.out.println(stringQuery);
			ResultSet executeQuery = stmt.executeQuery(stringQuery);
			while (executeQuery.next()) {
				optName = executeQuery.getString("PARENT_REF");
				prgRef = executeQuery.getString("PROG_REF");
				listOfOptName.add(idPrefix+prgRef);
			}
			if (optName.equals("ROOT"))
			{
				System.out.println("Prog Ref "+prgRef);
				System.out.println("Opt name "+optName);
				
				break;
			}
			
		}

	
		System.out.println(listOfOptName.size());
		for (String string : listOfOptName) {
			System.out.println("From List "+string);
		}
		connection.close();
	}

}
