package calculatorif;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> history = new ArrayList<>();

    // 리스트에 추가
    public void addHistory(int result) {
        history.add(result);
    }

    // 리스트에서 삭제 세터?
    public void removeHistory() {
        history.remove(0);
    }

    // 계산 기록 출력 게터?
    public void printHistory() {
        if (history.isEmpty()) {
            System.out.println("이전 기록이 없습니다.");
        } else {
            System.out.println("계산 기록 = " + history);
        }
    }

    // 덧셈 메서드
    public int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    //뺄셈 메서드
    int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    //곱셈 메서드
    int multip(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    //나눗셈
    int divison(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
}
