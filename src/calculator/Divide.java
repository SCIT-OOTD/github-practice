package calculator;

/**
 * 나누기 기능 클래스
 * 담당: 팀원 D
 * 
 * TODO: 팀원 D가 이 클래스를 완성합니다.
 */
public class Divide {
    
    /**
     * 두 숫자를 나눕니다.
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 나눗셈 결과
     * @throws ArithmeticException 0으로 나눌 경우
     */
    public static double execute(double a, double b) {
        // TODO: 팀원 D가 구현
        if (b == 0) {
            System.out.println("0으로 나눌 수 없습니다");
          
        }
        return a / b;
    }
}
