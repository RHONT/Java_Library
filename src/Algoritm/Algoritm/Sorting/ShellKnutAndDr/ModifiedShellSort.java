package Algoritm.Algoritm.Sorting.ShellKnutAndDr;

import java.util.Arrays;
import java.util.Random;
//https://www.youtube.com/watch?v=X-Pef9LHGos&list=PLtNPgSbW9TX7acrQa2LeBAMGxO5WRAVsz&index=24
// С Шелллом все хорошо.
// Кнут велик, но реализация его в лекции была под сомнением.

interface StepGenerator {
    public int nextStep();
}

public class ModifiedShellSort {

    public static void main(String[] args) {
        int[] array = new Random().ints(20, 1, 101).toArray();
        System.out.println(Arrays.toString(array));
        shellSort(array, new KnuthStep(array));
        System.out.println(Arrays.toString(array));

    }

    public static void shellSort(int[] array, StepGenerator stepGen) {
        int step = stepGen.nextStep();
        for (; step > 0; ) {
            for (int i = step; i < array.length; i++) {
                for (int j = i; j >= step && array[j] < array[j - step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                }
            }
            step = stepGen.nextStep();
        }
    }
}

class ShellStep implements StepGenerator {
    private int step;

    public ShellStep(int[] array) {
        step = array.length;
    }

    @Override
    public int nextStep() {
        step = step / 2;
        return step;
    }

}

class HibbardStep implements StepGenerator {
    private int i;

    public HibbardStep(int[] array) {
        for (; (int) (Math.pow(2, i) - 1) < array.length; ) {
            i += 1;
        }
    }

    @Override
    public int nextStep() {
        i = i - 1;
        return (int) (Math.pow(2, i) - 1);
    }

}

class SedgewickStep implements StepGenerator {
    private int i;

    public SedgewickStep(int[] array) {
        long number = (long) (9 * (Math.pow(2, i) - Math.pow(2, i / 2)) + 1);
        for (; number < array.length; ) {
            i += 1;
            if (i % 2 == 0) {
                number = (long) (9 * (Math.pow(2, i) - Math.pow(2, i / 2)) + 1);
            } else {
                number = (long) (8 * Math.pow(2, i) - 6 * Math.pow(2, (i + 1) / 2) + 1);
            }
        }
    }

    @Override
    public int nextStep() {
        i = i - 1;
        if (i <= -1) {
            return 0;
        }
        if (i % 2 == 0) {
            return (int) (9 * (Math.pow(2, i) - Math.pow(2, i / 2)) + 1);
        } else {
            return (int) (8 * Math.pow(2, i) - 6 * Math.pow(2, (i + 1) / 2) + 1);
        }
    }

}

class KnuthStep implements StepGenerator {
    private int i;

    public KnuthStep(int[] array) {
        for (; (Math.pow(3, i) - 1) / 2 < array.length / 3; ) {
            i = i + 1;
        }
    }

    @Override
    public int nextStep() {
        int step = (int) ((Math.pow(3, i) - 1) / 2);
        i = i - 1;
        return step;
    }

}


