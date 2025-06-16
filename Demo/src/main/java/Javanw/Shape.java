package Javanw;

public class Shape {
	public static void main(String args[]) {
		/*Traingle tr = new Traingle();
		tr.showShape();
		Reactangle rc = new Reactangle();
		rc.showShape();
	}

}
*/
		GraphicObject obj = new Traingle();
		obj.showShape();
		GraphicObject obj1 = new Reactangle();
		obj1.showShape();//upcasting method.........this method works only on inheritance...
	}
}