//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 17;
        double height = 17.03;
        String firstLetter = "C";
        boolean isStudent = true;
        System.out.println(age);
        System.out.println(height);
        System.out.println(firstLetter);
        System.out.println(isStudent);
        System.out.println();

        byte temperature = -15;
        short currentYear = 2026;
        int cityPopulation = 1200000;
        long worldPopulation = 8100000000L;
        System.out.println(temperature);
        System.out.println(currentYear);
        System.out.println(cityPopulation);
        System.out.println(worldPopulation);
        System.out.println();

        float floatValue = 1.1234567f;
        double doubleValue = 1.123456789012345;
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println();

        char symbol1 = 'J';
        char symbol2 = 74;
        char symbol3 = '\u004A';
        System.out.println(symbol1);
        System.out.println(symbol2);
        System.out.println(symbol3);
        System.out.println();

        boolean isJavaFun = true;
        boolean isFishFly = false;
        boolean isSkyBlue = true;
        System.out.println(isJavaFun);
        System.out.println(isFishFly);
        System.out.println(isSkyBlue);
        System.out.println();

        final double GRAVITY = 9.81;
        final int DAYS_IN_WEEK = 7;
        final String UNIVERSITY_NAME = "Львівська Політехніка";
        System.out.println(GRAVITY);
        System.out.println(DAYS_IN_WEEK);
        System.out.println(UNIVERSITY_NAME);
        System.out.println();

        int intVal = 250;
        double doubleVal = intVal;
        System.out.println("int: " + intVal);
        System.out.println("double: " + doubleVal);
        System.out.println();

        double priceWithPennies = 49.99;
        int roundedPrice = (int) priceWithPennies;
        System.out.println(roundedPrice);
        System.out.println();

        int number1 = 5;
        double user_weight = 72.5;
        String Usercity = "Kyiv";
        boolean is_valid_user = true;
        System.out.println(number1 + "," + user_weight + "," + Usercity + "," + is_valid_user);
        System.out.println();

        String firstName = "Стас";
        String lastName = "Петришко";
        System.out.println("Мене звати " + firstName + " " + lastName + ", мені " + age + " років.");
        System.out.println();

        int a = 10;
        int b = 20;
        System.out.println("Сума без дужок: " + a + b);
        System.out.println("Сума з дужками: " + (a + b));
        System.out.println();

        String login = "StasPetrishko";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + " (роль: " + role + ") має пошту: " + email);
        System.out.println();

        String productName = "Ноутбук";
        int quantity = 2;
        double pricePerUnit = 24500.50;
        System.out.println("ЧЕК:\n" + "Товар: " + productName + "\n" + "Кількість: " + quantity + " шт.\n" + "Ціна: " + pricePerUnit + " грн");
        System.out.println();

        String currency = "UAH";
        int hryvnias = 1500;
        int kopecks = 75;
        System.out.println("Поточний баланс: " + hryvnias + "." + kopecks + " " + currency);
        System.out.println();

        String protocol = "https://";
        String host = "api.example.com";
        String endpoint = "/users";
        int userId = 42;
        System.out.println("Запит відправлено на: " + protocol + host + endpoint + "/" + userId);
        System.out.println();

        String language = "Java";
        int level = 1;
        boolean isReady = true;
        System.out.println("Мова: " + language + " | Рівень: " + level + " | Готовність до практики: " + isReady);
        System.out.println();

        int number = 19;
        int remainder = number % 2;
        System.out.println("Число " + number + " при діленні на 2 дає остачу: " + remainder);
        System.out.println();

        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int remainderSeconds = totalSeconds % 60;
        System.out.println("Загальний час: " + totalSeconds + " секунд");
        System.out.println("Результат: " + minutes + " хв " + remainderSeconds + " сек");
        System.out.println();

        int n = 47;
        int tens = n / 10;
        int units = n % 10;
        int sum = tens + units;
        System.out.println("Число: " + n + ". Десятки: " + tens + ", Одиниці: " + units + ". Сума цифр: " + sum);
        System.out.println();

        int score = 100;
        score += 50;
        System.out.println("Після додавання: " + score);
        score -= 20;
        System.out.println("Після віднімання: " + score);
        score *= 2;
        System.out.println("Після множення: " + score);
        score /= 4;
        System.out.println("Після ділення: " + score);
        System.out.println();

        int counter = 5;
        System.out.println(counter++);
        System.out.println(counter);
        System.out.println(counter++);
        System.out.println();

        int grade1 = 4;
        int grade2 = 5;
        int grade3 = 4;
        double average = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("Середній бал: " + average);
        System.out.println();

        double celsius = 25.0;
        double fahrenheit = celsius * 1.8 + 32;
        double kelvin = celsius + 273.15;
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + kelvin + " K");
        System.out.println();

        int userAge = 17;
        boolean isAdult = userAge >= 18;
        System.out.println("Вік: " + userAge + ". Чи є повнолітинім: " + isAdult);
        System.out.println();

        int x = 15;
        int y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println();

        int speed = 75;
        boolean isSafeSpeed = (speed >= 20) && (speed <= 80);
        System.out.println("Швидкість: " + speed + ". Чи безпечна: " + isSafeSpeed);
        System.out.println();

        int personAge = 70;
        boolean hasFreePass = (personAge < 7) || (personAge >= 65);
        System.out.println("Вік: " + personAge + ". Право на безкоштовний проїзд: " + hasFreePass);
        System.out.println();

        boolean isDoorLocked = true;
        boolean canEnter = !isDoorLocked;
        System.out.println("Двері зачинені: " + isDoorLocked);
        System.out.println("Чи можна увійти: " + canEnter);
        System.out.println();

        number1 = 30;
        boolean isDivisibleByBoth1 = (number1 % 3 == 0) && (number1 % 5 == 0);
        System.out.println("Число " + number1 + " ділиться на 3 і 5: " + isDivisibleByBoth1);
        int number2 = 25;
        boolean isDivisibleByBoth2 = (number2 % 3 == 0) && (number2 % 5 == 0);
        System.out.println("Число " + number2 + " ділиться на 3 і 5: " + isDivisibleByBoth2);
        System.out.println();

        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("Статус доступу (чи дозволено вхід): " + canLogin);
        System.out.println();

        int year = 2024;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println("Рік " + year + " є високосним: " + isLeapYear);
        System.out.println();

        double a1 = 3.0;
        double b1 = 4.0;
        double c = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        System.out.println("Катети: " + a1 + " та " + b1 + ". Гіпотенуза: " + c);
        System.out.println();

        double radius = 5.0;
        double length = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Радіус: " + radius);
        System.out.println("Довжина кола: " + length);
        System.out.println("Площа круга: " + area);
        System.out.println();

        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double tempDiff = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);
        System.out.println("Перепад температури: " + tempDiff);
        System.out.println("Максимальна температура: " + maxTemp);
        System.out.println("Мінімальна температура: " + minTemp);
        System.out.println();

        double num = 5.67;
        System.out.println("Math.round: " + Math.round(num));
        System.out.println("Math.ceil: " + Math.ceil(num));
        System.out.println("Math.floor: " + Math.floor(num));
        double negNum = -5.67;
        System.out.println("Math.round: " + Math.round(negNum));
        System.out.println("Math.ceil: " + Math.ceil(negNum));
        System.out.println("Math.floor: " + Math.floor(negNum));
        System.out.println();

        double coeffA = 1.0;
        double coeffB = -7.0;
        double coeffC = 10.0;
        double d = Math.pow(coeffB, 2) - 4 * coeffA * coeffC;
        double x1 = (-coeffB + Math.sqrt(d)) / (2 * coeffA);
        double x2 = (-coeffB - Math.sqrt(d)) / (2 * coeffA);
        System.out.println("Дискримінант D = " + d);
        System.out.println("Корінь x1 = " + x1);
        System.out.println("Корінь x2 = " + x2);
        System.out.println();

        int dice = (int) (Math.random() * 6) + 1;
        System.out.println("Випало на кубику: " + dice);
        System.out.println();

        int min = -10;
        int max = 35;
        int randomTemp = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Погода на завтра: " + randomTemp + "°C");
        System.out.println();

        double depositP = 10000.0;
        double depositR = 12.0;
        int depositT = 3;
        double depositS = depositP * Math.pow((1 + depositR / 100), depositT);
        double profit = depositS - depositP;
        System.out.println("+------------------------------------+");
        System.out.println("|     ДЕПОЗИТНИЙ КАЛЬКУЛЬАТОР        |");
        System.out.println("+------------------------------------+");
        System.out.println("Початкова сума: " + depositP + " грн");
        System.out.println("Термін: " + depositT + " роки під " + depositR + "% річних");
        System.out.println("Підсумкова сума: " + depositS + " грн");
        System.out.println("Чистий прибуток: " + profit + " грн");
        System.out.println("+------------------------------------+");


    }
}

