import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int num= sc.nextInt();
        int i,j;
        for(i=1;i<=num;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
