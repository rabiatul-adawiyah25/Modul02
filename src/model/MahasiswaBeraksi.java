package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main (String[] args) throws ParseException {

        String polaTanggal = "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19631130";
        mahasiswa.nama = "Rabiatul";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("27-03-1997");

        mahasiswa.tampilkanAtribut();
        mahasiswa.menyapa();
        System.out.println("Usiaku : " + mahasiswa.hitungUsia() + " tahun");

        Mahasiswa mahasiswa2 =new Mahasiswa("19631131","Adawiyah","27-02-1997");
        mahasiswa2.tampilkanAtribut();

    }
}
