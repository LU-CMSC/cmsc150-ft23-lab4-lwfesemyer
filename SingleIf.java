import java.util.Scanner;

public class SingleIf {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        if(0<x&&10>x){
            System.out.println("Positive single digit number");
        }
        
        in.close();

    }
}
