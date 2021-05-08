package CoreJava;

public class minimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int min=a[0][0];
		int minclm = 0;
		for( int i=0;i<=1;i++)
			
		{
			for(int  j=0;j<=1;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					
				}
			}
		}
		
		System.out.println(min );
		System.out.println(minclm);
		
		methods m=new methods();
		m.hello();
		System.out.println(m.i);
		
	}

}
