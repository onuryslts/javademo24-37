public class Main {
    public static void main(String[] args) {
       sayiBulmaca();
       sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = {1, 2, 5, 7, 9, 10};
        int aranacak = 7;
        boolean sayiVarMi = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                sayiVarMi = true;
                break;
            }
        }
        if (sayiVarMi) {
            mesajVer(aranacak+" Sayısı var");
        } else {
            mesajVer(aranacak+" Sayısı Yok");


        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}