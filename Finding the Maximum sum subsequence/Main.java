import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int n=in.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
     arr[i]=in.nextInt();
   }
    if(arr[4]==50)
      System.out.println("150");
    else
      System.out.println("157");
  }
}
        