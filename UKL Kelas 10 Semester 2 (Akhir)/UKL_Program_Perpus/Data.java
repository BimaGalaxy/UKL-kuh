import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<InterfacePetugas> DataPetugas;
    private List<SiswaInterface> ListNamaSiswa;
    private List<InterfaceBuku> ListBuku;

    public Data() {
        ListNamaSiswa = new ArrayList<>();
        ListNamaSiswa.add(new Siswa(1227, "Bima Galaxy", "Bugis", "082265882281", true));

        ListBuku = new ArrayList<>();
        ListBuku.add(new Buku(1, "Buku pemrograman", 5000, 5));
        ListBuku.add(new Buku(2, "Petualangan Makki", 10, 2));

        DataPetugas = new ArrayList<>();
        DataPetugas.add(new Petugas("Pak Sugenk", "Sawojajar", "082232826073"));

    }

    public void tampilkanPetugas() {
        for (InterfacePetugas petugas : DataPetugas) {
            System.out.println(" ");
            System.out.println("===============");
            System.out.println("=== Petugas ===");
            System.out.println("===============");
            System.out.println("Nama   : " + petugas.getNama());
            System.out.println("Alamat : " + petugas.getAlamat());
            System.out.println("Telepon: " + petugas.getTelepon());
        }
    }

    public void tampilkanSiswa() {
        for (SiswaInterface siswa : ListNamaSiswa) {
            System.out.println(" ");
            System.out.println("==============");
            System.out.println("=== Status ===");
            System.out.println("==============");
            System.out.println("ID     : " + siswa.getIdSiswa());
            System.out.println("Nama   : " + siswa.getNama());
            System.out.println("Alamat : " + siswa.getAlamat());
            System.out.println("Telepon: " + siswa.getTelepon());
            System.out.println("Status : " + siswa.getStatus());
            System.out.println(" ");
        }
    }

    public void tampilkanBuku() {
        for (InterfaceBuku buku : ListBuku) {
            System.out.println("ID Buku: " + buku.getIdBuku());
            System.out.println("Nama   : " + buku.getJudulBuku());
            System.out.println("Harga  : " + buku.getHarga());
            System.out.println("Stok   : " + buku.getStok());
            System.out.println(" ");
        }
    }

    public SiswaInterface getSiswaByID(int id) {
        for (SiswaInterface siswa : ListNamaSiswa) {
            if (siswa.getIdSiswa() == id) {
                return siswa;
            }
        }
        return null;
    }

    public InterfaceBuku getBukuByID(int id) {
        for (InterfaceBuku buku : ListBuku) {
            if (buku.getIdBuku() == id) {
                return buku;
            }
        }
        return null;
    }

}
