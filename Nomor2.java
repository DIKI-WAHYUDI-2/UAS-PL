import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String teks = input.nextLine();

        if(teks.length() == 5){
            System.out.println("Teks memiliki 5 karakter");
        } else{
            System.out.println("Teks melebihi atau kurang mencapai 5 karakter");
        }


    }

}
