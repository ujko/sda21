package day2;

public class Dog {
    private String plec;
    private String rasa;
    private int wiek;

    public Dog(String rasa, String plec) {
        this.rasa = rasa;
        this.plec = plec;
        this.wiek = 0;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "rasa='" + rasa + '\'' +
                ", plec='" + plec + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
