import java.util.*;
import java.util.stream.*;

public class StreamDemo3{
	public static void main(String[] args){
		List<Emp> list = new ArrayList<Emp>();

		list.add(new Emp("Raju", 25, 30000, "TESTER"));
		list.add(new Emp("Sanju", 35, 60000, "PROGRAMMER"));
		list.add(new Emp("Manju", 45, 120000, "MANAGER"));
		list.add(new Emp("Rekha", 28, 35000, "TESTER"));
		list.add(new Emp("Surekha", 32, 90000, "PROGRAMMER"));
		list.add(new Emp("Dinesh", 31, 70000, "PROGRAMMER"));
		list.add(new Emp("Ganesh", 42, 150000, "MANAGER"));
		list.add(new Emp("Sunil", 22, 25000, "TESTER"));
		list.add(new Emp("Anil", 38, 65000, "PROGRAMMER"));
		list.add(new Emp("Daniel", 27, 40000, "TESTER"));
		list.add(new Emp("Amit", 54, 180000, "MANAGER"));
		list.add(new Emp("Hameed", 29, 75000, "PROGRAMMER"));

		//Now if we want to create a partion in result we can use partioningBy
		Map<Boolean, List<Emp>>  m1 = list.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30));
		System.out.println("Junior Employees (age <= 30)");
		m1.get(true).forEach(System.out::println);
		System.out.println("\nSenior Employees (age > 30)");
		m1.get(false).forEach(System.out::println);

		//to just find the number of junior and senior employees
		Map<Boolean, Long> m2 = list.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 30, Collectors.counting()));
		System.out.println("\nTotal number of Juinor Employees = "+m2.get(true));
		System.out.println("\nTotal number of Senior Employees = "+m2.get(false));
		
		//Now if we want to find how many employees under each designation, we cannot use .partitioningBy as it only accepts boolean conditions. Rather we can use .groupingBy
		Map<String, List<Emp>> m3 = list.stream().collect(Collectors.groupingBy(e -> e.getDesign()));
		System.out.print("\nGrouping Employees by Designation ");
		Set<String> keys = m3.keySet();
		for(String key : keys){
			System.out.println("\n"+key);
			m3.get(key).forEach(System.out::println);
		}

		//If we want to get only names of the employees then..
		System.out.println("\nCollecting only Employee names grouped by designations ");
		Map<String, List<String>> m4 = list.stream()
                .collect(Collectors.groupingBy(
                        Emp::getDesign, // Group by design
                        Collectors.mapping(Emp::getName, Collectors.toList()) // Collect names
                ));

        	// Print result
       		m4.forEach((design, names) -> System.out.println(design + ": " + names));
		

	}
}

class Emp{
	private String name;
	private int age;
	private int salary;
	private String design;
	
	public Emp(String n, int a, int s, String d){
		name = n ;
		age = a;
		salary  = s;
		design = d;
	}

	public String toString(){
		return "( Name = "+name+", Age = "+age+", Salary = "+salary+", Designation = "+design+" )";
	}

	public int getAge(){
		return age;
	}
	
	public String getDesign(){
		return design;
	}
	
	public String getName(){
		return name;	
	}
}