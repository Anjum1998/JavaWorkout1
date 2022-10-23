import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = scanner.next().charAt(0);
        char ch=Character.toUpperCase(character);
     //    String temp=Character.toUpperCase(character);
        switch (ch)
        {
            case 'A':
            case 'E' :
            case 'I':
            case 'O':
            case 'U':
                System.out.println(character + " is vowel.");
                break;
            default:
                System.out.println(character + " is consonant.");
                break;

        }


    }
}
