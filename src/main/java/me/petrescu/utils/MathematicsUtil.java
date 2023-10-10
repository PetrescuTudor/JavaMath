package me.petrescu.utils;

public class MathematicsUtil {

    public static boolean isFibonnaci(int integer) {
        int first = 0;
        int second = 1;
        do {
            int first_backup = first;
            first = second;
            second = first_backup + second;
        } while (second < integer);
        if (integer == second) {
            return true;
        }
        return false;
    }

}
