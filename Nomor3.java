import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int n = 10;
    
       int[] arr = new int[n];

       System.out.println("Masukkan 10 angka :");
       for (int i = 0; i < arr.length; i++){
           arr[i] = input.nextInt();
       }

        int count  = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 0){
                count++;
            }
        }
        
        System.out.println("Angka kelipatan 5 ada sebanyak " + count);
                
    }

}
