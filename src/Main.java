public class Main {
    public static void main(String[] args) {

        System.out.println("«Получи рубль за каждые 100»");

        int balance = 200;
        int refill = 1000;

        int bonus;
        if (refill <= 1000) {
            bonus = 0;
        } else {
            bonus = refill / 100;
        }
        int total = balance + refill + bonus;
        System.out.println(" Ваш баланс: " + balance);
        System.out.println(" Сумма пополнения: " + refill);
        System.out.println(" Ваш бонус: " + bonus);
        System.out.println(" Баланс после пополнения: " + total);
    }
}