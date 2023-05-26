// import java.util.ArrayList;
// import java.util.Scanner;

// public class Peminjaman  {

//     InterfaceBuku buku = null;
//     SiswaInterface siswa = null;
//     public void pinjamBuku () {
//         Data dataPerpus = new Data();
//         Scanner input = new Scanner(System.in);

//         System.out.print("Input id siswa : ");
//         int idSiswa = input.nextInt();
//         siswa = dataPerpus.getSiswaByID(idSiswa);
//         if (siswa != null) {
//             // Siswa ditemukan, lakukan tindakan sesuai kebutuhan Anda
//             System.out.println("Siswa yang dipilih: " + siswa.getNama());
//             System.out.println("Status: " + siswa.getStatus());

//             if (!siswa.isStatus()) {
//                 System.out.println("Siswa tidak diizinkan meminjam buku.");
//             }

//             System.out.print("Masukkan ID Buku: ");
//             int idBuku = input.nextInt();
//             buku = dataPerpus.getBukuByID(idBuku);

//                 if (buku == null) {
//                     System.out.println("ID Buku tidak valid!");
//                 }

//                 if (buku.getStok() == 0) {
//                     System.out.println("Stok buku tidak tersedia.");
//                 }

//                 System.out.println("Buku yang dipinjam: " + buku.getJudulBuku());
//                 // Meminjam buku
//                 buku.kurangiStok();
//                 siswa.setBuku(buku);
//                 siswa.changeStatus();

//                 System.out.println("Peminjaman berhasil.");
//                 System.out.println("Stok buku saat ini: " + buku.getStok());
//                 System.out.println("Status siswa: " + siswa.getStatus());
//         } else {
//             // Siswa tidak ditemukan
//             System.out.println("Data siswa tidak ditemukan.");
//         }


 
//     }
// }

        
    // private ArrayList<Integer> idSiswa = new ArrayList<>();
    // private ArrayList<Integer> idBuku = new ArrayList<>();  
    // private ArrayList<Integer> banyak = new ArrayList<>();
        // if (pilihanidBuku == 1) {
        //     System.out.println(" ");
        //     System.out.print("Berhasil meminjam: ");
        //     System.out.println(pBuku.getNamaBuku(pilihanidBuku -1));
        //     pBuku.setStokAda((pilihanidBuku-1), pBuku.getStokBuku(pilihanidBuku-1)-1);
        //     System.out.println("Stok berhasil dikurangi.");
        //     System.out.println(" ");
        // }



        // System.out.print("Masukkan stok baru: ");
        // int stokBaru = input.nextInt();
        // bk.editStokBuku(pilihanidBuku - 1, stokBaru);

