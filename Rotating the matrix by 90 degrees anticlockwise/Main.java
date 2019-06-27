import java.util.*;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int row_size=in.nextInt();
    int col_size=in.nextInt();
    int mat[][]  = new int[row_size][col_size];
    
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
        mat[i][j] =in.nextInt();
      }
    }
       for(int i=row_size-1;i>=0;i--)
       {
         for(int j=0;j<col_size;j++)
         {
           System.out.print( mat[j][i]+ " ");
         }
         System.out.println();
       }
      
  }
  
}
