package demo2;

public class Adapter implements Target{
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.a();
	}

}
