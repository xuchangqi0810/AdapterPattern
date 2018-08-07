package cn.xcq.demo;

//测试类
public class Client {

	public static void main(String[] args) {
		//使用普通类功能
		Target target=new ConcreteTarget();
		target.request();
		
		//特殊类，具有特殊功能
		Target target2=new Adapter(new Adaptee());
		target2.request();
	}
}
