public class Shelby_Mustang_GT500 extends Araba{
    
    private double motor;
    
    public Shelby_Mustang_GT500(String marka, String model, String renk, int hiz, double ivme, int beygir, double motor){
        super(marka, model, renk, hiz, ivme, beygir);
        this.motor = motor;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Motor : "+ motor);
    }
    
    
    
}