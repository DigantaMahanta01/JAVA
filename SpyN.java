import java.util.*;
public class SpyN
{
    static int n,product=1,sum=0,ld;
    void enter(int n)
    {
    while(n>0)
    {
	ld=n%10;
	sum=sum+ld;
	product=product*ld;
	n=n/10;
    }
    if(sum==product)
	System.out.println("Given number is spy number");
    else
	System.out.println("Given number is not spy number");
}

public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter any number:");
    n=in.nextInt();
    SpyN obj = new SpyN();
    obj.enter(n);
    }
}