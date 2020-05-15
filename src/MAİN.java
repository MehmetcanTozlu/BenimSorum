import java.util.Scanner;
public class MAİN {
    public static void main(String[] args) {
        //POLYMORPHİSM - INHERİTANCE kullanarak araba seçme programı yazıyoruz...
        
        System.out.println("Araba Seçme ve Özelliklerini Görüntüleme Programına HOŞGELDİNİZ...");
        System.out.println("Çıkış için 0'ı tuşlayınız...");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Görüntülemek İstediğiniz Araçların İsimleri : ");
        System.out.println("****************************************************");
        String isimler = "Chevrolet\n"
                        +"Dodge\n"
                        +"Ferrari\n"
                        +"Koenigsegg\n"
                        +"Lamborghini\n"
                        +"Mercedes\n"
                        +"Nissan\n"
                        +"Range\n"
                        +"Ruf\n"
                        +"Shelby";
            System.out.println(isimler);
            System.out.println("****************************************************");
        while(true){
            System.out.println("Seçmek istediğiniz arabanın adını giriniz...");
            String islem = sc.nextLine();
            if(islem.endsWith("0")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else{
                ArabaGalerisi galeri = new ArabaGalerisi();
                Araba araba = galeri.ArabaCesiti(islem);
                
                if(araba == null){
                    System.out.println("Lütfen Geçerli Bir İsim Giriniz...");
                }
                else{
                    araba.bilgileriGoster();
                }
            }
        }
    }
}