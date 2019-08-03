package day3.interfaces;

public class HouseTest {

    public static void main(String[] args) {
        Building b = new House();
        Building b1 = new Block();
        b1.method();
        Building[] buildings = {b,b1};
        for (Building bb : buildings) {
            bb.sum(2,3);
        }
    }
}
