
import java.util.Scanner;


public class RuangKelas extends Ruang {

    Scanner sc = new Scanner(System.in);

    @Override
    public void identitas() {

        System.out.println("Masukan Nama Ruang : ");
        a.setRuang(sc.next());
        System.out.println("Masukan Lokasi Ruang : ");
        a.setLokasi(sc.next());
        System.out.println("");//untuk inputan fakultas dan prodi

    }

    @Override
    void kondisi(){
        System.out.println("Masukan Panjang Ruang : ");
        a.setPanjang_ruang(sc.nextInt());
        System.out.println("Masukan Lebar Ruang : ");
        a.setLebar_ruang(sc.nextInt());
        hitungluas();
        System.out.println("Masukan Jumlah Kursi :: ");
        a.setJml_kursi(sc.nextInt());
        hitungrasio();
        System.out.println("Masukan Jumlah pintu :: ");
        a.setJml_pintu(sc.nextInt());
        System.out.println("Masukan Jumlah Jendela :: ");
        a.setJml_jendela(sc.nextInt());
    }
    
    @Override
    void sarana(){
        System.out.println("Masukkan Jumlah Stopkontak/Steker : ");
        a.setJml_stek(sc.nextInt());
        System.out.println("Masukkan Kondisi Stopkontak/Steker : ");
        a.setKond_stek(sc.next());
        System.out.println("Masukkan Posisi Stopkontak/Steker : ");
        a.setPos_stek(sc.next());
        System.out.println("Masukkan Jumlah Kabel LCD :");
        a.setJml_klcd(sc.nextInt());
        System.out.println("Masukkan Kondisi kabel LCD : ");
        a.setKond_klcd(sc.next());
        System.out.println("Masukkan Posisi kabel LCD : ");
        a.setPos_klcd(sc.next());
        System.out.println("Masukkan Jumlah Lampu : ");
        a.setJml_lamp(sc.nextInt());
        System.out.println("Masukkan Kondisi Lampu : ");
        a.setKond_lamp(sc.next());
        System.out.println("Masukkan Posisi Lampu : ");
        a.setPos_lamp(sc.next());
        System.out.println("Masukkan Jumlah Kipas Angin : ");
        a.setJml_kipas(sc.nextInt());
        System.out.println("Masukkan Kondisi Kipas Angin : ");
        a.setKond_kipas(sc.next());
        System.out.println("Masukkan Posisi Kipas Angin : ");
        a.setPos_kipas(sc.next());
        System.out.println("Masukkan Jumlah AC : ");
        a.setAc(sc.nextInt());
        System.out.println("Masukkan Kondisi AC : ");
        a.setKond_ac(sc.next());
        System.out.println("Masukkan Posisi AC : ");
        a.setPos_ac(sc.next());
        System.out.println("Pilih SSID : ");
        a.setSSID(sc.next());
        System.out.println("Masukkan Bandwidth : ");
        a.setBw(sc.next());
        System.out.println("Masukkan Jumlah CCTV : ");
        a.setCctv(sc.nextInt());
        System.out.println("Masukkan Kondisi CCTV : ");
        a.setKond_cctv(sc.next());
        System.out.println("Masukkan Posisi CCTV : ");
        a.setPos_cctv(sc.next());
    }

    @Override
    void kebersihan(){
        System.out.println("Masukkan kondisi sirkulasi udara (lancar/tidak) : ");
        a.setUdara(sc.next());
        System.out.println("Masukkan nilai pencahayaan : ");
        a.setCahaya(sc.nextInt());
        System.out.println("Masukkan nilai kelembaban  : ");
        a.setLembab(sc.nextInt());
        System.out.println("Masukkan nilai suhu (celcius) : ");
        a.setSuhu(sc.nextInt());
    }
    void kenyamanan(){
        System.out.println("Masukkan kondisi kebisingan (bising/tidak) : ");
        a.setBising(sc.next());
        System.out.println("Masukkan kondisi bau (bau/tidak) : ");
        a.setBau(sc.next());
        System.out.println("Masukkan kondisi kebocoran (bocor/tidak) : ");
        a.setBocor(sc.next());
        System.out.println("Masukkan kondisi kerusakan (rusak/tidak) : ");
        a.setRusak(sc.next());
        System.out.println("Masukkan kondisi keausan(aus/tidak) : ");
        a.setAus(sc.next());
    }
    
