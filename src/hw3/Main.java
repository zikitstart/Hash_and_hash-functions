package hw3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<MultiplicationTable> allPairs = new HashSet<>();
        extracted(allPairs);
        allPairs.add(new MultiplicationTable(3, 2));
        allPairs.add(new MultiplicationTable(2, 3));

        System.out.println("ДЗ3 Задача-2.");
        for (MultiplicationTable allPair : allPairs) {
            System.out.println(allPair);
        }


        Passport passport1 = new Passport("4400_126845","Воробьев","Артём","Сергеевич","25.05.2002");
        Passport passport2 = new Passport("4020_489056","Скворцов","Дамир","Ярославович","15.08.2005");
        Passport passport3 = new Passport("4000_126456","Иванов","Иван",null,"11.11.2000");
        Passport passport4 = new Passport("4012_123456","Смирнов","Сергей","Викторович","21.08.1984");
        Passport passport5 = new Passport("4012_123456","Иванов","Сергей","Сергеевич","21.10.1994");

        Map<String, Passport> passportMap = new HashMap<>();
        passportMap.put(passport1.getPassportNumber(),passport1);
        passportMap.put(passport2.getPassportNumber(),passport2);
        passportMap.put(passport3.getPassportNumber(),passport3);
        passportMap.put(passport4.getPassportNumber(),passport4);
        passportMap.put(passport5.getPassportNumber(),passport5);

        System.out.println("ДЗ3 Задача-3.");
        System.out.println(passportMap.get("4400_126845"));
        System.out.println(passportMap.get("4020_489056"));
        System.out.println(passportMap.get("4000_126456"));
        System.out.println(passportMap.get("4012_123456"));
        System.out.println(passportMap.get("4012_1256"));

    }
    private static void extracted(Set<MultiplicationTable> allPairs) {
        for (int first = 2; first <= 9; first++) {
            for (int second = first; second <= 9; second++) {
                if (allPairs.size() != 15){
                    allPairs.add(new MultiplicationTable(first, second));
                } else {
                    break;
                }
            }
        }
    }
}