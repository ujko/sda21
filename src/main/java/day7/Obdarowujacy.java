package day7;

public class Obdarowujacy {

    int pozostaloDni = 3;

      public int getPozostaloDni() {
        return pozostaloDni;
    }

    public void setPozostaloDni(int pozostaloDni) {
        this.pozostaloDni = pozostaloDni;
    }

    public boolean mozeObdarowac() {
          return pozostaloDni >0;
    }
    public Obdarowujacy obdaruj() {
          pozostaloDni -=1;
          return new Obdarowujacy();
    }

}
