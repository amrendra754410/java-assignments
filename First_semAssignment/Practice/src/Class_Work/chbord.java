package Class_Work;
import java.util.*;
public class chbord {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the row: ");
	int i=sc.nextInt();
	System.out.print("Enter the colum: ");
	char c=sc.next().charAt(0);
	int s=i+(int)c;
	if(s%2==0) 
		System.out.println("Black");
	else 
		System.out.println("White");
	
}
}
