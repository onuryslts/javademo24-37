public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();

        int sonuc = dortIslem.Topla(10,2);
        System.out.println(sonuc);
        sonuc = dortIslem.Cikar(10,2);
        System.out.println(sonuc);
        sonuc = dortIslem.Carp(10,2);
        System.out.println(sonuc);
        sonuc = dortIslem.Bolme(10,2);
        System.out.println(sonuc);
    }
}