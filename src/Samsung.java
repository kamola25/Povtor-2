public class Samsung extends Phone{
    private String gmail;


    public Samsung(String name, int ozy, int pzy, OperatingSystem operating, Color color, double version, String gmail) {
        super(name, ozy, pzy, operating, color, version);
        this.gmail = gmail;

    }
    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public void print() {
        System.out.println("Samsung {" + getName() +
                "\nOzy: "+ getOzy() +
                "\nPzy: "+getPzy() +
                "\nOperating system: " + getOperating()+
                "\nGmail: " + getGmail() +
                '}');

    }
}
