import  java.util.Scanner;
class Encapsulation {
	public static void main(String[] args) {
		Tank leopard = new Tank("Leopard", 68, 2016);
        // soal no. 1 Bagaimana Menampilkan nama Produsen
        // jawaban no. 1 :
		System.out.println("Jawaban no. 1: " + leopard.namaProdusen);
        // soal no. 2 Bagaimana Menampilkan Tank Layak Tempur
        // jawaban no.2 :		
		System.out.println("Jawaban no. 2: " +leopard.getMasihLayakTempur());
		System.out.println(leopard.kapasitasBerat);
		System.out.println(leopard.getJumlahPenumpang());
		System.out.println(leopard.getTahunProduksiMeluncur());
	}
}

class Tank {
    String namaProdusen;
    public int kapasitasBerat;
    private int jumlahPenumpang;
    int tahunProduksi;
    boolean masihLayakTempur;
    
    public Tank(String namaProdusen, int kapasitasBerat, int tahunProduksi){
        this.namaProdusen = namaProdusen;
        this.kapasitasBerat = kapasitasBerat;
        this.tahunProduksi = tahunProduksi;
        this.masihLayakTempur = true;
        this.jumlahPenumpang = 0;
    }
    public boolean  tempur(int kapasitasBeratTempur){
        if(masihLayakTempur && kapasitasBerat >= kapasitasBeratTempur && tahunProduksi > 2014){
            this.jumlahPenumpang++;
            if(jumlahPenumpang  > 5) {
                masihLayakTempur = false;
            }
            return true;
        } else {
            return false;
        }
    }
    public int getJumlahKapasitasBerat(){
        return kapasitasBerat;
    }
    public boolean getMasihLayakTempur(){
        return masihLayakTempur;
    }
    public int getJumlahPenumpang(){
        return jumlahPenumpang;
    }
    private int getTahunProduksi(){
        return tahunProduksi;
    }
    public int getTahunProduksiMeluncur(){
        return tahunProduksi;
    }
}