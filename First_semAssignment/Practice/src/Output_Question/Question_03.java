package Output_Question;

public class Question_03 {
	public static void main(String args []) {
		int a=2,b=5,c;
		a=a*a++ - --a; 
		c=b++ - b--;
		System.out.println("a= "+a+",b="+b+",c="+c);
		System.out.println(a++ + ++a * a--);
		System.out.println(b=b++ * b--);
		System.out.println("a="+a+",b="+b+",c="+c);
	}
	
}
