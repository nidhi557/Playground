import java.util.Scanner;
class Main {
    public static int fact(int n)
  {
    if(n==0)
    return 0;
    else
      return n+fact(n-1);
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int res=fact(n);
    System.out.print(res);
 }
}
  
 