package cn.xcq.demo;

//������
public class Client {

	public static void main(String[] args) {
		//ʹ����ͨ�๦��
		Target target=new ConcreteTarget();
		target.request();
		
		//�����࣬�������⹦��
		Target target2=new Adapter(new Adaptee());
		target2.request();
	}
}
