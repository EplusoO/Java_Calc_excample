import java.util.Scanner;

public class Calc {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите первое число: ");
            int first = scanner.nextInt();


            System.out.print("Введите второе число: ");
            int second = scanner.nextInt();

            System.out.print("Какое действие необходимо выполнить?(*, /, +, -): ");
            String operation = scanner.next();
            switch (operation){
                case "*" : {
                    int result = first * second;
                    System.out.print("Ответ "+result);
                    break;
                }
                case "/" : {
                    float result = (float) first / (float) second;
                    System.out.print("Ответ "+result);
                    break;
                }
                case "+" : {
                    int result = first + second;
                    System.out.print("Ответ "+result);
                    break;
                }
                case "-" : {
                    int result = first - second;
                    System.out.print("Ответ "+result);
                    break;
                }
            }

        }
    }