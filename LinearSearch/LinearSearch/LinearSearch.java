package osunram.LinearSearch.LinearSearch;

public class LinearSearch {

    public static void main(String[] args) {

        String[] arr = { "How", "are", "you", "today", "I", "am", "feeling", "bad", "today", "the", "weather", "is",
                "cold" };

        int index = 0;
        // your goal is to see if they are doing good or bad
        // the name of the array you are using is called arr

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("good") || arr[i].equals("bad")) {
                System.out.println(arr[i] + " is " + i);
                index = i;
            }
        }

        arr[index] = "good";
        System.out.println(arr[index]);

        /*
         * int[] arr = { 46, 12, 23, 67, 8, 1, 32, 42, 467, 64, 86, 959 };
         * int goal = 86;
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == goal) {
         * System.out.print(goal + "found at" + i);
         * int index = i;
         * }
         * }
         */

    }

}
