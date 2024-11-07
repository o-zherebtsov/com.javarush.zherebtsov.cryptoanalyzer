import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Validate {

    public boolean fileExists(Path file) throws FileNotFoundException {
        if (Files.exists(file)) {
            return true;
        } else {
            System.out.println("Что-то пошло не так! Файл не найден.");
            return false;
        }
    }

    public int keyInt() {
        Scanner console = new Scanner(System.in);
        int key = console.nextInt();
        if (key < 0) {
            for (int i = 4; i >= 0; i--) {
                System.out.println("Введите целое положительное число. Осталось " + i + " попыток");
                key = console.nextInt();
                if(key >= 0) {
                    return key;
                } else if (i == 0) {
                    System.out.println("Что-то пошло не так!");
                    System.exit(2);
                }
            }
        }
        return key;
    }
}
