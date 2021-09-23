

import java.util.Scanner;
public class test {

    public static void main(String[] args) {
        System.out.println("Enter yor credit : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int sum = 0;
        int pay = 0;

        for (int i =0; i<3; i++)
        {
            pay= amount/100*10;
            sum=amount-pay;
            amount=sum;
        }
        System.out.println("Ostatok za 3 mesyaca: "+sum+" (((Prixodite ebat' esche , rad'i vas naebat')))");
        }
        }


