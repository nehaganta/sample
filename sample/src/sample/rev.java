package sample;

public class rev {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("enter an integer");
	}
	else
	{
	int num=Integer.parseInt(ar[0]);
	int r,sum=0;
	while(num>0)
	{
	r=num%10;
	sum=sum*10+r;
	num/=10;
	}
	System.out.println(sum);
	}
	}
	}


