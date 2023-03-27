package arrayLessons;

import java.util.Arrays;

public class ArrayCopyOf {
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str = Arrays.toString(x);
        System.out.println(str);
        int[] x2 = Arrays.copyOf(x, 5);
        String str2 = Arrays.toString(x2);
        System.out.println(str2);
        int[] x3 = Arrays.copyOf(x, 15);
        String str3 = Arrays.toString(x3);
        System.out.println(str3);
//        2. Метод Arrays.copyOf()
//        Как вы уже знаете, размер контейнера массива после его создания поменять нельзя.
//
//                А если очень хочется?
//
//                Ну, если очень хочется, то можно:
//
//        Создать новый массив нужной длины
//        Скопировать в него все элементы из первого массива.
//        Именно это, кстати, и делает метод Arrays.copyOf(). Вот как выглядит его вызов:
//
//        тип[] имя2 = Arrays.copyOf(имя, длина);
//        Этот метод не меняет существующий массив, вместо этого он создает новый массив и копирует в него элементы старого массива.
//
//        Если элементы не поместились (длина меньше длины существующего массива), то лишние значения игнорируются.
//
//        Если длина нового массива больше длины старого, ячейки заполняются нулями.
//
//        Пример:
//
//        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        int[] x2 = Arrays.copyOf(x, 5);
//        String str2 = Arrays.toString(x2);
//
//        int[] x3 = Arrays.copyOf(x, 15);
//        String str3 = Arrays.toString(x3);
//
//
//        Переменная str2 содержит значение:
//        "[1, 2, 3, 4, 5]"
//
//        Переменная str3 содержит значение:
//        "[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0]"
    }
}
