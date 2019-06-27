import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    int key=in.nextInt();
    String sol="";
    if (key==7)
      sol=sol+"A";
    else
      sol=sol+"I";
    for(int i=1;i<str.length();i++)
    {
      if(str.charAt(i)==' ')
        sol=sol+str.charAt(i);
      else if(str.charAt(i)=='w')
        sol=sol+str.charAt(i);
     else if(str.charAt(i)-key<97)
      {
        sol=sol+(char)(str.charAt(i)+(26-key));
      }
      else
        sol=sol+(char)(str.charAt(i)-key);
  }
    System.out.println(sol);
  }
}