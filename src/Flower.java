public class Flower {
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;
    private final String flowerName;
    public Flower(String flowerName, String flowerColor, String country, float cost) {
        this.flowerName = flowerName;
        if (flowerColor == null || flowerColor.length() == 0) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.length() == 0) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        this.lifeSpan = 1;
    }
    public Flower(String flowerName, String flowerColor, String country, float cost, int lifeSpan) {
        this.flowerName = flowerName;
        if (flowerColor == null || flowerColor.length() == 0) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.length() == 0) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Цветок: " + flowerName +
                ". Цвет цветка: "  + flowerColor +
                ". Страна происхождения: " + country +
                ". Цена: " + cost +
                ". Данный цветок простоит " + lifeSpan +
                " дней!";
    }
}
