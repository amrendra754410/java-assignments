package Class_problem;
class Box<T>{
	T item;
	Box(T item){
		this.item=item;
	}
	void getitem() {
		System.out.println("Get item: "+item);
	}
}
public class Q4 {
	public static void main(String[] args) {
		Box b1=new Box("Ayush");
		b1.getitem();
		Box b2=new Box(051);
		b2.getitem();
	}

}
