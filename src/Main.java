public class Main {
    public static void main(String[] args) {

        Phone Xiaomi = createObject("Xiaomi");
        System.out.println(Xiaomi);
        Phone Samsung = createObject("Samsung");
        Phone Iphone = createObject("Iphone");

        Cube cube = new Cube("Кубик-рубик",4,Color.COLORFUL,4);
        Bear bear = new Bear("Anny",15,Color.WHITE);
        Boll boll = new Boll("Boll",5,Color.RED,5);


        Printable [] printables = {Iphone,Samsung, Xiaomi,cube,bear,boll};
        for (int i = 0; i < printables.length; i++) {
            if (printables[i] instanceof Phone ) {
                System.out.println(((Phone) printables[i]));
            }else if (printables[i] instanceof Toys){
                System.out.println(((Toys)printables[i]));
            }
            System.out.println();
            printables[i].print();
        }

    }

    private static Phone createObject(String className) {
        switch (className) {
        case "Xiaomi":
            return new Xiaomi("Redmi Note 9",6,128,OperatingSystem.MIUI,Color.BLACK,
                    12.9,"Scanner");
        case "Iphone":
            return new Iphone("iPhone 6",1,16,OperatingSystem.IOS,0,
                    Color.GRAY,12.5,"Icloud",10);

            default:
            return new Samsung("Samsung A35",8,128,OperatingSystem.ANDROID,
                    Color.BLUE,11.0,"Google acc");

    }

    }
}