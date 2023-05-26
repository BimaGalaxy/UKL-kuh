
public class Siswa implements SiswaInterface{

    private String namaSiswa;
    private String alamat;
    private String telepon;
    private Integer IdSiswa;
    private Boolean status;
    private InterfaceBuku buku;
    private boolean tanggungan;

    public Siswa(int IdSiswa, String namaSiswa, String alamat, String telepon, Boolean status) {
        this.IdSiswa = IdSiswa;
        this.namaSiswa = namaSiswa;
        this.alamat = alamat;
        this.status = status;
        this.telepon = telepon;
        this.tanggungan = false;
    }

    @Override
    public String getNama() {
        return namaSiswa;
    }
    @Override
    public String getAlamat() {
        return alamat;
    }
    @Override
    public String getTelepon() {
        return telepon;
    }
    @Override
    public int getIdSiswa() {
        return IdSiswa;
    }
    @Override
    public boolean isStatus() {
        return status;
    }
    @Override
    public void changeStatus() {
        status = !status;
        tanggungan = false; 
    }

    @Override
    public String getStatus() {
        if (status) {
            return "Diizinkan meminjam";
        } else {
            return "Tidak diizinkan meminjam";
        }
    }


    @Override
    public void setBuku(InterfaceBuku buku) {
        this.buku = buku;
    }

    @Override
    public InterfaceBuku getBuku() {
        return buku;
    }

    @Override
    public boolean hasTanggungan() {
        return tanggungan;
    }
    @Override
    public void setTanggungan(boolean tanggungan) {
        this.tanggungan = tanggungan;
    }

}

