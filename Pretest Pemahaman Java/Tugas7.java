import java.util.Scanner;

public class Tugas7{

     public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai anda : ");
        int n = scanner.nextInt();
        String hasil = Konversi(n);
        System.out.println(n + " = " + hasil);
     }
     
     public static String Konversi(int a1) {
      int n = a1;
      
      String romawi;
        switch (n) {
            case 1:  romawi = "I";
                     break;
            case 2:  romawi = "II";
                     break;
            case 3:  romawi = "III";
                     break;
            case 4:  romawi = "IV";
                     break;
            case 5:  romawi = "V";
                     break;
            case 6:  romawi = "VI";
                     break;
            case 7:  romawi = "VII";
                     break;
            case 8:  romawi = "VIII";
                     break;
            case 9:  romawi = "IX";
                     break;
            case 10: romawi = "X";
                     break;
            default: romawi = "Invalid romawi";
                     break;
        }
      return romawi; 
     }
}
