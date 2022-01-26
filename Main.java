package com.artem.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        System.out.println("Введите дату");
        String date1 = scanner.nextLine();
        String date2 = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(date1, formatter);
        LocalDate secondDate = LocalDate.parse(date2, formatter);
        System.out.println(DateCalculator.calculateNumberOfDaysBetweenTwoDate(firstDate,secondDate));
    }
}

