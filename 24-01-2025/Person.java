import java.io.Serializable;

public class Person implements Serializable{

	static String name;
	//transient int age;
	int age;

	public String toString(){
		return ("Name :"+name+"\nAge : "+age+"\n");
	}
}