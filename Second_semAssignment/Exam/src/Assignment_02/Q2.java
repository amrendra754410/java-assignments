package Assignment_02;
import java.util.*;
class Complex{
	int real;
	int imag;
	void setData(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	void display() {
		System.out.println(real+" + "+imag+"i");
	}
	public Complex add(Complex c1, Complex c2) {
		Complex result = new Complex();
		result.real=c1.real+c2.real;
		result.imag=c1.imag+c2.imag;
		return result;
	}
	
}
public class Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Complex c1=new Complex();
		c1.setData(5, 10);
		c1.display();
		Complex c2=new Complex();
		c2.setData(10, 50);
		c2.display();
		Complex add=new Complex();
		add = c1.add(c1, c2);
		add.display();
		
	}
}
