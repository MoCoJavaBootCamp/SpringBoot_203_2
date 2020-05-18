/* Employee.java */
public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	private String dob;
}

/* HomeController.java */

@Controller
public class HomeController {
	@GetMapping("/employeeform")
	public String loadFormPage(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeform";
	}
	
	@PostMapping("/employeeform")
	public String loadFromPage(@ModelAttribute Employee employee, Model model) {
		model.addAttribute("employee", employee);
		return "confirmemployee";
	}
}

/* employeeform.html */
<!DOCTYPE html>
<html lang="en" xmlns:th="www.thymeleaf.org">
<head>
<title>Employee Form</title>
</head>
<body>
	<form action="#" th:action="@{/employeeform}" th:object="${employee}" method="post">
		First Name: <input type="text" th:field="*{firstName}" /><br />
		Last Name: <input type="text" th:field="*{lastName}" /><br />
		Social Security Number: <input type="number" th:field="*{ssn}" /><br />
		Date of Birth: <input type="text" th:field="*{dob}" /><br />
	</form>
</body>


/* confirmemployee.html */
<!DOCTYPE html>
<html lang="en" xmlns:th="www.thymeleaf.org">
<head>
<title>Confirm Employee</title>
</head>
<body>
	<p th:inline="text">>
		The first name was [[${employee.firstName}]].<br />
		The last name was [[${employee.lastName}]].<br />
		The SSN name was [[${employee.ssn}]].<br />
		The DOB name was [[${employee.dob}]].<br />
	</p>
</body>
