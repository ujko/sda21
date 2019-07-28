package day2;

public class DogTest {

    public static void main(String[] args) {

        Dog[] dogs = new Dog[2];
        var dog1 = new Dog("Shiba inu", "samica");
        dog1.setWiek(3);
        dogs[0] = dog1;
        dogs[1] = new Dog("Hasky", "Sasha");
        dogs[1].setWiek(5);

        for (Dog x : dogs) {
            System.out.println(x);
        }
    }
}
