package day3.inheritance;

public class Zebra extends Animal {
    public Zebra() {
        this.name = "Zebra";
        this.color = "Yellow";
    }

    public void cage(String cage) {
        System.out.println("Zwierze " + this.name
                + " Koloru " + this.color
                + " Mieszka w klatce " + cage);
    }

    @Override
    public void whatEat(String food) {
        System.out.println("Zebra je " + food);
    }
}