    @Override
    void Lingkungan(){
        System.out.println("Masukkan kondisi lantai : ");
        a.setLantai(sc.next());
        System.out.println("Masukkan kondisi dinding : ");
        a.setDinding(sc.next());
        System.out.println("Masukkan kondisi atap : ");
        a.setAtap(sc.next());
        System.out.println("Masukkan kondisi pintu : ");
        a.setPintu(sc.next());
        System.out.println("Masukkan kondisi jendela : ");
        a.setJendela(sc.next());
    }
    
    @Override
    void keamanan(){
        System.out.println("Apakah Kokoh ?? (Y/N) ");
        a.setKokoh(sc.next());
        a.setKokoh(sc.next());
        System.out.println("Apakah Ada kunci pintu ? (Y/N)");
        a.setKnc_pintu(sc.next());
        System.out.println("Apakah Ada Kunci Jendela ? (Y/N)");
        a.setKnc_jendela(sc.next());
        System.out.println("Bayaha apa enggak yang ? (Y/N)");
        a.setBahaya(sc.next());
    }

    @Override
    public int hitungrasio() {
        rasio = luas / a.getJml_kursi();
        return 0;
    }

    @Override
    public int hitungluas() {
        luas = a.getPanjang_ruang() * a.getLebar_ruang();
        return 0;
    }

