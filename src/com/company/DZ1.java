package com.company;

import java.util.Scanner;

public class DZ1 {
    public static String task1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой возраст:");
        byte age = in.nextByte();

        if (age >= 18) {
            return "Поздравляем с совершеннолетием!";
        }
        else {
            return "Возраст совершеннолетия ещё не наступил, нужно немного подождать)";
        }
    }

    public static String task2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите возраст человека:");
        byte age = in.nextByte();

        if (age >= 7) {
            return "Ребенок ходит в школу";
        }
        else if (age >= 18){
            return "Человек может отправляться в университет)";
        }
        else if (age >= 24) {
            return "Пора искать работу!";
        }
        else {
            return "Ошибка ввода!";
        }
    }

    public static String task3() {
        final byte capacity = 102;
        final byte seats = 60;
        final byte standingPassengers = capacity - seats;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите кол-во стоячих людей:");
        byte amountOfStanding = in.nextByte();
        System.out.print("Введите кол-во сидячих людей:");
        byte amountOfSitting = in.nextByte();

        if((amountOfSitting + amountOfStanding ) == capacity) {
            return "Мест нет!";
        }
        else if (amountOfSitting < seats) {
            return "Есть сидячие места";
        }
        else if (amountOfStanding < standingPassengers) {
            return "Есть места для поездки стоя";
        }
        else {
            return "Ошибка: введены некорректные данные!";
        }
    }
}
