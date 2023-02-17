package Seminar1;

import java.util.Scanner;
import java.io.IOException;

public class Java_Sem1_dz_pr1 {
    public static void main(String[] args) throws IOException {
        //Вычислить n-ое треугольного число(сумма чисел от 1 до n),
        // n! (произведение чисел от 1 до n)
        Scanner num = new Scanner(System.in);
        System.err.printf("Введите  число: ");
        int n = num.nextInt();
        System.err.printf("Сумма арифметической прогресии: %d\n", trianNum(n));
        System.err.printf("Треугольное число: \n");
        num.close();

        int i, j;
        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= i; j++)  
            {          
                System.out.print(i); 
            }      
            System.out.print("\n");        
        }
    }

    public static int trianNum(int n) {
        return (n * (n + 1)) / 2;
    }
    
}
