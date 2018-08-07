package cn.xcq.demo;

//具体目标类，只提供普通功能
public class ConcreteTarget implements Target{

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("普通类 不具有特殊功能");
	}
}
