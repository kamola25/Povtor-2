public class Cube extends Toys{
    private int side;

    public Cube(String name, int size, Color color, int side) {
        super(name, size, color);
        this.side = side;
    }
    public int calculatePerimeterToys() {
        return 4*side;
    }
    @Override
    public void print() {
        System.out.println("Toys{" +
                "\nName='" + getName() +
                "\nSize=" + getSize() +
                "\nColor=" + getColor() +
                "\nPerimeter="+calculatePerimeterToys()+
                '}');

    }
}
