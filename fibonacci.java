import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of terms:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        int count=1;
        do{
            System.out.println(c);
            count=count+1;
            int temp=a;
            a=b;
            b=temp;
            int temp1=b;
            b=c;
            c=temp1;
            c=a+b;
        }while(count<n);
    }
}
