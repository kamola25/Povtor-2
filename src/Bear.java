public class Bear extends Toys{

    public Bear(String name, int size, Color color) {
        super(name, size, color);
    }
    @Override
    public void print() {
        System.out.println("Toys{" +
                "\nName='" + getName() +
                "\nSize=" + getSize() + " cm"+
                "\nColor=" + getColor() +
                '}');

    }
}
