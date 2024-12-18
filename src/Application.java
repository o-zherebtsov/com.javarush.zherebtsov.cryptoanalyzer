import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Здравствуйте! Я программа Шифровальшик.");
        System.out.println("Я умею выполнять следующие функции:");
        System.out.println("1. Шифровать файл с помощью ключа.");
        System.out.println("2. Дешифровать файл с помощью ключа.");
        System.out.println("3. Дешифровать методом brute force.");
        System.out.println("4. Выход");

        Scanner console = new Scanner(System.in);
        Validate validate = new Validate();
        int selection;

        do {
            System.out.println("Введите номер функции которую хотите, чтобы я выполнил.");
            selection = console.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Укажите путь к файлу который необходимо зашифровать.");
                    String str = console.next();
                    if (!validate.fileExists(Path.of(str))) {
                        System.exit(2);
                    }

                    System.out.println("Укажите ключ шифрования.");
                    int key = validate.keyInt();

                    System.out.println("Укажите путь куда сохранить зашифрованный файл.");
                    String strOut = console.next();

                    Cipher.encrypt(str, key, strOut);
                    System.out.println("Файл зашифрован.");
                    break;

                case 2:
                    System.out.println("Укажите путь к файлу который необходимо расшифровать.");
                    String str1 = console.next();
                    if (!validate.fileExists(Path.of(str1))) {
                        System.exit(2);
                    }

                    System.out.println("Укажите ключ дешифрования.");
                    int key1 = validate.keyInt();

                    System.out.println("Укажите путь куда сохранить расшифрованный файл.");
                    String strOut1 = console.next();

                    Cipher.decrypt(str1, key1, strOut1);
                    System.out.println("Файл дешифрован.");
                    break;

                case 3:
                    System.out.println("Укажите путь к файлу который необходимо расшифровать методом brute force.");
                    String str2 = console.next();
                    if (!validate.fileExists(Path.of(str2))) {
                        System.exit(2);
                    }

                    System.out.println("Укажите путь куда сохранить варианты расшифрованных файлов.");
                    String strOut2 = console.next();

                    Cipher.bruteForce(str2, strOut2);
                    System.out.println("Дешифровка методом Brute Force выполнена.");
                    break;

                case 4:
                    System.out.println("Спасибо что воспользовались программой шифрования!");
                    break;

            }
        } while (selection != 4);

    }
}