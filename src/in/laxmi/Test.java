package in.laxmi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
	
	List<Employee> employeeList = new ArrayList<Employee>();
    
	employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
	employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
	employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
	employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
	employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
	employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
	employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
	employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
	employeeList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
	employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
	employeeList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
	employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
	employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
	employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
	employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
	employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

       Map<String, Long> map1=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
       employeeList.stream().map(Employee::getDepartment).distinct().forEach(name->System.out.println(name));
	   Map<String,Double> map2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
	   employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
	   employeeList.stream().filter(e->e.yearOfJoining > 2015).map(e->e.name).forEach(name->System.out.println(name));
	   employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
	   employeeList.stream().filter(e->e.getGender().equals("Male") && e.getDepartment().equals("Development")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
	  employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
	
	}
}
