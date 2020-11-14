package old.tablepowertwo;
import javax.swing.JOptionPane;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.util.Arrays;
import static java.lang.Math.*;

public class CopyOfTablePowerTwo {
	
	public static void main(String[] args) throws FileNotFoundException {
		RandomAccessFile outfile = null;
		int numb = 2;
        try {
        	outfile = new RandomAccessFile("Klimov_Fork.txt","rw");
        	outfile.write(("Таблица степеней числа 2"+System.getProperty("line.separator")+System.getProperty("line.separator")).getBytes());
            String[] arr = new String[11];
            arr[0] = "Таблица степеней числа 2"+System.lineSeparator()+System.lineSeparator();
            for(int i = arr.length-1; i >= 1; i--){
                numb = (int) pow(2,i);
                arr[i] = "2 в степени " + i + " равно: " + numb + System.lineSeparator();
             }
            for(int i = 0; i <= arr.length-1; i++){
            	System.out.println(arr[i]);
            }
            int index = 27;
            for(int i = arr.length-1; i >= 1; i--){
                numb = (int) pow(2,i);
                outfile.seek(index+arr[i].length());
                outfile.write((arr[i]).getBytes());
            }
            outfile.close();
            Runtime.getRuntime().exec("notepad Klimov_Fork.txt");
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