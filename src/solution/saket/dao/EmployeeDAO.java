package solution.saket.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import solution.saket.model.Employee;
import solution.saket.utils.DBUtil;

public class EmployeeDAO {
	
	public List<Employee> getAll() throws SQLException {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Connection con = DBUtil.connectToDB();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		ResultSet ns = null;
		
		ps = (PreparedStatement) con.prepareStatement("SELECT * FROM employee");
		
		rs = ps.executeQuery();
		
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt("ID"));
			emp.setFirstName(rs.getString("FIRST_NAME"));
			emp.setLastName(rs.getString("LAST_NAME"));
			emp.setPhone(rs.getString("PHONE"));
			emp.setCity(rs.getString("CITY"));
			emp.setState(rs.getString("STATE"));
			
			empList.add(emp);
				
		}
		
		return empList;
		
	}

}
