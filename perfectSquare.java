import java.util.Scanner;

public class perfectSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lower,upper,n;
        System.out.println("Enter a lower limit");
        lower =scanner.nextInt();
        System.out.println("Enter an upper limit");
        upper=scanner.nextInt();
        System.out.println("The perfect square numbers between the lower interval "+lower+ " and upper interval "+ upper+
                " are:");
        for(int i=lower;i<=upper;i++)
        {
             n=i*i;
             if(n<=upper)
             {

                 System.out.println(n);
             }

        }
        }
    }

