import java.util.Scanner;

public class fokus {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Привет! Могу угадать твой день рождения!");
        Thread.sleep(1000);
        System.out.println("Умножь на 2 день своего рождения");
        Thread.sleep(2000);
        System.out.println("Прибавь результат к числу 5");
        Thread.sleep(2000);
        System.out.println("Умножь на 50 полученную сумму");
        Thread.sleep(2000);
        System.out.println("Прибавь к результату номер месяца рождения(июль — 7, январь — 1)");
        Thread.sleep(2000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи полученное число: ");
        int result = sc.nextInt();


        if (result < 351 || result > 3362) {                    //Проверка
            System.out.println("Число не корректно");
        }else {
            result = result - 250;
            System.out.print("Твой день рождения: ");
            int date = getDateOfBirth(result);
            int month = getMonthOfBirth(result);
            printDayAndMonth(date, month);
            System.out.print("Знак зодиака: ");
            printZodiacSign(date, month);
        }

    }


    public static int getDateOfBirth(int resultNumber){
        return resultNumber / 100;
    }

    public static int getMonthOfBirth(int resultNumber){
        return resultNumber % 100;
    }

    public static void printDayAndMonth(int date, int month){
        System.out.print(date + " ");
        switch (month){
            case 1:
                System.out.println("января");
                break;
            case 2:
                System.out.println("февраля");
                break;
            case 3:
                System.out.println("марта");
                break;
            case 4:
                System.out.println("апреля");
                break;
            case 5:
                System.out.println("мая");
                break;
            case 6:
                System.out.println("июня");
                break;
            case 7:
                System.out.println("июля");
                break;
            case 8:
                System.out.println("августа");
                break;
            case 9:
                System.out.println("сентября");
                break;
            case 10:
                System.out.println("октября");
                break;
            case 11:
                System.out.println("ноября");
                break;
            case 12:
                System.out.println("декабря");
                break;
        }
    }

    public static void printZodiacSign(int date, int month){
        switch (month) {
            case 1:
                if(date < 20)
                    System.out.println("Козерог");
                else
                    System.out.println("Водолей");
                break;
            case 2:
                if(date < 19)
                    System.out.println("Водолей");
                else
                    System.out.println("Рыба");
                break;
            case 3:
                if(date < 21)
                    System.out.println("Рыба");
                else
                    System.out.println("Овен");
                break;
            case 4:
                if(date < 20)
                    System.out.println("Овен");
                else
                    System.out.println("Телец");
                break;
            case 5:
                if(date < 21)
                    System.out.println("Телец");
                else
                    System.out.println("Близнецы");
                break;
            case 6:
                if(date < 22)
                    System.out.println("Близнецы");
                else
                    System.out.println("Рак");
                break;
            case 7:
                if(date < 23)
                    System.out.println("Рак");
                else
                    System.out.println("Лев");
                break;
            case 8:
                if(date < 23)
                    System.out.println("Лев");
                else
                    System.out.println("Дева");
                break;
            case 9:
                if(date < 23)
                    System.out.println("Дева");
                else
                    System.out.println("Весы");
                break;
            case 10:
                if(date < 23)
                    System.out.println("Весы");
                else
                    System.out.println("Скорпион");
                break;
            case 11:
                if(date < 23)
                    System.out.println("Скорпион");
                else
                    System.out.println("Стрелец");
                break;
            case 12:
                if(date < 22)
                    System.out.println("Стрелец");
                else
                    System.out.println("Козерог");
                break;
        }
    }
}
