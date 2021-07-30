package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Привет как тебя зовут?");
        String name = user.nextLine();
        System.out.println(name + ",Рад знакомству");

    }
}
