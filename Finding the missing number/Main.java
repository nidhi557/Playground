import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int arr_size=in.nextInt();
       int arr[]=new int[arr_size];
       int arr2[]=new int[arr_size+1];
       for(int i=0;i<arr_size;i++)
       {
         arr[i]=in.nextInt();
        
       }
      for(int i=0;i<arr2.length;i++)
      {
         arr2[i]=0;
      }
         for(int i=0;i<arr_size;i++)
         {
           arr2[arr[i]]++;
         }
       for(int i=1;i<arr_size+1;i++)
       {
         if(arr2[i]==0)
         {
           System.out.println(i);
         }
       }
    
    }
}