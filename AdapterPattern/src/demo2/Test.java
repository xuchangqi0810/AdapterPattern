package demo2;

public class Test {

	public static void main(String[] args) {
		
		Target target1=new ConcreteTarget();
		target1.request();
		
		Target target2=new Adapter(new Adaptee());
		target2.request();
	}
}
