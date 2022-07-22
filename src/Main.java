public class Main {
    public static void main(String[] args) {
        int price = 100_000;
        int bonus = 20;

        int miles = price / bonus;

        System.out.println((price) + " рублей стоимсоть билета.");
        System.out.println("За каждые " + (bonus) + " рублей начисляется 1 милля.");
        System.out.println("Полученный бонус: " + (price / bonus) + " начисленных милль.");
    }
}
