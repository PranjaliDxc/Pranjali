package dxc.LeaveManagementProject;

import java.sql.Connection;

public class Test {
	public static void main(String[] args) {
		Connection con = ConnectionHelper.getConnection();
		System.out.println("Connected...");
		
		EmployeeDAO dao = new EmployeeDAO();
		Employee[] res = dao.showEmploy();
		for (Employee employee : res) {
			System.out.println(employee.getEmpId());
		}
		System.out.println();
		
		Employee e = dao.searchEmploy(1000);
		System.out.println(e.getEmpDptName());
	}
}
