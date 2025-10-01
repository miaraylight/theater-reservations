package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter;

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();

        System.out.println("How many tickets would you like?");
        int ticketAmount = scanner.nextInt();

        scanner.close();

        String[] formattedName = name.split(" ");
        String firstName = formattedName[0];
        String lastName = formattedName[1];

        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate formattedDate = LocalDate.parse(date, formatter);

        System.out.printf("%d tickets reserved for %s under %s, %s", ticketAmount, formattedDate, lastName, firstName );
    }
}
