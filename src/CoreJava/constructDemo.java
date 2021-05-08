package CoreJava;

public class constructDemo {
	static int a;
	static int b;
	public constructDemo(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("hey");
	}
	
	public void getdata()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructDemo cd=new constructDemo(10,20);
		/*a=10;
		b=20;*/
		
		cd.getdata();
	}

}
