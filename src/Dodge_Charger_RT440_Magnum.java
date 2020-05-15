public class Dodge_Charger_RT440_Magnum extends Araba{
    
    private double motor;
    
    public Dodge_Charger_RT440_Magnum(String marka, String model, String renk, int hiz, double ivme, int beygir, double motor){
        super(marka, model, renk, hiz, ivme, beygir);
        this.motor = motor;
    }
    @Override
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Motor : "+ motor);
    }
    
}
