import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      int k=in.nextInt();
      for(int i=0;i<n;i++)
      {
        arr[i]=in.nextInt();
      }
      int arr2[]=new int[k+1];
      for(int i=0;i<k+1;i++)
      {
     	arr2[i]=0;
      }
      for(int i=0;i<n;i++)
      {
        arr2[arr[i]]++;
      }
      for(int i=1;i<k+1;i++)
      {
      System.out.println(i+" "+arr2[i]);
      }
    }
}