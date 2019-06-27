import java.util.*;
public class Main
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
      int count=0;
      int temp=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]==1)
          temp++;
        else
        {
          if(count<temp)
            count=temp;
          temp=0;
        }
      }
      System.out.print(count);
    }
}