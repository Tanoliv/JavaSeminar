package Seminar1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//import javax.lang.model.element.VariableElement;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class java_Sem1_pr1 {

    public static void main(String[] args) throws IOException {
        /**
         * System.err.println("Привет Олег!");
         * LocalDateTime now= LocalDateTime.now();
         * DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd.MMMM.YYYYгода
         * HH.mm:ss");
         * System.err.println(formatter.format(now));
         * 
         * Scanner iScanner= new Scanner(System.in, "Cp866");
         * System.out.println("Введите имя: ");
         * String name= iScanner.nextLine();
         * //System.err.printf("Привет %s! Привет дружище!", name);
         * System.err.println(String.format("Здорово %s!", name, args));
         * iScanner.close();
         * 
         * // Задача 2
         * // Дан массив двоичных чисел, например [1,1,0,1,1,1],
         * // вывести максимальное количество подряд идущих 1.
         * int[] arr = new int[] { 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1
         * };
         * for (int i : arr) {
         * System.err.printf("%d, ", i);
         * // System.err.println();
         * }
         * int count = 0, max_line = 0;
         * 
         * for (int i = 0; i < arr.length; i++) {
         * if (arr[i] == 1) {
         * count++;
         * } else {
         * if (count > max_line) { // Выявляет цепочку большей длинны
         * max_line = count;
         * 
         * }
         * count = 0;
         * }
         * }
         * if (count > max_line) {
         * max_line = count;
         * 
         * }
         * System.err.printf("\n Длинна max цепочки - %d символов", max_line); // на
         * экране 7
         */
        // Задача 3
        // Дан массив nums = [3,2,2,3] и число val = 3.
        // Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
        // конец массива.
        // Таким образом, первые несколько (или все) элементов массива должны быть
        // отличны от заданного,
        // а остальные - равны ему.
        int[] arr = new int[] { 3, 2, 3,3, 2, 3,3,3 };
        for (int i : arr) {
            System.err.printf("%d, ", i);
        }
        System.err.println();
        int val = 3, pos = arr.length - 1;
        for (int i = 0; i < pos; i++) {
            if (arr[i] == val) {
                while (arr[pos] == 3 && pos > i) {
                    pos--;
                }
                    int temp = arr[i];
                    arr[i]= arr[pos];
                    arr[pos]= temp;
                    //int temp = arr[pos];
                    //arr[pos] = arr[i];
                    //arr[i] = temp;
                    pos--;
                
            }

        }

        System.err.println(Arrays.toString(arr));

    }
}
