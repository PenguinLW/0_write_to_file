package release2.tablepowertwo;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import static java.lang.Math.*;
public class Release {
	public static void main(String[] args) throws FileNotFoundException {
		Writer outfile = null;
		int numb = 2;
        try {
        	outfile = new FileWriter("Test_Fork.txt");
        ArrayList arr = new ArrayList();
        ArrayList<String> str = new ArrayList<String>();
	        arr.add("Таблица степеней числа 2\n\n");
	        str.add("Таблица степеней числа 2"+System.getProperty("line.separator"));
            for(int i = 10, j = 1; i >= 1; i--, j++){
                arr.add(""+(pow(numb,i)));
//                arr.set(j, "");
                str.add("2 в степени "+i+" равно "+arr.get(j)+System.getProperty("line.separator"));
            	}
            outfile.write(str.get(0));
            for(int i = arr.size()-1; i >= 1; i--)
                outfile.write(str.get(i));
            for(int i = 0; i <= str.size()-1; i++){
            	System.out.println(str.get(i));
            	}
            outfile.flush();
            
	    try {
		Runtime.getRuntime().exec("notepad Test_Fork.txt");
		} catch (IOException e) {
			Runtime.getRuntime().exec("gedit Test_Fork.txt");
			Runtime.getRuntime().exec("xed Test_Fork.txt");
		}
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
