package org.example;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        languageMenu();
    }

    private static void languageMenu() {
        System.out.println("Tilni tanlang:");
        System.out.println("1. UzB");
        System.out.println("2. Rus");
        System.out.println("3. Eng");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            case 2:
            case 3:
                enterMenu();
                break;
            default:
                System.out.println("Noto'g'ri tanlov.");
                languageMenu();
                break;
        }
    }

    private static void enterMenu() {
        System.out.println("1. Kurslarni ko'rish.");
        System.out.println("2. Ro'yxatdan o'tish.");
        System.out.println("3. Kirish.");
        System.out.println("4. Chiqish.");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showCurrencyMenu();
                break;
            case 2:
                registerMenu();
                break;
            case 3:
                loginMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Noto'g'ri tanlov.");
                enterMenu();
                break;
        }
    }

    private static void showCurrencyMenu() {
        System.out.println("1. 1 USD = 12 420 SUM");
        System.out.println("2. 1 EUR = 13 600 SUM");
        System.out.println("3. 1 RUB = 142 SUM");
        System.out.println("4. Orqaga");

        int choice = scanner.nextInt();
        if (choice == 4) {
            enterMenu();
        } else {
            showCurrencyMenu();
        }
    }

    private static void registerMenu() {
        System.out.println("Ro'yxatdan o'tish:");
        System.out.println("1. F.I.Sh.");
        System.out.println("2. Tel.");
        System.out.println("3. Email.");
        System.out.println("4. Karta raqami.");
        System.out.println("5. Parol.");
        System.out.println("6. Orqaga.");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("Ismingizni kiriting: ");
                break;
            case 2:
                System.out.println("Telefon no'meringizni kiriting: ");
                break;
            case 3:
                System.out.println("Emailingizni kiriting: ");
                break;
            case 4:
                System.out.println("Login parolingizni kiriting: ");
                break;
            case 5:
                System.out.println("Karta parolingizni kiriting: ");
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Noto'g'ri tanlov.");
        }

        int choice = scanner.nextInt();
        if (choice == 6) {
            enterMenu();
        } else {
            registerMenu();
        }
    }

    private static void loginMenu() {
        System.out.println("Kirish:");
        System.out.println("1. Email.");
        System.out.println("2. Parol.");

        int choice = scanner.nextInt();
        indexMenu();
    }

    private static void indexMenu() {
        System.out.println("1. Konvertatsiya bo'limi.");
        System.out.println("2. Kartalarni boshqarish.");
        System.out.println("3. Tarixni ko'rish.");
        System.out.println("4. Orqaga.");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                chooseCurrency1();
                break;
            case 2:
                cardInformationMenu();
                break;
            case 3:
                chooseCardHistory();
                break;
            case 4:
                enterMenu();
                break;
            default:
                System.out.println("Noto'g'ri tanlov.");
                indexMenu();
                break;
        }
    }

    private static void chooseCurrency1() {
        System.out.println("Qaysi valyuta birligidan:");
        System.out.println("1. SUM");
        System.out.println("2. EUR");
        System.out.println("3. RUB");
        System.out.println("4. USD");
        System.out.println("5. Orqaga.");

        int choice = scanner.nextInt();
        if (choice == 5) {
            indexMenu();
        } else {
            chooseCard1();
        }
    }

    private static void chooseCard1() {
        System.out.println("Kartangizni tanlang:");
        System.out.println("1. UZCARD");
        System.out.println("2. VISA");
        System.out.println("3. HUMO");
        System.out.println("4. SBERBANK");
        System.out.println("5. Orqaga.");

        int choice = scanner.nextInt();
        if (choice == 5) {
            chooseCurrency1();
        } else {
            chooseCurrency2();
        }
    }

    private static void chooseCurrency2() {
        System.out.println("Qaysi biriga o'tmoqchisiz:");
        System.out.println("1. SUM");
        System.out.println("2. EUR");
        System.out.println("3. RUB");
        System.out.println("4. USD");
        System.out.println("5. Orqaga.");

        int choice = scanner.nextInt();
        if (choice == 5) {
            chooseCard1();
        } else {
            enterBalansSumma();
        }
    }

    private static void enterBalansSumma() {
        System.out.println("O'tkazma mablag'ini kiriting:");
        scanner.next(); // Mablag'ni o'qish
        indexMenu();
    }

    private static void cardInformationMenu() {
        System.out.println("1. Karta ma'lumotlari.");
        System.out.println("2. Karta qo'shish.");
        System.out.println("3. Orqaga.");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                cardInformation();
                break;
            case 2:
                addCard();
                break;
            case 3:
                indexMenu();
                break;
            default:
                System.out.println("Noto'g'ri tanlov.");
                cardInformationMenu();
                break;
        }
    }

    private static void cardInformation() {
        System.out.println("Barcha karta ma'lumotlari:");
        // Karta ma'lumotlarini ko'rsatish
        System.out.println("Orqaga qaytish uchun 0 ni bosing.");
        int choice = scanner.nextInt();
        if (choice == 0) {
            cardInformationMenu();
        }
    }

    private static void addCard() {
        System.out.println("Karta raqami:");
        scanner.next();
        System.out.println("Karta muddati:");
        scanner.next();
        System.out.println("Tel:");
        scanner.next();

        sendSMS();
    }

    private static void sendSMS() {
        System.out.println("SMS kod kiritildi:");
        scanner.next();
        cardInformationMenu();
    }

    private static void chooseCardHistory() {
        System.out.println("Kartangizni tanlang:");
        System.out.println("1. UZCARD");
        System.out.println("2. HUMO");
        System.out.println("3. VISA");
        System.out.println("4. Orqaga.");

        int choice = scanner.nextInt();
        if (choice == 4) {
            indexMenu();
        } else {
            showHistoryTransfers();
        }
    }

    private static void showHistoryTransfers() {
        System.out.println("Ma'lumotlarni ekranga chiqarish:");
        // Tarixiy ma'lumotlarni ko'rsatish
        System.out.println("Orqaga qaytish uchun 0 ni bosing.");
        int choice = scanner.nextInt();
        if (choice == 0) {
            chooseCardHistory();
        }
    }
}
