package hu.nive.ujratervezes.addminimum;

import java.util.Arrays;

public class AddMinimum {
    public int[] addMinimum(int[] numbers, int n)  {
        if(numbers == null){
            throw new IllegalArgumentException();
        } else if(numbers.length == 0){
            return new int[0];
        } else if ( n < 1) {
            throw new IllegalArgumentException();
        }

        int minumum = numbers[0];

        for(int number : numbers){
            if(number < minumum){
                minumum = number;
            }
        }
        for(int i = n - 1; i< numbers.length;){
            int tmp = numbers[i];
            numbers[i] = tmp+minumum;
            i = i + n;
        }
        return numbers;
    }
}
