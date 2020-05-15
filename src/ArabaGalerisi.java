public class ArabaGalerisi {//Araçların Özelliklerini Tanımlıyoruz

    public Araba ArabaCesiti(String Araba_Markası){
        
        if(Araba_Markası.equals("Chevrolet")){
            return new Chevrolet_Corvette_Z06("Chevrolet", "Corvette Z06", "Siyah", 310, 3.6, 659, 6.1);
        }
        else if(Araba_Markası.equals("Dodge")){
            return new Dodge_Charger_RT440_Magnum("Dodge", "Charger RT440 Magnum", "Turuncu", 211, 5.9, 375, 3.0);
        }
        else if(Araba_Markası.equals("Ferrari")){
            return new Ferrari_LaFerrari("Ferrari", "LaFerrari", "Kırmızı", 360, 3.0, 963, 6.3);
        }
        else if(Araba_Markası.equals("Koenigsegg")){
            return new Koenigsegg_Agera_R("Koenigsegg", "Agera R", "Gri",399 , 2.8, 1140, 5.0);
        }
        else if(Araba_Markası.equals("Lamborghini")){
            return new Lamborghini_Huracan_Evo("Lamborghini", "Huracan Evo", "Beyaz", 325, 2.9, 630, 5.2);
        }
        else if(Araba_Markası.equals("Nissan")){
            return new Nissan_Skyline_GTR_34("Nissan", "Skyline GTR 34", "Gri Mavi", 250, 5.5, 280, 2.6, "Godzilla");
        }
        if(Araba_Markası.equals("Ruf")){
            return new Ruf_CTR3("RUF", "CTR 3", "Sarı", 320, 3.2, 600, 5.0);
        }
        else if(Araba_Markası.equals("Shelby")){
            return new Shelby_Mustang_GT500("Shelby", "Mustang GT500", "Gri", 207, 2.9, 355, 3.2);
        }
        else if(Araba_Markası.equals("Range")){
            return new Range_Rover_Evoque("Range Rover", "Evoque", "Siyah", 217, 7.6, 240, 2.0);
        }
        else if(Araba_Markası.equals("Mercedes")){
            return new Mercedes_Benz_Sel600("Mercedes Benz", "Sel 600", "Siyah", 201, 10.0, 250, 6.3);
        }
        else{
            return null;
        }
    }
}