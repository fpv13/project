import java.util.Arrays;

public class ArrayFill {
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;
    public static void main(String[] args) {
        if(array.length%2==0){
            Arrays.fill(array,0,(array.length/2),valueStart);
            Arrays.fill(array,(array.length/2),array.length,valueEnd);
        }
        else {
            Arrays.fill(array,0,(array.length - (array.length/2)),valueStart);
            Arrays.fill(array,(array.length - (array.length/2)),array.length,valueEnd);
        }

        System.out.println(Arrays.toString(array));
//        1. Метод Arrays.fill()
//        Очень часто у Java-программистов при работе с массивами возникает задача: заполнить массив одинаковыми значениями. Можно, конечно, написать цикл и просто в цикле присвоить каждой ячейке массива определенное значение:
//
//        int[] x = new int[100];
//        for (int i = 0; i < x.length; i++)
//            x[i] = 999;
//        А можно просто вызвать метод Arrays.fill(), который делает точно то же самое: заполняет переданный массив переданным значением. Вот как это выглядит:
//
//        Arrays.fill(имя, значение)
//        И код из примера выше можно сделать немного компактнее и понятнее:
//
//        int[] x = new int[100];
//        Arrays.fill(x, 999);
//        А еще с помощью метода Arrays.fill() можно заполнить определенным значением не весь массив, а его часть:
//
//        Arrays.fill(имя, первый, последний, значение)
//        Где первый и последний — это номера первой и последней ячеек, которые нужно заполнить.
//
//        По старой доброй традиции Java, последний элемент не входит в диапазон.
//                Пример:
//
//        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        Arrays.fill(x, 3, 7, 999);
//
//
//        String str = Arrays.toString(x);
//
//
//        Заполняем ячейки x[3], x[4], x[5], x[6] значениями 999. Нумерация ячеек массива с нуля!
//
//                Переменная str содержит значение:
//        "[1, 2, 3, 999, 999, 999, 999, 8, 9, 10]"
//        Метод Arrays.fill() работает только с одномерными массивами. Если в него передать двумерный массив, он будет обработан как одномерный, со всеми вытекающими последствиями.
    }
}
