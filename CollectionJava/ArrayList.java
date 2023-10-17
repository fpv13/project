package CollectionJava;

/*
Бухгалтерия
*/

    public class ArrayList {
        public static java.util.ArrayList<String> waitingEmployees = new java.util.ArrayList<>();
        public static java.util.ArrayList<String> alreadyGotSalaryEmployees = new java.util.ArrayList<>();

        public static void initEmployees() {
            waitingEmployees.add("Гвинно");
            waitingEmployees.add("Гунигерд");
            waitingEmployees.add("Боргелейф");
            waitingEmployees.add("Нифрод");
            waitingEmployees.add("Альбиуф");
            waitingEmployees.add("Иногрим");
            waitingEmployees.add("Фриле");
        }

        public static void main(String[] args) {
            initEmployees();
//            waitingEmployees.set(0, null);
            System.out.println("WAIT "+waitingEmployees.get(0));
            System.out.println("LOADING....");
            paySalary(waitingEmployees.get(0));
        }

        public static void paySalary(String name) {
            //напишите тут ваш код
            if(name.equals(null)){
             name=null;
            }
            else {
                alreadyGotSalaryEmployees.add(0,name);
                System.out.println("PAYED "+alreadyGotSalaryEmployees.get(0));
                waitingEmployees.set(0,null);
                System.out.println("WAIT "+waitingEmployees.get(0));
            }
        }
    }

