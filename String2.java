import java. util.*;
class String2
{
    public static void main(String args[])
    {
        String st,st1="";
        int p,i,a;
        char chr, chr1;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        st = n.nextLine();
        p = st.length();
        for(a =0; a<p; a++)
        {
            chr = st.charAt(a);
            if(chr>='a' && chr<='z')
            {
                chr1 = Character.toUpperCase(chr);
                st1=st1+chr1;
            }
            else if(chr>='A' && chr<='Z')
            {
                chr1 = Character.toLowerCase(chr);
                st1=st1+chr1;
            }
            else 
            st1 = st1+chr;
        }
        System.out.println("The new string is");
        System.out.println(st1);
    }
}