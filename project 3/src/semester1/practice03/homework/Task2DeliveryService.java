package semester1.practice03.homework;

import java.util.Scanner;

public class Task2DeliveryService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== ТАРИФІКАТОР СЛУЖБИ ДОСТАВКИ ===");
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();
        System.out.print("Введіть відстань транспортування (км): ");
        int distance = scanner.nextInt();
        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int deliveryType = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String premiumInput = scanner.nextLine();

        if (weight <= 0 || weight > 50.0) {
            System.out.println("Помилка: Вага має бути більшою за 0 кг та не перевищувати 50.0 кг!");
            scanner.close();
            return;
        }
        if (distance <= 0) {
            System.out.println("Помилка: Відстань доставки має бути більшою за 0 км!");
            scanner.close();
            return;
        }
        double baseTariff = 0;
        String deliveryName = "";
        switch (deliveryType) {
            case 1 -> {
                baseTariff = 50.0;
                deliveryName = "Відділення";
            }
            case 2 -> {
                if (weight > 15.0) {
                    System.out.println("Помилка: Поштомат не приймає габаритні посилки вагою понад 15 кг!");
                    scanner.close();
                    return;
                }
                baseTariff = 60.0;
                deliveryName = "Поштомат";
            }
            case 3 -> {
                baseTariff = 100.0;
                deliveryName = "Кур'єр";
            }
            default -> {
                System.out.println("Помилка: Невідомий тип пункту призначення!");
                scanner.close();
                return;
            }
        }
        double distanceSurcharge = 0;
        if (distance <= 50) {
            distanceSurcharge = 0;
        } else if (distance <= 200) {
            distanceSurcharge = 35.0;
        } else {
            distanceSurcharge = 80.0;
        }
        double sumBeforeDiscount = baseTariff + distanceSurcharge;

        boolean isPremium = premiumInput.equalsIgnoreCase("так");

        double totalToPay = isPremium ? sumBeforeDiscount * 0.8 : sumBeforeDiscount;
        String clientStatus = isPremium ? "Premium (-20%)" : "Звичайний (0%)";

        // Виведення результату
        System.out.println();
        System.out.println("------------- НАКЛАДНА ДОСТАВКИ -------------");
        System.out.println("Тип доставки:              " + deliveryName + " (базовий тариф: " + baseTariff + " грн)");
        System.out.println("Доплата за відстань:       " + distanceSurcharge + " грн (" + distance + " км)");
        System.out.println("Сума до знижки:            " + sumBeforeDiscount + " грн");
        System.out.println("Статус клієнта:            " + clientStatus);
        System.out.println("---------------------------------------------");
        System.out.println("РАЗОМ ДО СПЛАТИ:           " + totalToPay + " грн");
        System.out.println("=============================================");

        scanner.close();
    }
}
