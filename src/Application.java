import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Здравствуйте! Я программа Шифровальшик.");
        System.out.println("Я умею выполнять следующие функции:");
        System.out.println("1. Шифровать файл с помощью ключа.");
        System.out.println("2. Дешифровать файл с помощью ключа.");
        System.out.println("3. Дешифровать методом перебора");
        System.out.println("4. Выход");

        Scanner console = new Scanner(System.in);

        int selection;

        do {
            System.out.println("Введите номер функции которую хотите, чтобы я выполнил.");
            selection = console.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Укажите путь к файлу который необходимо зашифровать.");
                    String str = console.next();

                    System.out.println("Укажите ключ шифрования.");
                    int key = console.nextInt();

                    System.out.println("Укажите путь куда сохранить зашифрованный файл.");
                    String strOut = console.next();

                    Cipher.Encrypt(str, key, strOut);
                    break;

                case 2:
                    System.out.println("Укажите путь к файлу который необходимо расшифровать.");
                    String str1 = console.next();

                    System.out.println("Укажите ключ дешифрования.");
                    int key1 = console.nextInt();

                    System.out.println("Укажите путь куда сохранить расшифрованный файл.");
                    String strOut1 = console.next();

                    Cipher.Decrypt(str1, key1, strOut1);
                    break;

                case 3:
                    System.out.println("Укажите путь к файлу который необходимо расшифровать методом brute force.");
                    String str2 = console.next();

                    System.out.println("Укажите путь куда сохранить варианты расшифрованных файлов.");
                    String strOut2 = console.next();

                    Cipher.BruteForce(str2, strOut2);
                    break;

                case 4:
                    System.out.println("Спасибо что воспользовались программой шифрования!");
                    break;

            }
        } while (selection != 4);

    }
}