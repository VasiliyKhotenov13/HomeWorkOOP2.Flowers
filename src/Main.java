public class Main {
    public static void allFlowers(Flower[] flowers) {
        for (Flower item : flowers) {
            System.out.println(item.toString());
        }
    }

    public static void bouquetOfFlowers(Flower... flowers) {
        float totalCost = 0;
        int minLifeSpan = 999;
        for (Flower item: flowers) {
            if (item.lifeSpan < minLifeSpan) {
                minLifeSpan = item.lifeSpan;
            }
            totalCost += item.getCost();
            System.out.println(item);
        }
        totalCost = totalCost * 1.1f;
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Минимальная стойкость цветка: " + minLifeSpan);
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

        bouquetOfFlowers(flowers[0], flowers[0], flowers[0],
                flowers[1],flowers[1],flowers[1],flowers[1],flowers[1],
                flowers[3]);
    }
}