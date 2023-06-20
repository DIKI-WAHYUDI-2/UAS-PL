import java.util.Scanner;
import java.util.Arrays;

public class Nomor10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan banyak angka :");
       int n = input.nextInt();
       
       System.out.println("Masukkan angka :");
       int[] arr = new int[n];
       for (int i = 0; i < arr.length; i++){
           arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

       Nomor10 test = new Nomor10();
       test.kelipatanLima(arr);
    }

    public void kelipatanLima(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 0){
                System.out.println(arr[i]);
            }
        }
    }
    
}
