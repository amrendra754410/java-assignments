package Class_Work;
import java.util.Scanner;
public class Question_02 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int[] input=new int[101];
		System.out.println("Enter tye number between 1 to 100 ");
		while(true) {
			int number=sc.nextInt();
			if(number==0) {
				break;
			}
			
			
			if(number>0 && number<=100) {
				input[number]++;    //input[number]=input[number]+1;		
			}
		}
		for(int i=0; i<input.length;i++) {
			if(!(input[i]==0)) {
				System.out.println(i+" occurs "+input[i]+(input[i]>1 ? " times":" time"));
				
			}
		}
		
	}

}
	