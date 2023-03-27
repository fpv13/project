package arrayLessons;

import java.util.Arrays;
//Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result. Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
//        Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.
//        При тестировании значения полей класса Solution будут разными, учти это.
public class ArrayCopyOfRange {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static void main(String[] args) {
        if(array.length%2==0){
            result [0] = Arrays.copyOfRange(array,0,(array.length/2));
            result [1] = Arrays.copyOfRange(array,(array.length/2),array.length);
        }else {
            result [0] = Arrays.copyOfRange(array,0,(array.length-(array.length/2)));
            result [1] = Arrays.copyOfRange(array,(array.length-(array.length/2)),array.length);
        }
        System.out.println(Arrays.deepToString(result));
    }
//    3. Метод Arrays.copyOfRange()
//    А что делать, если вы хотите получить массив длиной 5 из массива длины 10, но чтобы в нем были не первые 5 элементов, а 5 последних?
//
//    Именно для этого случая вам пригодится еще один метод класса Arrays – метод Arrays.copyOfRange() Вот как выглядит его вызов:
//
//    тип[] имя2 = Arrays.copyOfRange(имя, первый, последний);
//    Этот метод тоже создает новый массив, но заполняет его данными из произвольного места исходного массива. Где первый и последний — это номера первой и последней ячеек, которые должны быть в новом массиве.
//
//    По старой доброй традиции Java, последний элемент не входит в диапазон.
//    Пример:
//
//    int[] x = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//
//    int[] x2 = Arrays.copyOfRange(x, 5, 10);
//    String str2 = Arrays.toString(x2);
//
//    int[] x3 = Arrays.copyOfRange(x, 5, 15);
//    String str3 = Arrays.toString(x3);
//
//
//    Переменная str2 содержит значение:
//            "[16, 17, 18, 19, 20]"
//
//    Переменная str3 содержит значение:
//            "[16, 17, 18, 19, 20, 0, 0, 0, 0, 0]"
}
