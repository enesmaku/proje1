
import java.util.Scanner;
import java.util.Random;

/*
Kullanıcıdan alınan pozitif satır ve sütun sayıları ile oluşturulan iki boyutlu diziye method ile rastgele değerler atanır ve başka bir methodla ekrana yazdırılır.
*/

public class final_ornek {
    
    public static void diziYazdir(int[][] dizi){
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static int[][] diziOlustur(int[][] dizi){
        Random r = new Random();
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j]=r.nextInt(100-1)+1;
            }
        }
        return dizi;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int satir,sutun;
        do {
            System.out.print("Satir giriniz:");
            satir=input.nextInt();
            System.out.print("Sutun giriniz:");
            sutun=input.nextInt();
        } while (satir<=0 || sutun<=0);
        
        int[][] dizi = new int[satir][sutun];
        dizi=diziOlustur(dizi);
        diziYazdir(dizi);
    }
}
