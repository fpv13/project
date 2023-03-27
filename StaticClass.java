public class StaticClass {

    public static void main(String[] args) {


        int[] array = {123, 7, -14, 67, 16, 98, 75, 576};
        System.out.println("В массиве: ");
        printArray(array);
        System.out.println("Минимальное число: " + getMinValue(array));
        System.out.println("Максимальное число: " + getMaxValue(array));

    }

    public static int getMaxValue(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int getMinValue(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

//    2. Ключевое слово static
//    Ключевое слово static превращает метод в статический. Что это такое, мы рассмотрим позднее, а сейчас просто запомним пару фактов про статические методы.
//
//            Факт 1. Статический метод не привязан ни к какому объекту, но относится к классу, в котором объявлен. Чтобы вызвать статический метод, нужно написать:
//
//            ИмяКласса.имяМетода()
//    Примеры статических методов:
//
//    Имя класса	Имя статического метода
//Thread.sleep()	Thread	sleep()
//Math.abs()	Math	abs()
//Arrays.sort()	Arrays	sort()
//    Имя класса перед именем статического метода можно не писать, если вы вызываете статический метод изнутри — из того же класса. Именно поэтому вам не нужно каждый раз писать Solution перед именами вызываемых статических методов.
//
//    Факт 2. Статический метод не может обращаться к нестатическим методам его же класса. Статический метод может обращаться только к статическим методам. Поэтому все методы, которые мы хотим вызвать из метода main, мы объявляем статическими.
//
//            Почему? Вы сами сможете ответить на этот вопрос, когда начнете изучать ООП и поймете, как устроены статические методы.
}
