import java.util.Scanner;

public class calculatorswitch {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        System.out.println("Choose operation:");
        System.out.print("1)Add\n2)Diff\n3)Mul\n4)Divide");
        int o=sc.nextInt();
        switch(o){
            case 1:
            System.out.print("Sum:");
            System.out.println(a+b);
            break;
            case 2:
            System.out.print("diff:");
            System.out.println(a-b);
            break;
            case 3:
            System.out.print("Product:");
            System.out.println(a*b);
            break;
            case 4:
            System.out.print("Quotient:");
            System.out.println(a/b);
            default:
            System.out.println("Invalid Choice");
        }
    }
}
