import java.util.HashMap;
import java.util.HashSet;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Laptop_store_DZ {
    
    public static void main(String[] args) throws Exception {
        
        Laptop laptop1 = new Laptop("Apple MacBook Air 13", 8, 256, "MacOs", "золотистый", 13.3);
        Laptop laptop2 = new Laptop("Lenovo IdealPad 5", 8, 256, "Windows 11", "синий", 15.6);
        Laptop laptop3 = new Laptop("Honor MagicBook 16", 16, 512, "без ОС", "серый", 16.1);
        Laptop laptop4 = new Laptop("HP 250 G7", 4, 1024, "без ОС", "черный", 15.6);
        Laptop laptop5 = new Laptop("Xiomi RedmiBook 15", 8, 256, "Windows 11", "серый", 15.6);
        Laptop laptop6 = laptop1;
        Laptop laptop7 = new Laptop("DEXP Aquilon 14.1", 4, 128, "Windows 11 Pro", "серебристый", 14.1);
        Laptop laptop8 = new Laptop("DEXP Aquilon 14.1", 8, 128, "Windows 11 Pro", "серебристый", 14.1);
        Laptop laptop9 = new Laptop("Apple MacBook Air 13", 4, 256, "MacOs", "золотистый", 13.3);
        Laptop laptop10 = laptop2;
        Laptop laptop11 = laptop2;
        
        
        Set<Laptop> unicLaptop = new HashSet<Laptop>();
        unicLaptop.add(laptop1);
        unicLaptop.add(laptop2);
        unicLaptop.add(laptop3);
        unicLaptop.add(laptop4);
        unicLaptop.add(laptop5);
        unicLaptop.add(laptop6);
        unicLaptop.add(laptop7);
        unicLaptop.add(laptop8);
        unicLaptop.add(laptop9);
        unicLaptop.add(laptop10);
        unicLaptop.add(laptop11);

        System.out.printf("Всего уникалных ноутбуков: %d \n", unicLaptop.size());
     
        Map<Integer, String> mapCrit = new HashMap<>();
        mapCrit.put(1, "объем оперативной памяти");
        mapCrit.put(2, "объем накопителя");
        mapCrit.put(3, "ОС");
        mapCrit.put(4, "цвет");
        mapCrit.put(5, "диагональ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите желаемые характеристики: \n 1. объем оперативной памяти:(в наличии: 4, 8, 16 ram) ");
        int ramUser = sc.nextInt();
        System.out.println("объем накопителя:(в наличии: 128, 256, 512, 1024) ");
        int storUser = sc.nextInt();
        
        System.out.println("диагональ: (в наличии: 13,3; 14,1; 15,6; 16,1)");
        double digUser = sc.nextDouble();
        
        for(Laptop lap: unicLaptop) {
            if ((lap.getRam() >= ramUser) & (lap.getStorageCap() >= storUser)  & lap.getDiagonal() >= digUser) {
                System.out.println("Предлагаем ноутбук с характеристиками не ниже заявленных: ");
                System.out.println(lap.toString());
            }
        }
        sc.close();
        
    }
    
}