import java.util.*;
public class prime
{
    int check(int n)
    {
        int i,c=0,f=0;
        for(i=1;i<=n;i++)
        {
            if (n%i==0);
            c=c+1;
        }
        if (c==2)
        f=1;
        return f;
    }
    public static void main(String args[])
    {
        int a,k;
        Scanner n= new Scanner(System.in);
        System.out.print("Enter a Number:");
        a= n.nextInt();
        prime ob=new prime();
        k=ob.check(a);
        {
        if(k==1)
            System.out.print("The number is Prime");
        else
            System.out.print("The Number isn't Prime");
        }
    }
}