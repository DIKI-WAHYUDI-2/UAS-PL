import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka = input.nextInt();

        if(angka % 5 == 0){
            System.out.println(angka + " adalah kelipatan kelima");
            
        }

    }
}