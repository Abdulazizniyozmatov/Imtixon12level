package org.example;
import java.util.Scanner;
public class Main1 {

    public static void main(String[] args) {
        languageMenu();
    }

    public static void languageMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Uzb");
        System.out.println("2. Rus");
        System.out.println("3. Eng");
        System.out.print("Tilni tanlang: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            enterMenu();
        } else {
            System.out.println("Til qo'llab-quvvatlanmaydi!");
        }
    }

    public static void enterMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kurslarni ko'rish.");
        System.out.println("2. Ro'yxatdan o'tish.");
        System.out.println("3. Kirish.");
        System.out.println("4. Chiqish.");
        System.out.print("Tanlang: ");
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
                System.out.println("Chiqish.");
                break;
            default:
                System.out.println("Noto'g'ri tanlov!");
                enterMenu();
        }
    }

    public static void showCurrencyMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. 1 USD = 12 420 SUM");
        System.out.println("2. 1 EUR = 13 600 SUM");
        System.out.println("3. 1 RUB = 142 SUM");
        System.out.println("4. Orqaga.");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();
        if (choice == 4) {
            enterMenu();
        } else {
            showCurrencyMenu();
        }
    }

    public static void registerMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. F.I.SH");
        System.out.println("2. Tel");
        System.out.println("3. Email");
        System.out.println("4. Karta raqam");
        System.out.println("5. Password");
        System.out.println("6. Orqaga");
        System.out.print("Tanlang: ");
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

    public static void loginMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Email");
        System.out.println("2. Password");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();
        if (choice == 1 || choice == 2) {
            indexMenu();
        } else {
            loginMenu();
        }
    }

    public static void indexMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Konvertatsiya bo'limi.");
        System.out.println("2. Kartalarni boshqarish");
        System.out.println("3. Tarixni ko'rish.");
        System.out.println("4. Orqaga.");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                chooseCurrency1();
                break;
            case 2:
                cardInformationMenu();
                break;
            case 3:
                cardHistoryMenu();
                break;
            case 4:
                loginMenu();
                break;
            default:
                indexMenu();
        }
    }

    public static void chooseCurrency1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qaysi valyuta birligidan:");
        System.out.println("1. SUM");
        System.out.println("2. EUR");
        System.out.println("3. RUB");
        System.out.println("4. USD");
        System.out.println("5. Orqaga");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();
        if (choice == 5) {
            indexMenu();
        } else {
            chooseCard1();
        }
    }

    public static void chooseCard1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kartangizni tanlang:");
        System.out.println("1. UZCARD");
        System.out.println("2. VISA");
        System.out.println("3. HUMO");
        System.out.println("4. SBERBANK");
        System.out.println("5. Orqaga");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();
        if (choice == 5) {
            chooseCurrency1();
        } else {
            enterBalansSumma();
        }
    }

    public static void enterBalansSumma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("O'tkazma mablag'i: ");
        String summa = scanner.next();
        if (!summa.isEmpty()) {
            System.out.println("Mablag' o'tkazildi!");
            indexMenu();
        } else {
            chooseCard1();
        }
    }

    public static void cardInformationMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Karta ma'lumotlari.");
        System.out.println("2. Karta qo'shish.");
        System.out.println("3. Orqaga.");
        System.out.print("Tanlang: ");
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
                cardInformationMenu();
        }
    }

    public static void cardInformation() {
        System.out.println("Barcha karta ma'lumotlari.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Orqaga qaytish uchun enter bosing.");
        scanner.nextLine();
        cardInformationMenu();
    }

    public static void addCard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Karta raqami: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Karta muddati: ");
        String cardExpiry = scanner.nextLine();
        System.out.print("Tel: ");
        String phone = scanner.nextLine();
        if (!cardNumber.isEmpty() && !cardExpiry.isEmpty() && !phone.isEmpty()) {
            sendSMS();
        } else {
            addCard();
        }
    }

    public static void sendSMS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("SMS kod kiritildi: ");
        String smsCode = scanner.nextLine();
        if (!smsCode.isEmpty()) {
            System.out.println("Karta qo'shildi!");
            cardInformationMenu();
        } else {
            sendSMS();
        }
    }

    public static void cardHistoryMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kartangizni tanlang:");
        System.out.println("1. UZCARD");
        System.out.println("2. VISA");
        System.out.println("3. HUMO");
        System.out.println("4. Orqaga");
        System.out.print("Tanlang: ");
        int choice = scanner.nextInt();
        if (choice == 4) {
            indexMenu();
        } else {
            showHistoryTransfers();
        }
    }

    public static void showHistoryTransfers() {
        System.out.println("Ma'lumotlarni ekranga chiqarish");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Orqaga qaytish uchun enter bosing.");
        scanner.nextLine();
        cardHistoryMenu();
    }
}
