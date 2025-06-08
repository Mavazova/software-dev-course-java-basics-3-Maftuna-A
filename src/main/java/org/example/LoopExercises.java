package org.example;

public class LoopExercises {
    public int sum(int n) {
        for (int i = 1; i <= n; i++) {
        }
        return 0;
    }

    public int sumUntilEven(int n) {
        int total = 0;
        int i = 1;

        while (i <= n) {
            total += i;

            if (total % 2 == 0) {
                break;
            }
            i++;
        }
        return  total;

    }
}
