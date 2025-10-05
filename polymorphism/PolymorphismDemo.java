public class PolymorphismDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();

        Calculator calc = new Calculator();
        System.out.println("Hasil Penjumlahan int: " + calc.add(5, 10));
        System.out.println("Hasil Penjumlahan double: " + calc.add(3.5, 2.7));
    }
}