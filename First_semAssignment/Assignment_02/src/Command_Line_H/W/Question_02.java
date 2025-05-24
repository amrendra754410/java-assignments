package Command_Line_H.W;

public class Question_02 {
	public static void main(String args []) {
		double r=Double.parseDouble(args[0]);
		double h=Double.parseDouble(args[1]);
		double area=(Math.PI*r*r)+(2*Math.PI*r*h);
		System.out.println(area);
		
		
	}

}
