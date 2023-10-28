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
            for(int i = 0;i < waitingEmployees.size();i++){
                String s = waitingEmployees.get(i);
                System.out.println("#"+i+"___"+s+"___in_waitinglist___");

                paySalary(waitingEmployees.get(i));

                System.out.println(s+"___set___"+waitingEmployees.get(i)+"___in_waitinglist___");
                System.out.println("_______________________________");
            }
            System.out.println("Alrady pay");
            for(int i = 0;i < alreadyGotSalaryEmployees.size();i++){
                System.out.println("___________");

                System.out.println(alreadyGotSalaryEmployees.get(i));
            }
        }

        public static void paySalary(String name) {
            //напишите тут ваш код
            if (waitingEmployees.contains(name)) {
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(waitingEmployees.indexOf(name), null);
            }
        }
    }

