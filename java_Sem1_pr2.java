package Seminar1;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class java_Sem1_pr2 {
    public static void main(String[] args) throws IOException {

        //Вывести все простые числа от 1 до 1000

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число N, для выборки простых чисел от 1 до N: ");
        int num = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i <= num; i++) {
            Boolean PrimNum = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    PrimNum = false;
                    break;
                }

            }

            if (PrimNum) {
                primes.add(i);
            }
        }
        System.err.printf("Простые числа из ряда чисел от 1 до %d:", num);
        System.err.printf("%s\n", primes);
    }
}
