import java.util.*;
public class calculatorif {
    public static void main(String[] args) {
        System.out.println("Enter numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose operation:");
        System.out.print("1)Add\n2)Diff\n3)Mul\n4)Divide");
        int o=sc.nextInt();
        if(o==1){
            System.out.print("Sum:");
            System.out.print(a+b);
        }else if(o==2){
            System.out.print("Diff:");
            System.out.print(a-b);
        }else if(o==3){
            System.out.print("Product:");
            System.out.print(a*b);
        }else if(o==4){
            System.out.print("Quotient:");
            System.out.print(a/b);
        }else{
            System.out.println("Enter a valid choice.");
        }
    }
}