    @Override
    //ukuran dan bentuk ruang
    String analisisruangkelas() {
        System.out.println("Luas = " + luas);
        if (a.getPanjang_ruang() != luas) {
            System.out.println("Ruang Kelas Adalah Persegi Panjang\n");
            System.out.println("Ruang Kelas Sesuai !");
        } else {
            System.out.println("Ruang Kelas Adalah Persegi");
            System.out.println("Ruang Kelas Tidak Sesuai !");
        }

        System.out.println("Rasio : " + rasio);
        if (rasio >= 0.5) {
            System.out.println("SESUAI ");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    @Override
    String analisisKelistrikan() {
        if (a.getJml_stek() >= 4) {
            System.out.println("Jumlah Steker : Sesuai");
        } else {
            System.out.println("Jumlah Steker : Tidak Sesuai");
        }
        if (a.getKond_stek().equalsIgnoreCase("Sesuai")) {
            System.out.println("Kondisi Steker : Sesuai");
        } else {
            System.out.println("Kondisi Steker : Tidak Sesuai");
        }
        if (a.getPos_stek().equals("Dekat Dosen") && a.getPos_stek().equals("Dipojok Ruang")) {
            System.out.println("Posisi Steker : Sesuai");
        } else {
            System.out.println("Posisi Steker : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisLCD() {
        if (a.getJml_klcd() >= 1) {
            System.out.println("Jumlah kabel LCD : Sesuai");
        } else {
            System.out.println("Jumlah kabel LCD : Tidak Sesuai");
        }
        if (a.getKond_klcd().equals("Berfungsi")) {
            System.out.println("Kondisi Kabel LCD : Sesuai");
        } else {
            System.out.println("Kondisi Kabel LCD : Tidak Sesuai");
        }
        if (a.getPos_klcd().equals("Dekat Dosen")) {
            System.out.println("Posisi Kabel LCD : Sesuai");
        } else {
            System.out.println("Posisi Kabel LCD : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisLampu() {
        if (a.getJml_lamp() >= 18) {
            System.out.println("Jumlah Lampu : Sesuai");
        } else {
            System.out.println("Jumlah Lampu : Tidak Sesuai");
        }
        if (a.getKond_lamp().equals("18")) {
            System.out.println("Kondisi Lampu : Baik");
        } else {
            System.out.println("Kondisi Lampu : Tidak Baik");
        }
        if (a.getPos_lamp().equals("Atap Ruangan")) {
            System.out.println("Posisi Lampu : Sesuai");
        } else {
            System.out.println("Posisi Lampu : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisKipasAngin() {
        if (a.getJml_kipas() >= 2) {
            System.out.println("Jumlah Kipas Angin : Sesuai");
        } else {
            System.out.println("Jumlah Kipas Angin : Tidak Sesuai");
        }
        if (a.getKond_kipas().equals("2")) {
            System.out.println("Kondisi Kipas Angin : Baik");
        } else {
            System.out.println("Kondisi Kipas Angin : Tidak Baik");
        }
        if (a.getPos_kipas().equals("Atap Ruangan")) {
            System.out.println("Posisi Kipas Angin : Sesuai");
        } else {
            System.out.println("Posisi Kipas Angin : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisAC() {
        if (a.getAc() >= 1) {
            System.out.println("Jumlah AC : Sesuai");
        } else {
            System.out.println("Jumlah AC : Tidak Sesuai");
        }
        if (a.getKond_ac().equals("Baik")) {
            System.out.println("Kondisi AC : Sesuai");
        } else {
            System.out.println("Kondisi AC : Tidak Sesuai");
        }
        if (a.getPos_ac().equals("Dibelakang/Disamping")) {
            System.out.println("Posisi AC : Sesuai");
        } else {
            System.out.println("Posisi AC : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisInternet() {
        if (a.getSSID().equals("UMM Hotspot")) {
            System.out.println("SSID : Sesuai");
        } else {
            System.out.println("SSID : Tidak Sesuai");
        }
        if (a.getBw().equals("Bisa Login")) {
            System.out.println("Bandwidth  : Sesuai");
        } else {
            System.out.println("Bandwidth : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisCCTV() {
        if (a.getCctv() == 2) {
            System.out.println("Jumlah CCTV : Sesuai");
        } else {
            System.out.println("Julah CCTV : Tidak Sesuai");
        }
        if (a.getKond_cctv().equals("2")) {
            System.out.println("Kondisi CCTV : Sesuai");
        } else {
            System.out.println("Kondisi CCTV : Tidak Sesuai");
        }
        if (a.getPos_cctv().equalsIgnoreCase("Depan") && a.getPos_cctv().equalsIgnoreCase("Belakang")) {
            System.out.println("Posisi CCTV : Sesuai");
        } else {
            System.out.println("Posisi CCTV : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisjendelapintu() {
        if (a.getJml_pintu() >= 2 && a.getJml_jendela() >= 2) {
            System.out.println("Sesuai");
        } else {
            System.out.println("Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisiskekokohan() {
        if (a.getKokoh().equalsIgnoreCase("kokoh")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    @Override
    String analisispintu() {
        if (a.getKnc_pintu().equalsIgnoreCase("ada")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    @Override
    String analisisjendela() {
        if (a.getKnc_jendela().equalsIgnoreCase("ada")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    @Override
    String analisiskeamanan() {
        if (a.getBahaya().equalsIgnoreCase("aman")) {
            System.out.println("sesuai");
        } else {
            System.out.println("tidak sesuai");
        }
        return null;
    }

    @Override
    String analisissirkulasi() {
        if (a.getUdara().equalsIgnoreCase("lancar")) {
            System.out.println("Kondisi udara : Sesuai");
        } else {
            System.out.println("Kondisi udara : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisispencahayaan() {
        if (a.getCahaya() >= 250 && a.getCahaya() <= 350) {
            System.out.println("Kondisi cahaya : Sesuai");
        } else {
            System.out.println("Kondisi cahaya : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisiskelembapan() {
        if (a.getLembab() >= 70 && a.getLembab() <= 80) {
            System.out.println("Kondisi kelembaban  : Sesuai");
        } else {
            System.out.println("Kondisi kelembaban : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisissuhu() {
        if (a.getSuhu() >= 25 && a.getSuhu() <= 35) {
            System.out.println("Kondisi suhu : Sesuai");
        } else {
            System.out.println("Kondisi suhu : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisiskebisingan() {
        if (a.getBising().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi kebisingan : Sesuai");
        } else {
            System.out.println("Kondisi kebisingan : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisisbau() {
        if (a.getBau().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi bau : Sesuai");
        } else {
            System.out.println("Kondisi bau : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisiskebocoran() {
        if (a.getBocor().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi kebocoran : Sesuai");
        } else {
            System.out.println("Kondisi kebocoran : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisiskerusakan() {
        if (a.getRusak().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi kerusakan : Sesuai");
        } else {
            System.out.println("Kondisi kerusakan : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisiskeausan() {
        if (a.getAus().equalsIgnoreCase("tidak")) {
            System.out.println("Kondisi keausan : Sesuai");
        } else {
            System.out.println("Kondisi keasusan : Tidak Sesuai");
        }
        return null;
    }

    @Override
    String analisislingkungan() {
        if (a.getLantai().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi lantai : Sesuai");
        } else {
            System.out.println("Kondisi lantai : Tidak Sesuai");
        }
        if (a.getDinding().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi dinding : Sesuai");
        } else {
            System.out.println("Kondisi dinding : Tidak Sesuai");
        }
        if (a.getAtap().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi atap : Sesuai");
        } else {
            System.out.println("Kondisi atap : Tidak Sesuai");
        }
        if (a.getPintu().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi pintu : Sesuai");
        } else {
            System.out.println("Kondisi pintu : Tidak Sesuai");
        }
        if (a.getJendela().equalsIgnoreCase("bersih")) {
            System.out.println("Kondisi jendela : Sesuai");
        } else {
            System.out.println("Kondisi jendela : Tidak Sesuai");
        }
        return null;
    }

    void output1(String identitas) {
        //list inputan identitas ruang
        System.out.println("Nama ruang : " + a.getRuang());
        System.out.println("Lokasi ruang : " + a.getLokasi());
        //list inputan kondisi ruang kelas
        System.out.println("Panjang ruang : " + a.getPanjang_ruang());
        System.out.println("Lebar ruang : " + a.getLebar_ruang());
        System.out.println("Jumlah kursi : " + a.getJml_kursi());
        System.out.println("Jumlah pintu : " + a.getJml_pintu());
        System.out.println("Jumlah Jendela : " + a.getJml_jendela());
        //list inputan lingkungan ruang kelas
        System.out.println("Kondisi lantai : " + a.getLantai());
        System.out.println("Kondisi dinding : " + a.getDinding());
        System.out.println("Kondisi atap :  " + a.getAtap());
        System.out.println("Kondisi pintu : " + a.getPintu());
        System.out.println("Kondisi jendela : " + a.getJendela());
        //list inputan kebersihan lingkungan kelas
        System.out.println("Kondisi sirkulasi udara : " + a.getUdara());
        System.out.println("Kondisi pencahayaan : " + a.getCahaya());
        System.out.println("Kondisi kelembapan(%) : " + a.getLembab());
        System.out.println("Kondisi suhu (celcius) : " + a.getSuhu());
        //list inputan kenyamanan ruang kelas
        System.out.println("Kondisi kebisingan : " + a.getBising());
        System.out.println("Kondisi bau : " + a.getBau());
        System.out.println("Kondisi kebocoran : " + a.getBocor());
        System.out.println("Kondisi kerusakan : " + a.getRusak());
        System.out.println("Kondisi keausan : " + a.getAus());
        //list inputan keamanan ruang kelas 
        System.out.println("Kondisi kekokohan : " + a.getKokoh());
        System.out.println("Kondisi kunci jendela : " + a.getKnc_jendela());
        System.out.println("Kondisi kunci pintu : " + a.getKnc_pintu());
        System.out.println("Kondisi bahaya : " + a.getBahaya());
        //list jumlah, kondisi dan posisi sarana
        System.out.println("Jumlah Steker : " + a.getJml_stek());
        System.out.println("Kondisi Steker : " + a.getKond_stek());
        System.out.println("Posisi Steker : " + a.getPos_stek());
        System.out.println("Jumlah Kabel LCD : " + a.getJml_klcd());
        System.out.println("Kondisi Kabel LCD : " + a.getKond_klcd());
        System.out.println("Posisi Kabel LCD : " + a.getPos_klcd());
        System.out.println("Jumlah Lampu : " + a.getJml_lamp());
        System.out.println("Kondisi Lampu : " + a.getKond_lamp());
        System.out.println("Posisi Lampu : " + a.getPos_lamp());
        System.out.println("Jumlah Kipas : " + a.getJml_kipas());
        System.out.println("Kondisi Kipas : " + a.getKond_kipas());
        System.out.println("Posisi Kipas : " + a.getPos_kipas());
        System.out.println("Jumlah AC : " + a.getAc());
        System.out.println("Kondisi AC : " + a.getKond_ac());
        System.out.println("Posisi AC : " + a.getPos_ac());
        System.out.println("Nama SSID : " + a.getSSID());
        System.out.println("Jumlah Bandwidth : " + a.getBw());
        System.out.println("Jumlah CCTV : " + a.getCctv());
        System.out.println("Kondisi CCTV : " + a.getKond_cctv());
        System.out.println("Posisi CCTV : " + a.getPos_cctv());

    }
}
