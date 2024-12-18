import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Cipher {

    private static final List ALPHABET = Arrays.asList('а', 'б',
            'в', 'г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' ');

    public static void encrypt(String str, int key, String strOut) {

        char c;
        char a;
        Validate validate = new Validate();

        try {
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(strOut);
            BufferedWriter bw = new BufferedWriter(fw);

            while (br.ready()) {
                c = (char) br.read();
                if (ALPHABET.contains(c)) {
                    int i = (ALPHABET.indexOf(c) + key) % ALPHABET.size();
                    a = (char) ALPHABET.get(i);
                    bw.append(a);
                } else bw.append(c);
            }
            bw.close();
            br.close();
        } catch (Exception e) {
        }
    }

    public static void decrypt(String str, int key, String strOut) {

        char c;
        char a;

        try {
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(strOut);
            BufferedWriter bw = new BufferedWriter(fw);

            while (br.ready()) {
                c = (char) br.read();
                if (ALPHABET.contains(c)) {
                    int i = (ALPHABET.indexOf(c) - key) % ALPHABET.size();
                    a = (char) ALPHABET.get(i);
                    bw.append(a);
                } else bw.append(c);
            }
            bw.close();
            br.close();
        } catch (Exception e) {
        }
    }

    public static void bruteForce(String str2, String strOut2) {

        char c;
        char a;

        try {
            for (int j = 0; j < ALPHABET.size(); j++) {

                FileReader fr = new FileReader(str2);
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter(strOut2 + j + ".txt");
                BufferedWriter bw = new BufferedWriter(fw);

                while (br.ready()) {
                    c = (char) br.read();
                    if (ALPHABET.contains(c)) {
                        int i = (ALPHABET.indexOf(c) + j) % ALPHABET.size();
                        a = (char) ALPHABET.get(i);
                        bw.append(a);
                    } else bw.append(c);
                }
                br.close();
                bw.close();
            }
        } catch (Exception e) {
        }
    }
}
