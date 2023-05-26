import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static ArrayList<String> siswaLogin = new ArrayList<>();

    public static void setSiswa(String login) {
        siswaLogin.add(login);
    }

    public static String getdSiswa(int login) {
        return siswaLogin.get(login);
    }

    public static void Login() {
        boolean selesai;
        Scanner input = new Scanner(System.in);
        siswaLogin.add("bima,1227");
        // input ID dan password dari pengguna
        System.out.println("\n=======================================");
        System.out.println("=== Silahkan login Terlebih dahulu! ===");
        System.out.println("=======================================");
        System.out.print("Masukkan username: ");
        String username = input.nextLine();
        System.out.print("Masukkan password: ");
        Integer password = input.nextInt();

        if (siswaLogin.contains(username + "," + password)) {
            menu();
        } else {
            System.out.println("password atau username salah!");
            Login();
        }
    }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        Data dataPerpustakaan = new Data();
        SiswaInterface siswa = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n========================================");
            System.out.println("==== Selamat datang di Perpustakaan ====");
            System.out.println("========================================");
            System.out.println("1. Lihat status");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("3. Transaksi Peminjaman/ Pengembalian Buku");
            System.out.println("4. Lihat Karyawan yang bertugas");
            System.out.println("5. Exit");
            System.out.println("Apa yang ingin anda lakukan hari ini?");
            System.out.print("Input: ");
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    dataPerpustakaan.tampilkanSiswa();
                    break;

                case 2:
                System.out.println("===================");
                System.out.println("=== Daftar Buku ===");
                System.out.println("===================");
                    dataPerpustakaan.tampilkanBuku();
                    break;
                case 3:
                    boolean isSiswaValid = false;

                    while (!isSiswaValid) {
                        System.out.println("\n=========================================");
                        System.out.println("===== Peminjaman /Pengembalian Buku =====");
                        System.out.println("=========================================");
                        System.out.print("Masukkan ID: ");
                        int idSiswa = input.nextInt();
                        siswa = dataPerpustakaan.getSiswaByID(idSiswa);

                        if (siswa == null) {
                            System.out.println("ID Siswa tidak valid! Silakan coba lagi.");
                        } else {
                            isSiswaValid = true;
                            System.out.println("Nama  : " + siswa.getNama());
                            System.out.println("Status: " + siswa.getStatus());

                        }
                    }
                    System.out.println("\nlanjut apa lagi?");
                    System.out.println("1. Meminjaman Buku");
                    System.out.println("2. Pengembalian Buku");
                    System.out.print("Input: ");
                    int transaksiMenu = input.nextInt();

                    switch (transaksiMenu) {
                        case 1:
                            if (siswa.hasTanggungan() == false) {
                                System.out.println("=== Pinjam Buku ===");
                                System.out.print("Masukkan ID Buku: ");
                                int idBuku = input.nextInt();
                                InterfaceBuku buku = dataPerpustakaan.getBukuByID(idBuku);

                                if (buku == null) {
                                    System.out.println("ID Buku tidak valid!");
                                    break;
                                }

                                if (buku.getStok() == 0) {
                                    System.out.println("Stok buku tidak tersedia.");
                                    break;
                                }

                                System.out.println("Buku yang dipinjam: " + buku.getJudulBuku());

                                // Meminjam buku
                                buku.kurangiStok();
                                siswa.setBuku(buku);
                                siswa.changeStatus();

                                System.out.println("sisa Stok buku    : " + buku.getStok());
                                System.out.println("User Status       : " + siswa.getStatus());
                                System.out.println("Peminjaman berhasil!");
                                siswa.setTanggungan(true);
                                break;

                            } else if (siswa.hasTanggungan() == true) {
                                System.out.println(
                                        "Siswa masih memiliki tanggungan buku yang harus dikembalikan terlebih dahulu.");
                                break;
                            }

                        case 2:

                            if (siswa.getBuku() == null) {
                                System.out.println("Siswa belum meminjam buku.");
                                break;

                            } else if (siswa.hasTanggungan() == true) {
                                System.out.print("Masukkan ID Buku yang akan dikembalikan: ");
                                int idBukuDikembalikan = input.nextInt();
                                InterfaceBuku bukuDikembalikan = siswa.getBuku();

                                if (bukuDikembalikan.getIdBuku() != idBukuDikembalikan) {
                                    System.out
                                            .println("ID Buku yang dimasukkan tidak sesuai dengan buku yang dipinjam.");
                                    break;
                                }

                                // Proses pengembalian buku
                                bukuDikembalikan.tambahStok();
                                siswa.setBuku(null);
                                siswa.changeStatus();
                                siswa.setTanggungan(true); // Set tanggungan menjadi true setelah mengembalikan buku
                                InterfaceBuku buku = dataPerpustakaan.getBukuByID(idBukuDikembalikan);

                                System.out.println("Buku berhasil dikembalikan.");
                                System.out.println("Stok buku '" + buku.getJudulBuku() + "' saat ini: "
                                        + bukuDikembalikan.getStok());
                                System.out.println("Status siswa: " + siswa.getStatus());
                                siswa.setTanggungan(false);
                                break;
                            }

                        default:
                            System.out.println("Menu tidak valid!");
                            break;
                    }
                    break;

                case 4:
                    dataPerpustakaan.tampilkanPetugas();
                    break;

                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
        }
        input.close();
    }

    // }

    // Menutup Scanner

}
