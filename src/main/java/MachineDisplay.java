import java.util.Scanner;

public class MachineDisplay implements VendingMachine {

    private int selectItem;
    Scanner password = new Scanner(System.in);


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
    public void enterCash(int money) {
        if (money >= Items.valueOf(this.selectItem)) {
            System.out.println("Вы внесли:" + money);
            int refund = money - Items.valueOf(this.selectItem);
            System.out.println("Ваша сдача:" + refund + "\n" + "Надеемся увидеть Вас снова!");
        } else System.out.println("Вам не хватает внесенных денег!");
    }

    @Override
    public void enterCard() {
        System.out.println("Cумма к оплате:" + Items.valueOf(this.selectItem));
        System.out.println("Приложите карту и введите пароль");
        int pin = password.nextInt();
        boolean random = Math.random() > 0.5;
        if (random == true) {
            System.out.println("Операция одобрена!" + "\n" + "Надеемся увидеть Вас снова!");
        } else System.out.println("На вашем счете недостаточно средств");


    }


}
