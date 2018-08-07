package cn.xcq.demo;

//适配器类，实现标准接口
public class Adapter implements Target{
	
	//注入要适配的对象
	private Adaptee adaptee;
	
	
	//重写带参构造
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	
	
	//实现方法
	@Override
	public void request() {
		//调用父类的方法实现功能
		adaptee.specificRequest();
	}
}
