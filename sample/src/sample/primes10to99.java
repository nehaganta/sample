package sample;

public class primes10to99 {
	public static void main(String[] ar)
	{
	int i,j,nn=0;
	for(i=10;i<=99;i++)
	{
	nn=0;
	for(j=1;j<=99;j++)
	{
	if(i%j==0)
	{
	nn++;
	}
	}
	if(nn==2)
	{
	System.out.print(i+" ");
	}
	}
	}

}
