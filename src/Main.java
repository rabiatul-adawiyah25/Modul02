import model.Mahasiswa;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("19631130","Rabiatul","27-03-1997");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());

    }
}
