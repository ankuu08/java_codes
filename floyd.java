import java.util.*;
public class floyd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((count+1)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
