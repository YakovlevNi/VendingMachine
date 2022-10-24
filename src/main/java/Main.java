import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        VendingMachine vendingMachine = new MachineDisplay();
        vendingMachine.displayItems();
        String item = scanner.nextLine();
        int itemNumber = Integer.parseInt(item);
        vendingMachine.selectItem(itemNumber);

        System.out.println("Выберите тип оплаты:" + "\n" + "Для оплаты наличными нажмите 0" + "\n" + "Для оплаты картой нажмите 1");
        int paymentType = scanner.nextInt();
        if (paymentType == 0) {
            vendingMachine.displayMoney();
            System.out.println("Введите сумму");
            int addedMoney = scanner.nextInt();
            vendingMachine.enterCash(addedMoney);
        }
        if (paymentType == 1) {
            vendingMachine.enterCard();
        }
        if (paymentType != 1 && paymentType != 0) {
            System.out.println("Неверный тип оплаты!");
        }


    }
}
