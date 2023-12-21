import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ochko = 0;
        int ochko1 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча раунд тандайсыз ");
        int a = scanner.nextInt();
        for (int p = 0; p < a; p++) {

            Random ran = new Random();
            int ochkoigroka = 0;

            for (int i = 0; i < 2; i++) {
                int krug = ran.nextInt(1, 6);
                ochkoigroka += krug;

                switch (krug) {
                    case 1 -> System.out.println("+-------+\n|       |\n|   #   |\n|       |\n+-------+");
                    case 2 -> System.out.println("+-------+\n| #     |\n|       |\n|     # |\n+-------+");
                    case 3 -> System.out.println("+-------+\n|     # |\n|   #   |\n| #     |\n+-------+");
                    case 4 -> System.out.println("+-------+\n| #   # |\n|       |\n| #   # |\n+-------+");
                    case 5 -> System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                    case 6 -> System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                }
            }

            System.out.println("\n" + "Ваш ачко  : " + ochkoigroka + "\n");

            Random ran2 = new Random();
            int ochkobota= 0;


            for (int i = 0; i < 2; i++) {
                int kvadrat = ran2.nextInt(1, 6);
                ochkobota += kvadrat;

                switch (kvadrat) {
                    case 1 -> System.out.println("+-------+\n|       |\n|   #   |\n|       |\n+-------+");
                    case 2 -> System.out.println("+-------+\n| #     |\n|       |\n|     # |\n+-------+");
                    case 3 -> System.out.println("+-------+\n|     # |\n|   #   |\n| #     |\n+-------+");
                    case 4 -> System.out.println("+-------+\n| #   # |\n|       |\n| #   # |\n+-------+");
                    case 5 -> System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                    case 6 -> System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");

                }


            }
            System.out.println("\n" + "очко бота  : " + ochkobota + "\n");

            if (ochkobota > ochkoigroka) {
                System.out.println("Вы выиграли бота: " + p + "раунд счетом : " + ochkobota + ":" + ochkoigroka + "\n");
                ochko1++;
            } else {
                System.out.println("Вы выиграли бота: " + p + "раунд счетом : " + ochkoigroka + ":" + ochkobota + "\n");
                ochko++;
            }
            System.out.println("общий счеть " + ochko+ " : " + ochko1 + " БОТ");

        }


    }

}