import java.util.Scanner;

class Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Char:");
        int char1 = sc.next().charAt(0);
        System.out.println("ascii value" + char1);

    }
}