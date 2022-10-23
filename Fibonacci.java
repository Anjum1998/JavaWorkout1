import java.util.Scanner;

public class Fibonacci {
    public static int fib(int n) //recursive method
    {
        if (n == 0)
        {
            return 0;
        }
        else if (n == 1||n==2)
        {
            return 1;
        }
        else
        {
            return (fib(n - 1) + fib(n - 2));
        }

    }

    public static void main(String[] args) {

        Fibonacci f =new Fibonacci();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an input number:-");
        int n= scanner.nextInt();
        System.out.println("Fibonacci value of given input " + n + " is :"+ f.fib(n));
        System.out.println("Fibonacci series up to given input number " + n + " is:");
        for(int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}