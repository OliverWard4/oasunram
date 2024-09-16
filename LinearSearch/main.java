package osunram.LinearSearch;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        // int [] davis = new int [4];

        String[] davis = new String[5];

        davis[0] = "d";
        davis[1] = "a";
        davis[2] = "v";
        davis[3] = "i";
        davis[4] = "s";

        for (int i = 0; i < davis.length; i++) {
            System.out.print(davis[i]);

        }
        System.out.println("\n_________________________________");

        ArrayList<String> Suzy = new ArrayList<String>();
        Suzy.add("S");
        Suzy.add("u");
        Suzy.add("z");
        Suzy.add("y");

        for (int i = 0; i < Suzy.size(); i++) {
            System.out.print(Suzy.get(i));
        }
    }
}
