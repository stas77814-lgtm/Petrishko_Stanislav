import java.util.Scanner;

public class Task3CinemaBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] hall = new char[ 5 ][ 6 ];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                hall[i][j] = 'O';
            }
        }
        int choice = -1;
        while (choice != 0) {
            System.out.println("\n=== ТЕРМІНАЛ КІНОТЕАТРУ: ЗАЛ №1 ===");
            System.out.println("1 - Показати схему залу");
            System.out.println("2 - Забронювати квиток");
            System.out.println("3 - Фінансова каса залу");
            System.out.println("0 - Завершити роботу");
            System.out.print("Ваш вибір: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n      1  2  3  4  5  6");
                    for (int i = 0; i < 5; i++) {
                        System.out.print("Р" + (i + 1) + ":  ");
                        for (int j = 0; j < 6; j++) {
                            System.out.print("[" + hall[i][j] + "]");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Введіть номер ряду (1-5): ");
                    int row = scanner.nextInt();
                    System.out.print("Введіть номер місця (1-6): ");
                    int seat = scanner.nextInt();
                    int r = row - 1;
                    int c = seat - 1;
                    if (r < 0 || r >= 5 || c < 0 || c >= 6) {
                        System.out.println("Помилка! Невірний номер ряду або місця.");
                    } else if (hall[r][c] == 'X') {
                        System.out.println("Це місце вже зайняте!");
                    } else {
                        hall[r][c] = 'X';
                        System.out.println("Місце [Ряд " + row + ", Місце " + seat + "] успішно заброньовано!");
                    }
                    break;
                case 3:
                    int booked = 0;
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (hall[i][j] == 'X') {
                                booked++;
                            }
                        }
                    }
                    int free = 30 - booked;
                    double percent = (booked / 30.0) * 100;
                    double money = booked * 180;
                    System.out.println("\n--- СТАТИСТИКА ЗАЛУ ---");
                    System.out.println("Усього місць:       30");
                    System.out.println("Зайнятих місць:     " + booked);
                    System.out.println("Вільних місць:      " + free);
                    System.out.printf("Заповненість залу:  %.2f%%\n", percent);
                    System.out.printf("Загальна виручка:   %.2f грн\n", money);
                    System.out.println("=======================");
                    break;
                case 0:
                    System.out.println("Роботу завершено.");
                    break;
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
            }
        }

        scanner.close();
    }
}
