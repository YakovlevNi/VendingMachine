public class MachineDisplay implements VendingMachine {

    private int selectItem;


    @Override
    public void displayItems() {
        System.out.println("Выберите товары: ");

        for (Items items : Items.values()) {
            System.out.println(items.getId() + "-----" + items.name() + "-----" + items.getPrice() + " рублей");
        }

    }

    @Override
    public void selectItem(int item) {
        if (item <= 6 & item > 0) {
            this.selectItem = item;
        } else {
            System.out.println("Товара № " + item + " нет в списке." + "\n" + "Перепроверьте ввод");
            System.exit(1);
        }
    }

    @Override
    public void displayMoney() {
        System.out.println("Пожалуйста внесите деньги " + "\n" + "Аппарат принимает монеты и купюры номиналом : 1;2;5;10;50;100;200 рублей");

    }

    @Override
    public void enterMoney(int money) {
        if (money >= Items.valueOf(this.selectItem)) {
            System.out.println("Вы внесли:" + money);
            int refund = money - Items.valueOf(this.selectItem);
            System.out.println("Ваша сдача:" + refund + "\n" + "Надеемся увидеть Вас снова!");
        } else System.out.println("Вам не хватает внесенных денег!");


    }


}
