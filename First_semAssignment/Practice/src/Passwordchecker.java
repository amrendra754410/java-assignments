import java.util.Scanner;
public class Passwordchecker {
	public static boolean passwordcheck(String password) {
		boolean lengthvaild = false;
		boolean atleast2dig = false;
		boolean hasspecialchar = false;
		int count = 0;
		
		for (int i =0; i<password.length(); i++) {
			if(!(Character.isLetterOrDigit(password.charAt(i)))){
				hasspecialchar = true;
			}
			if (Character.isDigit(password.charAt(i))) {
				count++;
			}
		}
		
		if (password.length()>8 && count>=2) {
			lengthvaild = true;
			atleast2dig = true;
		}
		
		
		
		
		return lengthvaild&&atleast2dig&&!hasspecialchar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String password = sc.nextLine();
		
		if (passwordcheck(password)) {
			System.out.println("Password Vaild");
		}else {
			System.out.println("Password Invaild");
		}
	}

}
