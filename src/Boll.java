public class Boll extends Toys{
    private int radius;

    public Boll(String name, int size, Color color, int radius) {
        super(name, size, color);
        this.radius = radius;
    }


    public int calculatePerimeterToys() {
        return (int) (2*Math.PI*radius);
    }
    @Override
    public void print() {
        System.out.println("Toys{" +
                "\nName='" + getName() +
                "\nSize=" + getSize() +
                "\nColor=" + getColor() +
                "\nPerimeter=" + calculatePerimeterToys()+
                '}');


    }
}
