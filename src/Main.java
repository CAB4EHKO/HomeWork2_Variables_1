public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        var y = 3.0;
        var dog = 12.0;
        dog -= y;
        var cat = 7.6;
        cat -= y;
        var paper = 763793;
        paper -= y;
        System.out.println("Собака: " + dog + "\nКот: " + cat + "\nБумага: " + paper);
    }
    public static void task4() {
        var friend = 19;
        System.out.println("Переменная Friend: " + friend);
        friend += 2;
        System.out.println("Значение переменной Friend увеличенное на 2: " + friend);
        friend /= 7;
        System.out.println("Значение переменной Friend поделённое на 7: " + friend);
    }
}