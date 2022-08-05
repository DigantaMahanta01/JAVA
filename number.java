import java.util.*;
class number
{
    private int num;
    
    number(int x)
    {
        num=x;
    }
    int reverse(int n)
    {
       int rev=0,d,t;
       t=n;
       while(n!=0)
       {
           d=n%10;
           rev=rev*10+d;
           n=n/10;
        }
        return rev;
    }
    void palindrome()
    {
        int k,p;
        p=num;
        k=reverse(p);
        if(p==k)
        {
     System.out.println("palindrome number ");
     }
     else 
     {
     System.out.println("not palindrome"); 
     }
    }
} 