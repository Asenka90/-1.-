package Homework1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
//каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов 
//не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
//которое пользователь может увидеть - RuntimeException, т.е. ваше


import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(privateArray(new int[]{10, 4}, new int[]{2, 2})));
    }

    public static int[] privateArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинны массивов не равны!");
        }
        int[] privArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0");
            }
            privArr[i] = arr1[i] / arr2[i];
        }
        return privArr;
    }
}