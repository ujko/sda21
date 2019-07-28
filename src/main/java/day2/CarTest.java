package day2;

public class CarTest {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setName("bmw");
        bmw.setColor("black");
        System.out.println(bmw);

        Car syrenka = new Car("Syrenka", "Ivory");
        syrenka.setName("Fiat");
        String s = syrenka.toString();
        System.out.println(bmw.equals(syrenka));
        System.out.println(Car.ENGINE);
        System.out.println(syrenka.getColor());

    }
}
