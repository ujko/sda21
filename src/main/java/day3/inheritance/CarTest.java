package day3.inheritance;

public class CarTest {

    public static void main(String[] args) {
//        carMethod1();

        Car[] cars = new Car[4];
        cars[0] = new BMW();
        cars[1] = new Fiat();
        cars[2] = new Fiat();
        cars[3] = new BMW();

        for(Car c : cars) {
//            c.ride(c.name);
            c.doSth();
//            if(c instanceof BMW) {
//                BMW b = (BMW) c;
//                b.bmw();
//            } else if(c instanceof Fiat) {
//                Fiat b = (Fiat) c;
//                b.fiat();
//            }
        }
    }

    private static void carMethod1() {
        Car c = new BMW();
        c.name = "BMW";
        c.ride(c.name);

        Car cc = new Car("") {
            @Override
            public void doSth() {
                System.out.println("inna implementacja");
            }
        };
        cc.doSth();
    }
}
