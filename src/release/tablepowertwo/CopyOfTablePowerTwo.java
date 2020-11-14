package release.tablepowertwo;
import javax.swing.JOptionPane;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.util.Arrays;

import static java.lang.Math.*;

public class CopyOfTablePowerTwo {
	
	public static void main(String[] args) throws FileNotFoundException {
		Writer outfile = null;
		int numb = 2;
        try {
        	outfile = new FileWriter("Klimov_Fork.txt");
        	outfile.write("Таблица степеней числа 2");
            outfile.write(System.getProperty("line.separator") 
            		+ System.getProperty("line.separator"));
        String[] arr = new String[11];
        String[] str = new String[11];
            arr[0] = "Таблица степеней числа 2\n\n";
//            System.out.println("Таблица степеней числа 2\n");
            
//            for(int i = arr.length-1; i <= 1; i--){
//                numb = (int) pow(2,i);
////                outfile.write("2 в степени "+i+"  равно: "+numb);
////                outfile.write(System.getProperty("line.separator"));
//                arr[i] = "2 в степени " + i + " равно: " + numb;
////                System.out.println("2 в степени " + i + " равно: " + numb);
//             }

            for(int i = 0; i <= arr.length-1; i++){
                str[i] = ""+(pow(numb,i));
            	System.out.println(str[i]);
            	}
            System.out.println();
            for(int i = arr.length-1, j = 0; i >= 0; i--, j++){
                arr[j] = ""+(pow(numb,i));
//            	System.out.println(arr[j]);
//                System.out.print("2 в степени "+i+" равно "+arr[j]+System.getProperty("line.separator"));
                arr[j] = "2 в степени "+i+" равно "+arr[j]+System.getProperty("line.separator");
//                outfile.write("2 в степени "+i+" равно "+arr[j]+System.getProperty("line.separator"));
                outfile.write(arr[j]);
            	}
        	System.out.println(Arrays.toString(arr));
        	System.out.println(Arrays.toString(str));
//        	outfile.write(Arrays.toString(arr));
            outfile.flush();            
//            System.out.println();            
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