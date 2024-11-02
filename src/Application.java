import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Здравствуйте! Я программа Шифровальшик.");
        System.out.println("Я умею выполнять следующие функции:");
        System.out.println("1. Шифровать файл с помощью ключа.");
        System.out.println("2. Дешифровать файл с помощью ключа.");
        System.out.println("3. Дешифровать методом перебора");
        System.out.println("4. Выход");
        System.out.println("Введите номер функции которую хотите, чтобы я выполнил.");

        Scanner console = new Scanner(System.in);

        switch (console.nextLine()) {
            case "1":
                System.out.println("Укажите путь к файлу который необходимо зашифровать.");
                String str = console.nextLine();

                System.out.println("Укажите ключ шифрования.");
                int key = console.nextInt();

                System.out.println("Укажите путь куда сохранить зашифрованный файл.");
                String strFinal = console.nextLine();


        }


    }
}