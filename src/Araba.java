public class Araba {//SuperClass
//Araçların Özelliklerini private olarak giriyoruz    
    private String marka;
    private String model;
    private String renk;
    private int hiz;
    private double ivme;
    private int beygir;
//CONSTRUCTOR Yazıyoruz
    public Araba(String marka, String model, String renk, int hiz, double ivme, int beygir) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.hiz = hiz;
        this.ivme = ivme;
        this.beygir = beygir;
    }
//GETTER ve SETTER Metodlarımız    
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public int getHiz() {
        return hiz;
    }
    public void setHiz(int hiz) {
        this.hiz = hiz;
    }
    public double getIvme() {
        return ivme;
    }
    public void setIvme(double ivme) {
        this.ivme = ivme;
    }
    public int getBeygir() {
        return beygir;
    }
    public void setBeygir(int beygir) {
        this.beygir = beygir;
    }
 //Araç Bilgileri daha sonra bu fonksiyonu override ediyoruz
    public void bilgileriGoster(){
        System.out.println("Marka : "+ marka);
        System.out.println("Model : "+ model);
        System.out.println("Renk : "+ renk);
        System.out.println("Son Hız : "+ hiz);
        System.out.println("İvme "+ ivme);
        System.out.println("Beygir : "+ beygir);
    }
}