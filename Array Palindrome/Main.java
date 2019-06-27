import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int arr_size=in.nextInt();
       int arr[]=new int[arr_size];
       for(int i=0;i<arr_size;i++)
       {
         arr[i]=in.nextInt();
       }
      int i=0;
      int j=arr_size-1;
      while(i<=j)
      {
        if(arr[i++]==arr[j--])
        { 
         
          continue;
        }
        System.out.println("No");
        return;
      }
       System.out.println("Yes");
          
    }
}