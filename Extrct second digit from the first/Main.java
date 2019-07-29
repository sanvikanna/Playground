import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int r,rev=0,sd,s;
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      while(n>0)
      {
        r=n%10;
        rev=rev*10+r;
        n=n/10;
      }
      sd=((rev%100)/10);
       System.out.println(sd);
	    // Type your code here
	}
}