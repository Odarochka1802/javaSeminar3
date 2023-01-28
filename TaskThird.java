package Seminar_3;

import java.util.*;
import java.util.stream.Collectors;

public class TaskThird {
    public static void main(String[] args) {
        forExample();
        ex2();
    }

    // Для примера с числовыми значениями
    public static void forExample() {
        List<Integer> ourList = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 5, 2);
        List<Integer> listWithoutDuplicates = ourList.stream().distinct().collect(Collectors.toList());
        System.out.println("Наш список из чисел" + ourList);
        System.out.println("Удалили дублирующие значения " + listWithoutDuplicates);
    }

    // Наш список со второго задания с названиями планет, если я правильно поняла
    public static void ex2() {
        List<String> planets = new ArrayList<>();
        HashMap<String, Integer> planetCount = new HashMap<>();
        Random rand = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 20; i++) {
            int randIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }
        System.out.println("Сисок планет " + Arrays.toString(solarSystemPlanets));
        System.out.println("Наш список с повторяющимися названиями планет: " + planets);
        List<String> listWithoutDuplicates_ = planets.stream().distinct().collect(Collectors.toList());
        System.out.println("Список без дублей: " + listWithoutDuplicates_);

        //Ещё вариант с сет
        //Set<String> s = new LinkedHashSet<>(planets);
        //System.out.println(s);

    }
}

