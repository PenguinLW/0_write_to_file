package test_arr_list;

import static java.lang.Math.pow;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		int numb = 2;
        ArrayList<String> arr = new ArrayList<String>();
        ArrayList<String> str = new ArrayList<String>();
        
        
        System.out.println(str.size());
        
	        arr.add("Таблица степеней числа 2\n\n");
	        str.add("Таблица степеней числа 2");
            for(int i = 1; i <= 10; i++){
                arr.add(""+(pow(numb,i)));
//                arr.set(j, "");
                str.add("2 в степени "+i+" равно "+arr.get(i));//+System.getProperty("line.separator"));
            	}
            System.out.println(str.size());
            for(int i = str.size()-1; i >= 0; i--){
            	System.out.print(str.get(i)+System.getProperty("line.separator"));
            }

//            System.out.println(str.get(i));
//            System.out.println(arr.get(i));
        
	}

}
