package sample;

public class primecomp {
	public static void main (String[] ar)
	{
		if(ar.length==0)
		{
		System.out.println("enter an integer");
		}
		else
		{
		int n=Integer.parseInt(ar[0]);
		int i,nn=0;
		if(n==1 || n==0)
		{
		System.out.println(n+" is neither prime nor composite");
		}
		else if(n>=1)
		{
		for(i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		nn++;
		}
		}
		if(nn==2)
		{
		System.out.println(n+" is a primenumber");
		}
		else
		{
		System.out.println(n+" is not a primenumber");
		}
		}
		}
	}

}
