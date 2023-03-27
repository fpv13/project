public class ModificationClasses {
    public static void main(String[] args) {

        PersonModClasses person = new PersonModClasses("ROMAN", "PETROVICH");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());


    }

    //    1. Модификаторы доступа
//    Перед каждым методом программист может указать так называемые модификаторы доступа. К ним относятся ключевые слова: public, protected, private.
//
//    Эти «модификаторы доступа» позволяют ограничивать доступ к методу из других классов.
//
//    Например, если перед объявлением метода написать ключевое слово private, этот метод можно будет вызывать только из того же класса, в котором он объявлен. Ключевое слово public разрешает обращение к помеченному методу из любого метода любого класса.
//
//    Всего таких модификаторов 3, а типов доступа к методу — 4, ведь отсутствие модификатора доступа тоже что-то значит.
//
//    Доступ из...
//    Модификаторы	    Любого класса	Класса-наследника	Своего пакета	Своего класса
//    public	        Есть	Есть	Есть	Есть
//    protected	        Нет	    Есть	Есть	Есть
//    без модификатора	Нет	    Нет	    Есть	Есть
//    private	        Нет	    Нет	    Нет	    Есть
//1. Модификатор public.
//
//    К методу (переменной или классу), помеченному модификатором public, можно обращаться из любого места программы. Это самая высокая степень открытости – никаких ограничений нет.
//
//2. Модификатор private.
//
//    К методу (переменной или классу), помеченному модификатором private, можно обращаться только из того же класса, где он объявлен. Для всех остальных классов помеченный метод (или переменная) – невидимы и «как бы не существуют». Это самая высокая степень закрытости — только свой класс.
//
//3. Без модификатора (модификатор по умолчанию).
//
//    Если метод (или переменная) не помечены никаким модификатором, считается, что они помечены «модификатором по умолчанию». Переменные или методы с таким модификатором (т.е. вообще без какого-нибудь) видны всем классам пакета, в котором они объявлены. И только им. Этот модификатор еще иногда называют package, намекая, что доступ к переменным и методам открыт для всего пакета, в котором находится их класс
//
//4. Модификатор protected.
//
//    Если метод помечен модификатором protected, к нему можно обращаться из того же класса, того же пакета и классов наследников (классов, унаследованных от класса, в котором объявлен метод). Эту тему разберем подробнее в квесте Java Core.
//
//    До конца квеста Java Syntax вы можете всем своим методам (а также классам и переменным класса) указывать модификатор public. Другие модификаторы вам понадобятся, когда мы начнем активно изучать ООП.
//
//    Зачем нужны модификаторы доступа?
//
//    Все дело в больших проектах, которые пишут десятки и сотни программистов одновременно.
//
//    Иногда бывают ситуации, когда программист хочет разделить слишком большой метод своего класса на части и вынести часть кода во вспомогательные методы. Но вместе с тем он не хочет, чтобы другие программисты вызывали эти вспомогательные методы, т.к. тогда код его класса может работать неправильно.
//
//    Вот и придумали такие модификаторы доступа. Пометил вспомогательный метод словом private, и никакой код кроме вашего класса не сможет увидеть ваш вспомогательный метод.
//

}
