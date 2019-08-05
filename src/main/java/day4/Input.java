package day4;

import javax.swing.*;

public class Input {

    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Wpisz cos");
        int czy_jestes_pewien = JOptionPane.showConfirmDialog(null, "Czy jestes pewien");
        if(czy_jestes_pewien == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Jestem pewien");
        }
        JOptionPane.showMessageDialog(null, s);
    }
}
