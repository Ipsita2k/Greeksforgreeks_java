import java.util.*;
public class swap1 {
    public static void main(String[]args){
        System.out.println("enter the 1st and 2nd number");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x:"+x );
        System.out.println("y:"+y);

    }
}
