package ru.geekbrains.HomeWork3;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Spravochnik {

    private static void Massdino() {
        Map<String, Integer> Dino = new HashMap<>();
        String[] words = {"Диплодок", "Паразауролоф", "Раптор", "Кастороидес", "Ютиранус", "Парацетарий", "Лютоволк", "Саблезуб", "Тираннозавр", "Тарбозавр",
                          "Трицератопс", "Диплодок", "Лютоволк", "Ютиранус", "Раптор", "Саблезуб", "Игуанодон", "Тарбозавр", "Лютоволк", "Амурозавр"};

        for (int i = 0; i < words.length; i++) {
            if (Dino.containsKey(words[i]))
                Dino.put(words[i], Dino.get(words[i]) + 1);
            else
                Dino.put(words[i], 1);
        }
        System.out.println(Dino);
        System.out.println();
    }

    private static void Spravochnik() {
        Telephone telephone = new Telephone();

        telephone.add("Иванов", "89111111111");
        telephone.add("Иванов", "89222222222");
        telephone.add("Петров", "89333333333");
        telephone.add("Жуков", "89987989898");
        telephone.add("Петров", "89444444444");
        telephone.add("Иванов", "89555555555");
        telephone.add("Сидоров", "89666666666");
        telephone.add("Петров", "89777777777");
        telephone.add("Иванов", "89121231212");
        telephone.add("Жуков", "89888888888");
        telephone.add("Сидоров", "89999999999");
        telephone.add("Петров", "89556667788");
        telephone.add("Романов", "89998887766");
        telephone.add("Иванов", "89665554433");
        telephone.add("Сидоров", "89887776655");

        System.out.println("Иванов -  " + telephone.get("Иванов"));
        System.out.println("Петров -  " + telephone.get("Петров"));
        System.out.println("Сидоров - " + telephone.get("Сидоров"));
        System.out.println("Жуков -  " + telephone.get("Жуков"));
        System.out.println("Романов - " + telephone.get("Романов"));
    }

    static class Telephone {
        private Map<String, List<String>> fon_hm = new HashMap<>();
        private List<String> telephone_number_list;

        public void add(String surname, String phone_number) {
            if (fon_hm.containsKey(surname)) {
                telephone_number_list = fon_hm.get(surname);
                telephone_number_list.add(phone_number);
                fon_hm.put(surname, telephone_number_list);
            } else {
                telephone_number_list = new ArrayList<>();
                telephone_number_list.add(phone_number);
                fon_hm.put(surname, telephone_number_list);
            }
        }

        public List<String> get(String surname) {
            return fon_hm.get(surname);
        }
    }

    public static void main(String[] args) {
        Massdino();
        Spravochnik();
    }

}






