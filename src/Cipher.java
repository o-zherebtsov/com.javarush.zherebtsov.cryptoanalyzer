import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class Cipher {

    private static final List ALPHABET = Arrays.asList('а', 'б',
            'в','г', 'д', 'е', 'ж', 'з', 'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
            'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»',
            ':', '!', '?', ' ');

    public Files Encrypt(String str, int key, String strFinal) {

        String string = "";
        char c;
        char a;

        try {
            FileReader fr = new FileReader(str);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(strFinal);
            BufferedWriter bw = new BufferedWriter(fw);

            while ((string = br.readLine()) != null){
                c = (char) br.read();
                if (ALPHABET.contains(c)) {
                    int i = (ALPHABET.indexOf(c) + key) % ALPHABET.size();
                    a = (char) ALPHABET.get(i);
                }
            }



        } catch (Exception e) {

        }


    }
}