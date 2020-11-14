package old.tablepowertwoSeek;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.io.FileNotFoundException;
import static java.lang.Math.*;

public class TablePowerTwo {
	
	public static void main(String[] args) throws FileNotFoundException {
		RandomAccessFile outfile = null;
		int numb = 2;
        try {
        	outfile = new RandomAccessFile("Klimov_Fork.txt", "rw");
        	
        	outfile.write("Таблица степеней числа 2".getBytes());
            outfile.write(System.getProperty("line.separator").getBytes());
            outfile.write(System.getProperty("line.separator").getBytes());
            
            System.out.println("Таблица степеней числа 2\n");
            outfile.seek(28);
            for(int i = 10; i >= 0; i--){
                numb = (int) pow(2,i);
                outfile.write(("2 в степени "+i+" равно: "+numb).getBytes());
                outfile.write(System.getProperty("line.separator").getBytes());
                System.out.println("2 в степени " + i + " равно: " + numb);
                outfile.seek(0);
             }
//            outfile.flush();
            System.out.println();
//            Runtime.getRuntime().exec("notepad Klimov_Fork.txt");
        } catch (Exception exc) {
        	JOptionPane.showMessageDialog(null,  "wrong!!");
        } finally {
            if (outfile != null) {
                try {
                	outfile.close();
                } catch (IOException ex) {
                	JOptionPane.showMessageDialog(null,  "wrong!");
                }
            }
            }
	}
}
