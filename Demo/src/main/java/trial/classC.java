package trial;
import trial.classA;

public class classC extends classA{
	public void print() {
		System.out.println("world");
}
	public static void main(String args[]) {
		classC ob = new classC();
		ob.print();
		
		
	}

}
