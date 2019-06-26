package sample;

public class ff {
	public static void main(String[] ar)
	{
	if(ar.length==0)
	{
	System.out.println("enter an integer");
	}
	else
	{
	int n=Integer.parseInt(ar[0]);
	int i,j;
	for(i=0;i<n;i++)
	{
	for(j=0;j<=i;j++)
	{
	System.out.print("* ");
	}
	System.out.print("\n");
	}
	}
	}

}
