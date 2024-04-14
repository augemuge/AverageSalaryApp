import java.util.ArrayList;
import java.util.List;

public class SampleApp {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
		// Sample input for employees list as:
        employees.add(new Employee("Ashish", "A", "IT", "Pune",
                "Software Engineer", 10000.0));
        employees.add(new Employee("Amit", "R", "HR", "Pune",
                "Recruiter", 12000.0));
        employees.add(new Employee("Ramesh", "D", "HR", "Pune",
                "Senior Recruiter", 14000.0));
        employees.add(new Employee("Jaya", "S", "IT", "Pune",
                "Tech Lead", 15000.0));
        employees.add(new Employee("Smita", "M", "IT", "Bangalore",
                "Recruiter", 16000.0));
        employees.add(new Employee("Umesh", "A", "IT", "Bangalore",
                "Software Engineer", 12000.0));
        employees.add(new Employee("Pooja", "R", "HR", "Bangalore",
                "Software Engineer", 12000.0));
        employees.add(new Employee("Ramesh", "D", "HR", "Pune",
                "Recruiter", 16000.0));
        employees.add(new Employee("Bobby", "S", "IT", "Bangalore",
                "Tech Lead", 20000.0));
        employees.add(new Employee("Vipul", "M", "IT", "Bangalore",
                "Software Engineer", 14000.0));

        FindAverageSalaryApp app = new FindAverageSalaryApp();
        app.findAverageSalary(employees);

    }
}
