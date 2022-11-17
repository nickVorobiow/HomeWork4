package com.company;

import java.util.Scanner;

public class DZ2 {
    public static String task1() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите возраст:");
        byte age = in.nextByte();

        if (age >= 2 && age <= 6) {
            return ("Если возраст человека равен " + age + ", то ему надо ходить в садик");
        }
        else if (age >= 7 && age <= 18){
            return ("Если возраст человека равен " + age + ", то ему надо ходить в школу");
        }
        else if (age > 18 && age < 24) {
            return ("Если возраст человека равен " + age + ", то ему надо учиться в университете");
        }
        else if (age >= 24) {
            return ("Если возраст человека равен " + age + ", то пора искать работу!");
        }
        else {
            return "Ошибка ввода!";
        }
    }

    public static String task2() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите возраст:");
        byte age = in.nextByte();

        if (age < 5) {
            return ("Ребенок не может кататься на аттракционе!");
        }
        else if (age > 5 && age < 14){
            return ("Ребенок может кататься только в сопровождении взрослого");
        }
        else if (age > 14) {
            return ("Ребенок может кататься без сопровождения взрослого");
        }
        else {
            return "Ошибка ввода!";
        }
    }

    public static int task3() {
        int one = 2;
        int two = 7;
        int free = 1;

        if (one > two && one > free) {
            System.out.println("Число " + one + " большее");
            return 0;
        }
        else if(two > one && two > free) {
            System.out.println("Число " + two + " большее");
            return 0;
        }
        else if (free > one && free > two) {
            System.out.println("Число " + free + " большее");
            return 0;
        }
        return 0;
    }
}
