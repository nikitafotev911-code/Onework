import java.util.Scanner;

public class Main {
    private static boolean runNextGame(Scanner scanner){
        System.out.println("Попробуешь еще раз? (да / нет)");
        String answer = scanner.nextLine();

        if(answer == null || answer.isBlank()){
            answer = scanner.nextLine();
        }

        if(answer.equals("да"))  return true;
        if(answer.equals("нет")) return false;

        return runNextGame(scanner);
    }



    public static void  main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи свое имя:");
        String name = scanner.nextLine();

        System.out.println(name + ", я умею складывать числа. Давай попробуем!");

        while (true) {
            System.out.println("Введи первое число:");
            Integer num1 = scanner.nextInt();

            System.out.println("Введи второе число:");
            Integer num2 = scanner.nextInt();

            System.out.println(num1 +" + "+ num2 + " = " + (num1 + num2));

            boolean run = runNextGame(scanner);
            if(run == false) break;
        }
        System.out.println(name + ", спасибо за проведенное время!");
    }
}
