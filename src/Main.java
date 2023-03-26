public class Main {
    public static void main(String[] args) {

        int firstAmount = 400;
        int topUp = 1100;

        int bonus;
        if (firstAmount + topUp > 1000) {
            bonus = (firstAmount + topUp - 1000) / 100;
        }
        else {
            bonus = 0;
        }
        System.out.println(bonus);
        int sum = firstAmount + topUp + bonus;
        System.out.println(sum);
    }
}