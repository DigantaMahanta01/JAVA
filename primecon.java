public class primecon
{
    int n;
    primecon()
    {
        n=0;
    }
    void input(int x)
    {
        n=x;
    }
    void display()
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c=c+1;
        }
        if(c==2)
        {
            System.out.print("It is a Prime number");
        }
        else
        {
            System.out.print("It isn't a prime Number");
        }
    }
}