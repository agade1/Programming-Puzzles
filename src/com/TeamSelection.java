

import java.util.ArrayList;
import java.util.Collections;

/**
 Problem Statement :

 Developed BY - Amol Gade
 */

    public class TeamSelection {

    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> Temp_list;
    public static void main(String[] args) {

        int[] score = {1,2,3,4,5,6};
        System.out.println("Selected Team Total " + teamFormation(score, 4,2));

    }

    static long teamFormation(int[] score, int team, int m) {
    int total =0;

        for (int i = 0; i < score.length; i++) {
            list.add(score[i]);
        }

        for (int i = 0; i < team; i++) {
            Temp_list = new ArrayList<>();

            for (int j = 0; j < m; j++) {
                Temp_list.add(list.get(j));
                Temp_list.add(list.get(list.size() - j-1));
            }
            int max = Collections.max(Temp_list);
            list.remove(list.indexOf(max));
            total += max;
        }
        return total;
    }
}
