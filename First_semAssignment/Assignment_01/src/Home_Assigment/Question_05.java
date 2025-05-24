package Home_Assigment;

public class Question_05 {
	public static void main(String[] args) {
		//With other Variable
		int W =1; //1
		int G =2;   //2
		int K =3;  //3
		int A =4;   //4
		//String X;
		System.out.println("Before Exchange");
		System.out.println("W:"+W+" G:"+G+" K:"+K+" A:"+A);
		/*X=W;
		W=A;
		A=K;
		K=G;
		G=X;*/
		W=W+G+K+A;
		G=W-G-K-A;
		K=W-G-K-A;
		A=W-G-K-A;
		W=W-K-A-G;
		System.out.println("After Exchange");
		System.out.println("W:"+W+" G:"+G+" K:"+K+" A:"+A);
		//Without other Variable
		
	}

}
