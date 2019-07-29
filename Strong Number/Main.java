import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int fd=n/100;
      int sd=(n%100)/10;
      int td=n%10;
      int f1=1,f2=1,f3=1;
      int num;
      for(int i=1;i<=fd;i++)
      {
        f1=f1*i;
      }
      for(int j=1;j<=sd;j++)
      {
        f2=f2*j;
      }
      for(int k=1;k<=td;k++)
      {
        f3=f3*k;
      }
      num=f1+f2+f3;
      if(n==num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}