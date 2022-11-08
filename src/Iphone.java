public class Iphone extends Phone{
    private String icloud;
    private int applePay;
    private int akb;


    public Iphone(String name, int ozy, int pzy, OperatingSystem operating, int akb, Color color, double version,
                  String icloud, int applePay) {
        super(name, ozy, pzy, operating, color, version);
        this.icloud = icloud;
        this.applePay = applePay;
    }
    public String getIcloud() {
        return icloud;
    }

    public void setIcloud(String icloud) {
        this.icloud = icloud;
    }

    public int getApplePay() {
        return applePay;
    }

    public void setApplePay(int applePay) {
        this.applePay = applePay;
    }

    public int getAkb() {
        return akb;
    }

    public void setAkb(int akb) {
        this.akb = akb;
    }

    @Override
    public void print() {
        System.out.println("Iphone {" + getName() +
                "\nOzy: "+ getOzy() +
                "\nPzy: "+getPzy() +
                "\nOperating system: " + getOperating()+
                "\nIcloud: " + getIcloud() + '\'' +
                "\nApplePay: " + getApplePay() +
                "\nAkb: " + getAkb() +
                '}');
    }


}
