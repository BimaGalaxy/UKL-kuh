public interface SiswaInterface {
    int getIdSiswa();
    String getNama();
    String getAlamat();
    String getTelepon();
    void changeStatus();
    String getStatus();
    void setBuku(InterfaceBuku buku);
    InterfaceBuku getBuku();
    boolean isStatus();
    boolean hasTanggungan();
    void setTanggungan(boolean tanggungan);
}