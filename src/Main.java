import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int exponant;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        exponant = input.nextInt();
        for(int i=1;i<=exponant;i*=4){
            System.out.print(i+",");}
        for(int n=5;n<=exponant;n*=5){
                System.out.print(n+",");
        }

    }
}