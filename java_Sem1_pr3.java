package Seminar1;

import java.util.Scanner;

public class java_Sem1_pr3 {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // Реализовать простой калькулятор

        // Определение переменных чисел для вычисления,
        // перменной типа операции,
        // переменной результата вычисления.
        float num1 = FuncNum();
        char opr = operetion();
        float num2 = FuncNum();
        float result = calc(num1, num2, opr);
        // Вывод в консоль результатов вычисления
        System.err.printf("%.1f ", num1);
        System.err.printf("%c ", opr);
        System.err.printf("%.1f = ", num2);
        System.err.printf("%.1f", result);
    }

    // Функция ввода чисел для вычисления
    public static float FuncNum() {
        System.err.println("Введите число: ");
        float num;
        if (scn.hasNext()) {
            num = scn.nextFloat();
        } else {
            System.err.println("Вы ошиблись!"); // Проверка правильности ввода
            scn.next();
            num = FuncNum();
        }
        return num;
    }

    // Функция ввода чисел для вычисления
    public static char operetion() {

        System.out.println("Введите операцию вычисления '+','-','*','/','%'");
        char opr;
        if (scn.hasNext()) {
            opr = scn.next().charAt(0);
        } else {

            System.out.println("Вы ошиблись.");// Проверка правильности ввода
            scn.next();
            opr = operetion();
        }
        return opr;
    }

    // Функция выбора типа операции и прозводства вычисления

    public static float calc(float num1, float num2, char opr) {
        float result;
        switch (opr) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;

            default:
                System.err.println("Нет оператора действий");// Проверка на правильность ввода оператора
                result = calc(num1, num2, operetion());// и исправление ошибки ввода

        }

        return result;
    }

}
