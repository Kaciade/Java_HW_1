// Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Task_1 {
    public static void main(String[] args) {
        int [] loc = {413, 812, 250, 584, 933, 767};
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] > max){
                max = loc[i];
            }
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println("Min = " + min + "\nMax = " + max);
    }
}
