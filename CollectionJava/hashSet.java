package CollectionJava;
import java.util.HashSet;
public class hashSet {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        //напишите тут ваш код
        HashSet<String> arrayHashSet = new HashSet<>();
        for (int i = 0; i < strings.length; i++){
            arrayHashSet.add(strings[i]);
        }return arrayHashSet;
    }

}
//    Коллекция HashSet
//    Класс HashSet является типичным представителем коллекций типа «множество». Во многом он похож на класс ArrayList, и в каком-то смысле является его более примитивной версией.
//
//        Создать объект типа HashSet можно с помощью команды вида:
//
//        HashSet<Тип> имя = new HashSet<Тип>();
//        Где тип — это тип элементов, которые можно хранить в коллекции HashSet.
//
//        У класса HashSet есть такие методы:
//
//        Метод	Описание
//        boolean add(Тип value)
//        Добавляет элемент value в коллекцию
//        boolean remove(Тип value)
//        Удаляет элемент value из коллекции.
//        Возвращает true, если там такой элемент был
//        boolean contains(Тип value)
//        Проверяет, есть ли в коллекции элемент value
//        void clear()
//        Очищает коллекцию: удаляет все элементы
//        int size()
//        Возвращает количество элементов в коллекции
//        Пример использования множества.
//
//        Давайте напишем программу, которая прощается с пользователем, если он с ней поздоровался: если пользователь сказал привет. Для большего интереса «привет» можно будет говорить на нескольких языках.
//
//        Код	Примечание
//        HashSet<String> set = new HashSet<String>();
//
//        set.add("Привет");
//        set.add("Hello");
//        set.add("Hola");
//        set.add("Bonjour");
//        set.add("Cialo");
//        set.add("Namaste");
//
//        Scanner console = new Scanner(System.in);
//        String str = console.nextLine();
//
//        if (set.contains(str))
//        System.out.println("Да спаткання!");
//        Создаем объект типа HashSet, который хранит элементы типа String.
//
//
//        Заносим в set приветствия на разных языках.
//
//
//
//
//        Вводим с консоли слово,
//
//
//        если это слово есть в нашем множестве приветствий, то прощаемся (по-белорусски).