package solution.saket.rest;



import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import solution.saket.dao.EmployeeDAO;
import solution.saket.model.Employee;


@Path("/employee")
public class EmployeeController {
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	
	public List<Employee> getAll() throws SQLException {
		
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> empList = dao.getAll();
		
		return empList;
	}
	@GET
	@Path("/add")
	public String addPerson() {
		return "added";
	}

}
