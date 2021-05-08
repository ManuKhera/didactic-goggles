package CoreJava;

public class canadaTraffic implements centeraltraffic,indianTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centeraltraffic c=new canadaTraffic();
		c.greenGo();
		c.redstop();
		c.Flashyellow();
		canadaTraffic a=new canadaTraffic();
		a.symbol();
		indianTraffic i=new canadaTraffic();
		i.train();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("you can go");
	}

	@Override
	public void Flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("slow domn and stop");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("must stop");
	}
	public void symbol()
	{
		System.out.println("always see symbols"+a);
	}

	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println("train symbols"+a);
	}

}
