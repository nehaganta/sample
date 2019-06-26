package sample;

public class sumofnum {
	
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("enter a number");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int s,g;
	for(s=0;n>0;n/=10)
	{
	g=n%10;
	s=s+g;
	}
	System.out.println(s);
	}
	}
	}

