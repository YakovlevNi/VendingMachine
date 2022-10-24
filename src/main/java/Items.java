public enum Items {
    ЧИПСЫ(1, 100), СУХАРИКИ(2, 55), ВОДА(3, 30), СОК(4, 50), ШОКОЛАД(5, 60), ПРЯНИК(6, 50);
    private int price;
    private int id;

    Items(int id, int price) {
        this.id = id;
        this.price = price;

    }

    public int getPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }

    public static int valueOf(int itemSelected) {
        for (Items items : Items.values()) {
            if (itemSelected == items.id) {
                return items.getPrice();
            }
        }
        return itemSelected;
    }
}
