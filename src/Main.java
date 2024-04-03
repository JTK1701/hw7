public class Main {
    public static void main(String[] args) {

        System.out.println("1 задача");
        System.out.println(" ");
        float deposit = 0.0f;
        short month = 0;
        while (deposit <= 2_459_000) {
            month++;
            deposit += deposit/100;
            deposit += 15000;
            System.out.println("Месяц " + month + ", накопления составили - " + deposit + "р.");
        }

        System.out.println(" ");
        System.out.println("2 задача");
        short i = 0;
        while ( i < 10 ){
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (;i > 0;) {
            System.out.print(i + " ");
            i--;
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("3 задача");
        int popular = 12_000_000;
        int natality = (popular / 1000) * 17;
        int mortality = (popular / 1000 ) * 8;
        int populationGrowth = natality - mortality;
        for (int a = 0; a <= 10; a++) {
            System.out.println("Год " + a + ", численность населения составляет - " + popular + " человек");
            popular += populationGrowth;
        }

        System.out.println(" ");
        System.out.println("4 задача");
        float vasyasMoney = 15000.0f;
        int month4 = 0;
        while (vasyasMoney <= 12_000_000) {
            float percent = (vasyasMoney / 100) * 7;
            vasyasMoney += percent;
            month4++;
            System.out.println("Месяц - " + month4 + ", сумма накоплений равна - " + vasyasMoney);
        }

        System.out.println(" ");
        System.out.println("5 задача");
        float vasyasMoney5 = 15000.0f;
        int month5 = 0;
        while (vasyasMoney5 <= 12_000_000) {
            float percent = (vasyasMoney5 / 100) * 7;
            vasyasMoney5 += percent;
            month5++;
            int month6 = month5 % 6;
            if (month6 == 0) {
                System.out.println("Месяц - " + month5 + ", сумма накоплений равна - " + vasyasMoney5);
                }
            }

        System.out.println(" ");
        System.out.println("6 Задача");
        float vasyasMoney6 = 15000.0f;
        int month7 = 0;
        while (month7 <= ( 9 * 12 )) {
            float percent = (vasyasMoney6 / 100) * 7;
            vasyasMoney6 += percent;
            month7++;
            int month8 = month7 % 6;
            if (month8 == 0) {
                System.out.println("Месяц - " + month7 + ", сумма накоплений равна - " + vasyasMoney6);
            }
        }
        System.out.println(" ");
        System.out.println("7 задача");
        byte week = 7;
        int firstFriday = 6;
        for (int r = 1; r <= 31; r++) {
            int friday = (firstFriday - r) % 7;
            if (friday == 0) {
                System.out.println("Сегодня пятница, " + r + "-ое число. Необходимо подготовить отчет.");
            }
        }
        System.out.println(" ");
        System.out.println("8 задача");
        int comet = 79;
        int yearNow = 2024;
        int before = 200;
        int after = 100;
        System.out.println("Года появления кометы:" );
        for (int d = 0; d <= (yearNow + after); d++) {
            int yearOfComet = d % comet;
            if (yearOfComet == 0 && d >= (yearNow - before)) {
                System.out.println( d );
            }
        }


    }
}