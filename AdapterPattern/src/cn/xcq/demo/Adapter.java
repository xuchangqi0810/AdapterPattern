package cn.xcq.demo;

//�������࣬ʵ�ֱ�׼�ӿ�
public class Adapter implements Target{
	
	//ע��Ҫ����Ķ���
	private Adaptee adaptee;
	
	
	//��д���ι���
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}
	
	
	//ʵ�ַ���
	@Override
	public void request() {
		//���ø���ķ���ʵ�ֹ���
		adaptee.specificRequest();
	}
}
