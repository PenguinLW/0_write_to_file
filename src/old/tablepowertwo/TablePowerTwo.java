package old.tablepowertwo;
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.FileNotFoundException;
import static java.lang.Math.*;

public class TablePowerTwo {
	
	public static void main(String[] args) throws FileNotFoundException {
		Writer outfile = null;
		int numb = 2;
        try {
        	outfile = new FileWriter("Klimov_Fork.txt");
        	
        	outfile.write("Таблица степеней числа 2");
            outfile.write(System.getProperty("line.separator") 
            		+ System.getProperty("line.separator"));
            
            System.out.println("Таблица степеней числа 2\n");
            
            for(int i = 0; i <= 10; i++){
                numb = (int) pow(2,i);
                outfile.write("2 в степени "+i+" равно: "+numb);
                outfile.write(System.getProperty("line.separator"));
                System.out.println("2 в степени " + i + " равно: " + numb);
             }
            outfile.flush();
            System.out.println();
            Runtime.getRuntime().exec("notepad Klimov_Fork.txt");
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
