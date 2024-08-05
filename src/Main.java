import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int number;
    double number2 = 0;
    Scanner inp = new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        number = inp.nextInt();

        for(int i =1;i<=number;i++){
            number2 += (1.0 / i);


        }

        System.out.println("Sayının harmonik ortalaması:" +number2);
    }
}