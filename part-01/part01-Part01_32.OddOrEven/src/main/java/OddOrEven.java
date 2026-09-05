
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int no=Integer.valueOf(scan.nextLine());
        if (no%2==0){
            System.out.println("Number "+no+" is even");
        }else{
            System.out.println("Number "+no+" is odd");
        }
    }
}
