package random;

public class Generics<T> {
	public static void main(String[] args) {
		Box<Integer> box= new Box();
		box.setVar(123);
		System.out.println(box.getVar());
		System.out.println("generic method :"+getVal(box).getVar());
	}
	
	public static <R> R getVal(R a) {
		return a;
	}

}
