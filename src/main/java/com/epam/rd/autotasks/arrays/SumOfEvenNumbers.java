package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
  /*      int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
*/

//examlple
        int[]vals = new int[]{-2,10,0,5};
        int result = SumOfEvenNumbers.sum(vals);
        System.out.println(result == 8); // true
    }

    public static int sum(int[] array){

        //put your code here

        if (array == null || array.length == 0){
            return 0;
        }

        int sum = 0;

        /*for (int num : array) {
            if ((array[num] % 2) == 0){
                sum = sum + array[num];
            }
        }*/

        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sum = sum + array[i];
            }
        }

        return sum;


        //throw new UnsupportedOperationException();
    }
}
