import java.util.*;
class string1
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    int up=0,lc=0,d=0,spl=0,a,p;
    String st;
    char ch;
    System.out.println("Enter a String");
    st=in.nextLine();
    p=st.length();
        for(a=0;a<p;a++)
        {
            ch = st.charAt(a);
            if(ch>='a' && ch<='z')
               lc=lc+1;
            else if(ch>='A' && ch<='Z')
               up=up+1;
            else if(ch>='0' && ch<='9')
               d=d+1;
            else 
            spl=spl+1;
        }
        System.out.println("Enter a lower case charecter"+lc);
        System.out.println("Enter a upper case charecter"+up);
        System.out.println("Enter a digit"+d);
        System.out.println("Enter a special charecter"+spl);
    }
}