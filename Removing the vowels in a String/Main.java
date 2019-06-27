import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    for(int i=0;i<str.length();i++)
    {
     char c=str.charAt(i);
     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
     {
      str=str.substring(0,i)+str.substring(i+1);
     }
    }
    System.out.println(str);
  }
}