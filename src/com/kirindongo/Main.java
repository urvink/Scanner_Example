package com.kirindongo;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	  // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello User\nWhat is your name?");
        String name = scanner.nextLine();

        System.out.println("When is your birthday? (dd/mm/yyyy)");
        String bDate = scanner.nextLine();

        String[] b_day = bDate.split("/");
        int day = Integer.parseInt(b_day[0]);
        int month =Integer.parseInt(b_day[1]);
        int year = Integer.parseInt(b_day[2]);

        LocalDate birthday = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();

        System.out.println("Today is "+today+"\n"+name+" is "+ Period.between(birthday, today).getYears());
    }
}
