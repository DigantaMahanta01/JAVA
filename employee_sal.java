class employee_sal
{
    String name,empno;
    int basic;
    double da,hra,pf,gross,net;
    employee_sal(String x, String y, int z);
    {
        name=x;
        empno=y;
        basic=z;
    }
    void compute()
    {
        da=basic*30.0/100.0;
        hra=basic*15.0/100.0;
        pf=basic*12.0/100.0;
        gross=basic+da+hra;
        net=gs-pf;
    }
    void display()
    {
        System.out.println("Name"+name);
        System.out.println("Employee Number"+empno);
        System.out.println("Basic"+basic);
        System.out.println("Gross"+gross);
        System.out.println("Net"+net);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        string a,b;
        int c;
        System.out.println("Enter a name:");
        a=in.next();
        System.out.println("Enter Employee Number:");
        b=in.next();
        System.out.println("Enter a Basic:");
        c=in.nextInt();
        obj.employee_sal = new employee_sal(a,b,c);
        obj.compute();
        obj.display();
    }
}