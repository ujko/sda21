package day4.enumTest;

public class EnumMock {
    public static final EnumMock RED = new EnumMock();
    public static final EnumMock BLACK = new EnumMock();
    private EnumMock(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
