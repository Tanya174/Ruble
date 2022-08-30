public class Ruble {
    public static void main(String[] args) {

        int initialAccount = 858;
        int balanceRefill = 1003;

        int bonus;
        if (balanceRefill > 1000) {
            bonus = balanceRefill / 100;
        } else {
            bonus = 0;
        }
        int sum = initialAccount + balanceRefill + bonus;
        System.out.println("Сумма бонусных рублей составила " + bonus + " рубль(ей)");
        System.out.println("Итоговый счет составил " + sum + " рубль(ей)");

    }
}
