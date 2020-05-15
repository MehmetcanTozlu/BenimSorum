public class Nissan_Skyline_GTR_34 extends Araba{
   
    private double motor;
    private String nami;//Bu araca diğerlerinden farklı bir özellik ekliyoruz
    
    public Nissan_Skyline_GTR_34(String marka, String model, String renk, int hiz, double ivme, int beygir, double motor, String nami){
        super(marka, model, renk, hiz, ivme, beygir);
        this.motor = motor;
        this.nami = nami;
    }
//Araba sınıfındaki bilgileri tüm araba sınıfındakilere OVERRİDE ediyoruz    
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Motor : "+ motor);
        System.out.println("Namı : "+ nami);
    }
    
          
    
}
