package CoreJava;

import java.util.Scanner;

public class arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to store");
		int n= s.nextInt();
		int a[]=new int[10];
		int i;
		System.out.println("Enter numbers");
		for( i=0;i<=n;i++)
		{
			
			a[i]=s.nextInt();
			
			
		}
		System.out.print("numbers are");
		for(i=0;i<=n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
