// Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.


public class Task_4 {
    public static void main(String[] args) {
         int[] trialArray = {0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0};

        printArrLine(getArrayWithShift(trialArray,2));
    }
    
    public static int[] getArrayWithShift(int[] arr, int shift) {
        if (shift > 0) {
            for (int s = 1; s <= shift; s++) {
                int elemshift = arr[arr.length - 1];
                for (int i = arr.length - 2; i >= 0; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = elemshift;
            }
        } else if (shift < 0) {
            for (int s = shift; s <= -1; s++) {
                int elemshift = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    arr[i - 1] = arr[i];
                }
                arr[arr.length - 1] = elemshift;
            }
        }
        return arr;
    }
    public static void printArrLine(int[] a) {
        for (int elem : a) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
