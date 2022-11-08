public class Xiaomi extends Phone{
    private String touchButton;



    public Xiaomi(String name, int ozy, int pzy, OperatingSystem operating, Color color, double version, String touchButton) {
        super(name, ozy, pzy, operating, color, version);
        this.touchButton = touchButton;
    }

    @Override
    public void print() {
        System.out.println("Xiaomi {" + getName() +
                "\nOzy: "+ getOzy() +
                "\nPzy: "+getPzy() +
                "\nOperating system: " + getOperating()+
                "\nTouch button: " + touchButton+'}');

    }


}
