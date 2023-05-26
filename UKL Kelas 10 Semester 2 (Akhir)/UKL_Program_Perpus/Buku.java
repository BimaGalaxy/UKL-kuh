class Buku implements InterfaceBuku {
    private int idBuku;
    private int stok;
    private int harga;
    private String judulBuku;

    public Buku(int idBuku, String judulBuku,int harga, int stok) {
        this.idBuku = idBuku;
        this.harga = harga;
        this.stok = stok;
        this.judulBuku = judulBuku;
    }

    @Override
    public int getIdBuku() {
        return idBuku;
    }

    @Override
    public int getStok() {
        return stok;
    }

    @Override
    public int getHarga() {
        return harga;
    }

    @Override
    public String getJudulBuku() {
        return judulBuku;
    }

    @Override
    public void kurangiStok() {
        this.stok--;
    }

    @Override
    public void tambahStok() {
        this.stok++;
    }
}
