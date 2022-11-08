public abstract class Phone implements Printable {
    private String name;
    private int ozy;
    private int pzy;
    private OperatingSystem operating;
    private Color color;
    private double version;

    public Phone(String name, int ozy, int pzy, OperatingSystem operating, Color color, double version) {
        this.name = name;
        this.ozy = ozy;
        this.pzy = pzy;
        this.operating = operating;
        this.color = color;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOzy() {
        return ozy;
    }

    public void setOzy(int ozy) {
        this.ozy = ozy;
    }

    public OperatingSystem getOperating() {
        return operating;
    }

    public void setOperating(OperatingSystem operating) {
        this.operating = operating;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    } public int getPzy() {
        return pzy;
    }

    public void setPzy(int pzy) {
        this.pzy = pzy;
    }    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}