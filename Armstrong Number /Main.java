import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        int  nu, num=0, rem;
        Scanner in = new Scanner(System.in);
	    int  n = in.nextInt();
        nu = n;
	    while(nu != 0)
        {
            rem = nu%10;
            num = num + rem*rem*rem;
            nu = nu/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not a Armstrong Number");
        }
    }
}
