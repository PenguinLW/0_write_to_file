package release.tablepowertwo;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.util.Arrays;
import static java.lang.Math.*;
public class Release {
	public static void main(String[] args) throws FileNotFoundException {
		Writer outfile = null;
		int numb = 2;
        try {
        	outfile = new FileWriter("Klimov_Fork.txt");
        String[] arr = new String[11];
        String[] str = new String[11];
	        arr[0] = "Таблица степеней числа 2\n\n";
	        str[0] = "Таблица степеней числа 2"+System.getProperty("line.separator");
            for(int i = arr.length-1, j = 1; i >= 1; i--, j++){
                arr[j] = ""+(pow(numb,i));
                str[j] = "2 в степени "+i+" равно "+arr[j]+System.getProperty("line.separator");
            	}
            outfile.write(str[0]);
            for(int i = arr.length-1; i>= 1; i--)
                outfile.write(str[i]);
        	System.out.println(Arrays.toString(str));
            outfile.flush();
	    try {
		Runtime.getRuntime().exec("notepad Klimov_Fork.txt");
		} catch (IOException e) {
			Runtime.getRuntime().exec("gedit Klimov_Fork.txt");
		}
        } catch (Exception exc) {
        	JOptionPane.showMessageDialog(null,  "Ошибка записи в файл!!");
        } finally {
            if (outfile != null) {
                try {
                	outfile.close();
                } catch (IOException ex) {
                	JOptionPane.showMessageDialog(null,  "Ошибка при закрытии файла!");
                }
            }
            }
	}
}
