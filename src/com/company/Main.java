package com.company;

public class Main {

    public static void main(String[] args) {
	Days days=Days.БЕЙШЕМБИ;
    switch (days){
        case ДУЙШОМБУ -> System.out.println("Дуйшомбу куну жава окуйм.");
        case ШЕЙШЕМБИ -> System.out.println("Шейшемби куну практика кылам");
        case ШАРШЕМБИ -> System.out.println("Шаршенби куну жава окуйм.");
        case БЕЙШЕМБИ -> System.out.println("Бейшемби куну англис тили сабагын окуйм");
        case ЖУМА -> System.out.println("Жума куну жава окуйм.");
        case ИШЕМБИ -> System.out.println("Ишемби куну практика кылам.");
        case ЖЕКШЕМБИ -> System.out.println("Жекшемби куну дем алыш куну.");
    }
        System.out.println(Days.ЖУМА);
    }
}
