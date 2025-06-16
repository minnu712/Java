
public class Student {
	String name;
	int age;
	static String course = "Btech";
    Student(String name, int age){
    	this.name = name;
    	this.age = age;
    	
    }
    public void print() {
    	System.out.println(name +" "+age+" "+course);
    	
}
    public static void main(String args[]) {
    	Student stu = new Student("Minnu",34);
    	stu.print();
    	Student stu1 = new Student("Raji",34);
    	stu1.print();
    	
    }

	
}