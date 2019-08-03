package day3.inheritance;

public class Animal {
    protected String name;
    protected String color;

    public void whatEat(String food) {
        System.out.println(food);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
