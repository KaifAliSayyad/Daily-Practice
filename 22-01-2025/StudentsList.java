import java.util.*;

public class StudentsList{
	public static void main(String args[]){
		HashSet hs = new HashSet();
	
		hs.add(new Student(1, "A", 1));
		hs.add(new Student(2, "B", 1));
		hs.add(new Student(3, "C", 2));
		hs.add(new Student(4, "D", 2));
		hs.add(new Student(5, "E", 3));
		hs.add(new Student(6, "F", 3));
		hs.add(new Student(7, "G", 4));
		hs.add(new Student(8, "H", 4));
		hs.add(new Student(9, "I", 5));

		//Adding duplicate Object
		hs.add(new Student(1, "X", 1));

		Iterator i = hs.iterator();
		System.out.println("From HashSet : ");
		while(i.hasNext()){
			System.out.println(i.next().toString()+"\n");
		}

		System.out.println("_________________________________________________________");
		TreeSet ts = new TreeSet();
		ts.add(new Student(1, "A", 1));
		ts.add(new Student(2, "B", 1));
		ts.add(new Student(3, "C", 2));
		ts.add(new Student(4, "D", 2));
		ts.add(new Student(5, "E", 3));
		ts.add(new Student(6, "F", 3));
		ts.add(new Student(7, "G", 4));
		ts.add(new Student(8, "H", 4));
		ts.add(new Student(9, "I", 5));

		//Adding duplicate Object
		ts.add(new Student(1, "X", 1));

		Iterator i1 = ts.iterator();
		System.out.println("From TreeSet : ");
		while(i1.hasNext()){
			System.out.println(i1.next().toString()+"\n");
		}

	}
}

class Student implements Comparable{
	int rollNo;
	String name;
	int standard;

	public Student(int rollNo, String name, int standard){
		this.rollNo = rollNo;
		this.name = name;
		this.standard = standard;
	}

	public String toString(){
		return "RollNo = "+rollNo+"\nName = "+name+"\nStandard = "+standard;
	}

	/* Overriding methods in Object class for custom logic, we need to override both equals and hashcode methods. */
	public boolean equals(Object obj){
		Student s = (Student)obj;
		return ((this.rollNo == s.rollNo) && (this.standard == s.standard));

	}

	public int hashCode(){
		return standard;
	}


	/* Overriding equals() and hashCode() does not work while using TreeSet as it uses compare() and compareTo() method of Comparable interface to compare two objects. So we'll see to implement compareTo() */

	public int compareTo(Object obj){
		Student s = (Student)obj;
		return Integer.compare(this.rollNo, s.rollNo);
	}
	
}