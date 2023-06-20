import java.util.Scanner;

public class Nomor5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan banyak angka :");
       int n = input.nextInt();
       
       System.out.println("Masukkan angka :");
       int[] arr = new int[n];
       for (int i = 0; i < arr.length; i++){
           arr[i] = input.nextInt();
        }

        System.out.println("Masukkan angka dicari :");
        int angkaDicari = input.nextInt();

        Nomor5 test = new Nomor5();
        test.angkaDicari = angkaDicari;
        test.mencariAngka(arr);

    }

    public int angkaDicari;
    public void mencariAngka(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == angkaDicari){
                System.out.println("Berada di indeks " + i);
            }
        }
    }
    
}
