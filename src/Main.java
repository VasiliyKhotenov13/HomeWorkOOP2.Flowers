public class Main {
    public static void allFlowers(Flower[] flowers) {
        for (Flower item : flowers) {
            System.out.println(item.toString());
        }
    }
    public static void main(String[] args) {

        Flower[] flowers = new Flower[4];
        flowers[0] = new Flower("Роза обыкновенная", "", "Голландия",
                35.59f);
        flowers[1] = new Flower("Хризантема", "", "",
                15.00f, 5);
        flowers[2] = new Flower("Пион", "", "Англия",
                69.9f, 1);
        flowers[3] = new Flower("Гипсофила", "", "Турция",
                19.5f, 10);

        allFlowers(flowers);
    }
}