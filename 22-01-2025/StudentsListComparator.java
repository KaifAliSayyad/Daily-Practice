import java.util.*;
public class StudentsListComparator{
	public static void main(String[] args){
		TreeSet ts = new TreeSet(new RollNoSorterDesc());

		ts.add(new Student(11, "A", 5));
		ts.add(new Student(1, "B", 5));
		ts.add(new Student(12, "C", 6));
		ts.add(new Student(3, "D", 6));
		ts.add(new Student(13, "E", 7));
		ts.add(new Student(4, "F", 7));
		ts.add(new Student(18, "G", 8));
		ts.add(new Student(10, "H", 8));

		Iterator i = ts.iterator();
		while(i.hasNext()){
			System.out.println(i.next().toString());
		}
	}
}

class Student{
	int rollNo;
	String name;
	int std;
		
	public Student(int r, String n, int s){
		rollNo = r;
		name = n;
		std = s;
	}

	public String toString(){
		return "RollNo = "+rollNo+"\nName = "+name+"\nStandard = "+std;
	}
}

class RollNoSorterDesc implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return new Integer(s1.rollNo).compareTo(s2.rollNo) * -1;
	}
}