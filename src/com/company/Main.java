package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("sdsds");
        System.out.println("dsadasdasdas");
        System.out.println("dssdasdad");
        System.out.println("asdasdasd");
        System.out.println("dsadasd");

    }

    public static int generateRandomAge() {
        int min = -40;
        int max = 45;
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;
    }

    public static String walkingSchedule(int age, int temperature) {
        if ((age >= 20 && age <= 40) && (temperature >= -20 && temperature <= 30)) {
            System.out.println("Можно идти гулять");
        } else if ((age <= 20) && (temperature >= 0 && temperature <= 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "";
    }
}

