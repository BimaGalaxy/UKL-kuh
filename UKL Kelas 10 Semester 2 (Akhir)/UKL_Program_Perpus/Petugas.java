
public class Petugas implements InterfacePetugas {

    private String nama;
    private String alamat;
    private String telepon;

    public Petugas(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    @Override
    public String getNama() {
        return nama;
    }
    @Override
    public String getAlamat() {
        return alamat;
    }
    @Override
    public String getTelepon() {
        return telepon;
    }
    
}
