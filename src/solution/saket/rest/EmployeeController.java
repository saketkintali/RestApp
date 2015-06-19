package solution.saket.rest;



import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import solution.saket.dao.EmployeeDAO;
import solution.saket.exceptions.AppException;
import solution.saket.model.Employee;


@Path("/employee")
public class EmployeeController {
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	
	public AppResponse getAll() throws SQLException {
		
		AppResponse resp = new AppResponse();
		
		try {
			EmployeeDAO dao = new EmployeeDAO();
			List<Employee> empList = dao.getAll();
			resp.setPayload(empList);
		} catch (AppException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setStatus(AppResponse.ERROR);
			resp.setMessage(e.getMessage());
		}
		
		return resp;
	}
	@GET
	@Path("/add")
	public String addPerson() {
		return "added";
	}

}
