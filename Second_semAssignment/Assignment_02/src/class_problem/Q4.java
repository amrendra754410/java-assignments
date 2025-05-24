package class_problem;

class Deposit{
	long principal;
	int time;
	double rate;
	double total_amt;
	Deposit(){
		principal = 10000;
		time = 10;
		rate = 5;
	}
	Deposit(long principle,int time,double rate){
		this.principal=principle;
		this.time=time;
		this.rate=rate;
	}
	Deposit(long principle,int time){
		this.principal=principle;
		this.time=time;
		rate = 5;
	}
	Deposit(long principle,double rate){
		this.principal=principle;
		this.rate=rate;
		time = 10;
	}
	void display() {
		System.out.println("Principle: "+principal);
		System.out.println("Time: "+time);
		System.out.println("Rate: "+rate);
	}
	void calc_amt() {
		double Total_amt = principal+(principal*rate*time)/100;
		System.out.println("Totak amount: "+ Total_amt);
	}
}
public class Q4 {
	public static void main(String args []) {
		Deposit d=new Deposit(1000, 12, 5);
		d.calc_amt();
		d.display();
		System.out.println("------------------------");
		Deposit d1=new Deposit(1000, 12);
		d1.calc_amt();
		d1.display();
		System.out.println("------------------------");
		Deposit d2=new Deposit(1000, 5.0);
		d2.calc_amt();
		d2.display();
	}

}
