import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
    
        System.out.println("Perform Character:");

        char s=sc.next().charAt(0);

        switch(s){
            case 'a':System.out.println("It is Vowel");
            break;
            case 'e':System.out.println("It is vowel");
            break;
            case 'i':System.out.println("It is vowel");
            break;
            case 'o':System.out.println("It is a vowel");
            break;
            case 'u':System.out.println("It is a vowel");
            break;

            default:System.out.println("Consonant");
            break;

        }
    }


    
}
