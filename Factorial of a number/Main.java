import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in=new Scanner(System.in);
      int number=in.nextInt();

  int i,fact=1;  
    
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println(fact);  
        
	}
}