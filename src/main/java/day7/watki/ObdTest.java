package day7.watki;

import day7.Obdarowujacy;

import java.util.ArrayList;
import java.util.List;

public class ObdTest {

    public static void main(String[] args) {
        List<Obdarowujacy> finalList = new ArrayList<>();
        int population = 800000000;
        int days = 0;

        while (finalList.size()< population) {
            days++;
            List<Obdarowujacy> dayList = new ArrayList<>();
            if (finalList.isEmpty()){
                dayList.add(new Obdarowujacy());
            }else {
                for (Obdarowujacy obdarowujacy:finalList){
                    if(obdarowujacy.mozeObdarowac()) {
                        dayList.add((obdarowujacy.obdaruj()));
                    }
                }
            }
            finalList.addAll(dayList);
        }
        System.out.println(days);
    }

}
