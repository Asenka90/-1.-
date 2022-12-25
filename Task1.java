package Homework1;
// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений
// вы тут сможете получить?

public class Task1 {
    public static int divide(int num1, int num2) {
        return num1/num2;
    }

    public static int getArrayElement(int[] array) {
        return array[100];
    }

    public static int getArrayLen(int[] array) {
        return array.length;
    }


    public static void main(String[] args) {
        System.out.println(divide(4,0));
        System.out.println(getArrayElement(new int[10])); 
        System.out.println(getArrayLen(new int[-1])); 
        }
}