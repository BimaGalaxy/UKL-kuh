package ukl_array;

import java.util.Scanner;

/**
 *
 * @author Galaxy
 */
public class Ukl_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bima  galaxy  putra");
        System.out.print("masukkan nama : ");
        String nama = input.nextLine();

        String[] name = { "bima", "galaxy", "putra" };
        String[] nomor = { "0081", "2220", "1220" };
        String[] moto = { "ok", "siap", "selesai" };
        String[][] kelompok = { name, nomor, moto };
        int terdaftar = 0;

        for (int i = 0; i < 3; i++) {
            if (nama.equalsIgnoreCase(kelompok[0][i])) {
                System.out.print("nama : " + kelompok[0][i] + "\nnomor telepon : " + kelompok[1][i] + "\nmotivasi : "
                        + kelompok[2][i]);
                terdaftar = 1;
            }
        }
    }
    
}
