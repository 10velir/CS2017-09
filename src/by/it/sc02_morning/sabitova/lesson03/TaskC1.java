package by.it.sc02_morning.sabitova.lesson03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum"+" = "+(x+y));
        }
    }

