package test;

public class Fibonacci {
	public static void main(String[] args)
	{
		int n=200;
		for(int i=1;i<=n;i++)
		{
			System.out.print("Fibonacci.of("+i+")  "+Fibonacci.of(i)+'\n');
			
		}
	}
	public static int of(int n)
	{
		int []a=new int[n+1];
		a[0]=a[1]=1;
		for(int j=2;j<n;j++)
		{
			a[j]=a[j-1]+a[j-2];
		}
		return a[n-1];
		
	}

}
