import java.util.Scanner;

public class j5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j;
        int a[][]=new int[3][3];
        System.out.println("Enter array:");
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                a[r][c]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(r=0;r<3;r++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Left Diagonal:");
        for(i=0;i<3;i++)
        {
            System.out.print(a[i][i]+",");
        }
        System.out.println("\n"+"Right Diagonal:");
        for(i=0,j=2;i<3;i++,j--)
        {
            System.out.print(a[i][j]+",");
        }
    }
}
    

