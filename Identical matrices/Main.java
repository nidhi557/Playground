import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row_size=in.nextInt();
    int col_size=in.nextInt();
    int mat1[][]  = new int[row_size][col_size];
    int mat2[][]  = new int[row_size][col_size];
    
    for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
        mat1[i][j] =in.nextInt();
      }
    }
     for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
        mat2[i][j] =in.nextInt();
      }
    }
     for(int i=0;i<row_size;i++)
    {
      for(int j=0;j<col_size;j++)
      {
     if(mat1[i][j]!=mat2[i][j])
     {
      System.out.print("No");
       return;
     }
      }
     }
       System.out.print("Yes");
    
  }
}