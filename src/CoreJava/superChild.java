package CoreJava;

public class superChild extends superParent {
	public void store()
	{
		String name="manjinder";
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	superChild sc=new superChild();
	sc.store();
	}
	}