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
        vendingMachine.displayMoney();
        int addedMoney = scanner.nextInt();
        vendingMachine.enterMoney(addedMoney);


    }
}
