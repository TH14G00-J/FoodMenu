import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                CODIGO | ESPECIFIÇÃO      | PREÇO
                1      | CACHORRO QUENTE  | R$ 4.00
                2      | X-SALADA         | R$ 4.50
                3      | X-BACON          | R$ 5.00
                4      | TORRADA SIMPLES  | R$ 2.00
                5      | REFRIGERANTE     | R$ 1.50
                """);
        System.out.println("Choose the menu code: ");
        int itemCode = sc.nextInt();
        System.out.println("Quantity of this item: ");
        int quantity = sc.nextInt();
        double totalAmount;
        if (itemCode == 1) {
            totalAmount = 4.00 * quantity;
        } else if (itemCode == 2) {
            totalAmount = 4.50 * quantity;
        } else if (itemCode == 3) {
            totalAmount = 5.00 * quantity;
        } else if (itemCode == 4) {
            totalAmount = 2.00 * quantity;
        } else if (itemCode == 5) {
            totalAmount = 1.50 * quantity;
        } else {
            System.out.println("Invalid code");
            sc.close();
            return;
        }
        System.out.printf("Total: R$ %.2f%n", totalAmount);
    }
}