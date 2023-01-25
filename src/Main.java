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
        System.out.println("Задача 1:");
        byte byteIntegerNumber = 7;
        System.out.println("Значение переменной byteIntegerNumber с типом byte равно " + byteIntegerNumber);
        short shortIntegerNumber = -250;
        System.out.println("Значение переменной shortIntegerNumber с типом short равно " + shortIntegerNumber);
        int intIntegerNumber = 2137643121;
        System.out.println("Значение переменной intIntegerNumber с типом int равно " + intIntegerNumber);
        long longIntegerNumber = 12867876654L;
        System.out.println("Значение переменной longIntegerNumber с типом long равно " + longIntegerNumber);
        float floatNumber = 48.04f;
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        double doubleNumber = 140.8665;
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);
    }

    public static void task2() {
        float f = 27.12f;
        long l = 987678965549l;
        double d = 2.786;
        short s1 = 569;
        short s2 = -159;
        int i = 27897;
        byte b= 67;
    }

    public static void task3() {
        System.out.println("Задача 3:");
        byte lyudmilaPavlovnaStudents = 23;
        byte annaSergeevnaStudents = 27;
        byte ekaterinaAndreevnaStudents = 30;
        int sheetsPerStudent = 480 / (lyudmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4:");
        short bottlesPerTwoMinutes = 16;
        int bottlesPerTwentyMinutes = bottlesPerTwoMinutes * 10;
        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " бутылок");
        int bottlesPerDay = bottlesPerTwentyMinutes * 3 * 24;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок");
        int bottlesPerThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " бутылок");
        int bottlesPerMonth = bottlesPerThreeDays * 10;
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5:");
        byte paintCans = 120;
        byte whitePaintCansPerClass = 2;
        byte brownPaintCansPerClass = 4;
        int classesInSchool = paintCans / (whitePaintCansPerClass + brownPaintCansPerClass);
        int whitePaintCans = classesInSchool * whitePaintCansPerClass;
        int brownPaintCans = classesInSchool * brownPaintCansPerClass;
        System.out.println("В школе, где " + classesInSchool + " классов, нужно " + whitePaintCans + " банок белой краски и "
                + brownPaintCans + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6:");
        short bananas = 5;
        short bananaWeight = 80;
        short millilerersOfmilk = 200;
        short hundredsOfMilliletersOfMilk = 200/100;
        short milkWeightPerHundredMillileters = 105;
        short IceCreamBlocks = 2;
        short IceCreamBlockWeight = 100;
        short eggs = 4;
        short eggWeight = 70;
        float breakfastWeightF = bananas * bananaWeight + hundredsOfMilliletersOfMilk * milkWeightPerHundredMillileters +
                IceCreamBlocks * IceCreamBlockWeight + eggs * eggWeight;
        System.out.println("Вес завтрака в граммах равен " + breakfastWeightF + " грамм");
        float breakfastWeightInKilos = breakfastWeightF / 1000;
        System.out.println("Вес завтрака в килограммах равен " + breakfastWeightInKilos + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7:");
        short weightToLose = 7;
        int weightToLoseInGrams = weightToLose * 1000;
        short minWeightLostPerDay = 250;
        int minDays = weightToLoseInGrams / minWeightLostPerDay;
        System.out.println("Минимум дней, чтобы сбросить вес - " + minDays);
        short maxWeightLostPerDay = 500;
        int maxDays = weightToLoseInGrams / maxWeightLostPerDay;
        System.out.println("Максимум дней, чтобы сбросить вес - " + maxDays);
        int avgWeightLostPerDay = (minWeightLostPerDay + maxWeightLostPerDay) / 2;
        int avgDays = (maxDays + minDays) / 2;
        System.out.println("В среднем дней, чтобы сбросить вес - " + avgDays);
    }

    public static void task8() {
        System.out.println("Задача 8:");
        int mashaSalary = 67760;
        int mashaImprovedSalary = (67760 * 110)/100;
        int denisSalary = 83690;
        int denisImprovedSalary = (denisSalary * 110)/100;
        int kristinaSalary = 76230;
        int kristinaImprovedSalary = (kristinaSalary * 110) / 100;
        int mashaYearlySalary = mashaSalary * 12;
        int mashaImprovedYearlySalary = mashaImprovedSalary * 12;
        int mashaDiff = mashaImprovedYearlySalary - mashaYearlySalary;
        System.out.println("Маша теперь получает " + mashaImprovedYearlySalary + " рублей, доход вырос на "
                + mashaDiff + " рублей");
        int denisYearlySalary = denisSalary * 12;
        int denisImprovedYearlySalary = denisImprovedSalary * 12;
        int denisDiff = denisImprovedYearlySalary - denisYearlySalary;
        System.out.println("Денис теперь получает " + denisImprovedYearlySalary + " рублей, доход вырос на "
                + denisDiff + " рублей");
        int kristinaYearlySalary = kristinaSalary * 12;
        int kristinaImprovedYearlySalary = kristinaImprovedSalary * 12;
        int kristinaDiff = kristinaImprovedYearlySalary - kristinaYearlySalary;
        System.out.println("Кристина теперь получает " + mashaImprovedYearlySalary + " рублей, доход вырос на "
                + kristinaDiff + " рублей ");
    }
}