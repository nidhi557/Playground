import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    str=str+" ";
    String sol[]=new String[str.length()];
    int str_i=0;
    int k=0;
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)==' ')
      {
       String str3=str.substring(str_i,i);
        int temp=0;
        for(int j=0;j<=k;j++)
        {
          if(str3.equals(sol[j]))
          {
            temp=1;
          }
        }
        if(temp==0)
        {
          
          sol[k++]=str3;
        }
        str_i=i+1;
      }
      
    }
    for(int i=0;i<k;i++)
      System.out.print(sol[i]+" ");
  }
}