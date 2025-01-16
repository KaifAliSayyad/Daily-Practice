import java.io.*;

public class ImmutableClass{
	public static void main(String[] args){
		Student s1 = new Student(1, "Kaif", 12);
		Student s2 = new Student(2, "Kaif", 12);

		System.out.println(s1);
		System.out.println(s2);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1.equals(s2));
	
		System.out.println("____________________________________________________________________________");

		StudentWithSchoolName s3 = new StudentWithSchoolName(1, "Kaif", 12);
		StudentWithSchoolName s4 = new StudentWithSchoolName(2, "Kaif", 12);

		System.out.println(s3);
		System.out.println(s4);

		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println(s3.equals(s4));
	}

}

/*

final class Student implements Serializable{
	private final int rollNo;
	private final String name;
	private final int standard;

	public Student(int rollNo, String name, int standard){
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}

		
	public int getRollNo(){
		return rollNo;
	}

	public String getName(){
		return name;
	}

	public int getStandard(){
		return standard;
	}

	@Override
	public String toString(){
		return "RollNo : "+rollNo+", Name : "+name+", Standard : "+standard;
	}

	@Override
	public int hashCode(){
		return rollNo;
	}

	
	public boolean equals(Student s){
		return (this.rollNo == s.rollNo && this.name == s.name && this.standard == s.standard);
	}
}

*/

/*
By creating our own Immutable Class using method is tiresome work and writing a lots of code. Therefore, in Java 17, we have something called as "record" keyword for doing this work for us
*/

record Student(int rollNo, String name, int standard){}
//This above type of constructor is called as "canonical" constructor

/*
Further suppose if I have a condition where I want to add school name as an attribute which is common for all the students. We can create our own constructor.
******Extra attributes which are added should be declared 'static'****
***Also while creating our own constructors we need to explicitly call "this()" inside our parametrised construtor to call default constructor, it does not call by itself, as in normal classes***
*/

record StudentWithSchoolName(int rollNo, String name, int standard){
	static String schoolName;

	StudentWithSchoolName(int rollNo, String name, int standard){
		schoolName = "SPIT";
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}

	public final String toString(){
		return "RollNo : "+rollNo+", Name : "+name+", Standard : "+standard;
	}
}