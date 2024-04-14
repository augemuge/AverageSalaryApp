import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

class FindAverageSalaryApp{

    public void findAverageSalary(List<Employee> employees){

        Map<String, Map<String, Double>> result = generateAverageSalary(employees);

        result.forEach((empOfficeLocation, empDesignationMap) -> {
            empDesignationMap.forEach((empDesignation, empAvgSalary) -> {
                System.out.printf("%s --> %s --> %.2f%n", empOfficeLocation, empDesignation, empAvgSalary);
            });
        });
    }

    public Map<String, Map<String, Double>> generateAverageSalary(List<Employee> employees) {
        Map<String, Map<String, List<Employee>>> employeesByLocationAndDesignation = employees.stream()
                .collect(Collectors.groupingBy(Employee::getOfficeLocation,
                        Collectors.groupingBy(Employee::getDesignation)));

        Map<String, Map<String, Double>> result = new ConcurrentHashMap<>();
        employeesByLocationAndDesignation.forEach((officeLocation, designationMap) -> {
            Map<String, Double> avgSalaryMap = new ConcurrentHashMap<>();
            designationMap.forEach((designation, employeeList) -> {
                double avgSalary = employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
                avgSalaryMap.put(designation, avgSalary);
            });
            result.put(officeLocation, avgSalaryMap);
        });

        return result;
    }
}