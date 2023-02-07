public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собака: " + dog + "\nКот: " + cat + "\nБумага: " + paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var x = 4.0;
        var dog = 8.0;
        dog += x;
        var cat = 3.6;
        cat += x;
        var paper = 763789;
        paper += x;
        System.out.println("Собака: " + dog + "\nКот: " + cat + "\nБумага: " + paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog -= -3.5;
        var cat = 3.6;
        cat -= 1.6;
        var paper = 763789;
        paper -= 7639;
        System.out.println("Собака: " + dog + "\nКот: " + cat + "\nБумага: " + paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("Переменная Friend: " + friend);
        friend += 2;
        System.out.println("Значение переменной Friend увеличенное на 2: " + friend);
        friend /= 7;
        System.out.println("Значение переменной Friend поделённое на 7: " + friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("Переменная Frog: " + frog);
        frog *= 10;
        System.out.println("Значение переменной Frog умноженное на 10: " + frog);
        frog /= 3.5;
        System.out.println("Значение переменной Frog поделённое на 3.5: " + frog);
        frog += 4;
        System.out.println("Значение переменной Frog увеличенное на 4: " + frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Общий вес боксёров: " + totalWeight + "\nРазница в весе боксёров: " + differenceWeight);
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;

        // Находим разницу в весе вычитанием из большего веса меньший.
        var differenceWeightOption1 = weightBoxer2 - weightBoxer1;

        // Находим разницу в весе с помощью функции остаток от деления.
        var differenceWeightOption2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница в весе вариант №1: " + differenceWeightOption1 + "\nРазница в весе вариант №2: " + differenceWeightOption2);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalWorkHour = 640;
        var clockRate = 8;
        var totalWorker = totalWorkHour / clockRate;
        System.out.println("Всего работников в компании - " + totalWorker + " человек.");
        totalWorker += 94;
        totalWorkHour = totalWorker * clockRate;
        System.out.println("Если в компании работает " + totalWorker + " человека, то всего " + totalWorkHour + " часа \nработы может быть поделено между сотрудниками.");
    }
}