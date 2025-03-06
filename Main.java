package calculatorif;

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // 변수 선언과 초기화

        String off = new String();
        String check = new String();

        do {
            System.out.println("첫번째 숫자를 입력하세요");
            int num1 = sc.nextInt();
            sc.nextLine();

            System.out.println("연산기호를 입력하세요 (+,-,*,/)");
            char operater = sc.next().charAt(0);
            while (operater != '+' && operater != '-' && operater != '*' && operater != '/') {
                System.out.println("+,-,*,/ 기호 중 하나를 입력해 주세요");
                operater = sc.next().charAt(0);
            }
            sc.nextLine();

            System.out.println("두번째 숫자를 입력하세요");
            int num2 = sc.nextInt();
            sc.nextLine();

            if (operater == '+') {
                int result = calculator.sum(num1, num2);
                System.out.println(result);
                calculator.addHistory(result);
            } else if (operater == '-') {
                int result = calculator.minus(num1, num2);
                System.out.println(result);
                calculator.addHistory(result);
            } else if (operater == '*') {
                int result = calculator.multip(num1, num2);
                System.out.println(result);
                calculator.addHistory(result);
            } else if (operater == '/') {
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                } else {
                    int result = calculator.divison(num1, num2);
                    System.out.println(result);
                    calculator.addHistory(result);
                }
            }

            System.out.println("기록을 확인하시겠습니까? (y/n)");
            check = sc.next();
            while (!check.equals("y") && !check.equals("n")) {
                System.out.println("잘못 입력했습니다. 'y' / 'n'을 입력해주세요");
                check = sc.next();
            }
            if (check.equals("y")){
                calculator.printHistory();
            }

            System.out.println("기록을 삭제하시겠습니까? (y/n) (1번째 기록부터 삭제됩니다.)");
            check = sc.next();
            while (!check.equals("y") && !check.equals("n")) {
                System.out.println("잘못 입력했습니다. 'y' / 'n'을 입력해주세요");
                check = sc.next();
            }
            if (check.equals("y")) {
                calculator.removeHistory();
                calculator.printHistory();
            }

            System.out.println("종료하시겠습니까? (y/n)");
            off = sc.next();

            while (!off.equals("y") && !off.equals("n")) {
                System.out.println("'y' / 'n'을 입력해주세요");
                off = sc.next();
            }
        } while (!off.equals("y"));
        System.out.println("프로그램을 종료합니다.");
    }
}

