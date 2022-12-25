package Homework1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива
// и возвращающий новый массив, каждый элемент которого равен разности элементов
// двух входящих массивов в той же ячейке. Если длины массивов не равны,
// необходимо как-то оповестить пользователя.

import java.util.Arrays;
public class Task3 {
      public static void main(String[] args) {
        System.out.println(Arrays.toString(diffElemArrays(new int[]{2,3,3,2}, new int[]{1,2,3,4})));
      }

      public static int[] diffElemArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны!");
        }
        int[] result = new int[arr1.length];
        for (int i =0; i < result.length; i++) {
            result[i] = arr1[i] - arr2[i];
        } 
        return result;
      }
}