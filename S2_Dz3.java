package Seminar1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class S2_Dz3 {
    /**
     * В файле содержится строка с данными:
     * [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
     * {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
     * {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
     * Напишите метод, который разберёт её на составные части и,
     * используя StringBuilder создаст массив строк такого вида:
     * Студент Иванов получил 5 по предмету Математика.
     * Студент Петрова получил 4 по предмету Информатика.
     * Студент Краснов получил 5 по предмету Физика.
     * 
     */

    public static void main(String[] args) {
        String strFile = getLineOffile("boor.txt");
        System.out.println(strFile);
        String[] array = seeBook(array(strFile));
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    public static String getLineOffile(String fileName) {
        String readFail = null;
        try {
            File file = new File("book.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            readFail = br.readLine();

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        return readFail;
    }

    private static String[][] array(String jsnstr) {
        String line = jsnstr.substring(1, jsnstr.length() - 1);

        String[] jsarray = line.split(", ");

        String[][] newArray = new String[jsarray.length][3];
        for (int i = 0; i < jsarray.length; i++) {
            line = jsarray[i].substring(1, jsarray[i].length() - 1);
            for (int j = 0; j < 3; j++) {
                String[] notCommArray = line.split(",");
                String[] notColArray = notCommArray[j].split(":");
                newArray[i][j] = notColArray[1].substring(1, notColArray[1].length() - 1);

            }
        }
        return newArray;
    }

    private static String[] seeBook(String[][] arraystr) {
        String[] end_str = new String[arraystr.length];
        StringBuilder Newstr = new StringBuilder();
        for (int i = 0; i < arraystr.length; i++) {
            Newstr.append("Студент ");
            Newstr.append(arraystr[i][0]);
            Newstr.append(" получил  ");
            Newstr.append(arraystr[i][1]);
            Newstr.append(" по предмету ");
            Newstr.append(arraystr[i][2]);
            end_str[i] = Newstr.toString();
            Newstr.delete(0, Newstr.length());
        }
        return end_str;
    }

}