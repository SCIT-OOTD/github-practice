package calculator;

/**
 * 계산기 통합 클래스
 * 모든 연산 기능을 하나로 묶어 제공
 * 팀장이 작성하는 클래스
 */
public class Calculator {
    
    /**
     * 더하기 연산
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 덧셈 결과
     */
    public double add(double a, double b) {
        return Add.execute(a, b);
    }
    
    /**
     * 빼기 연산
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 뺄셈 결과
     */
    public double subtract(double a, double b) {
        return Subtract.execute(a, b);
    }
    
    /**
     * 곱하기 연산
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 곱셈 결과
     */
    public double multiply(double a, double b) {
        return Multiply.execute(a, b);
    }
    
    /**
     * 나누기 연산
     * @param a 첫 번째 숫자
     * @param b 두 번째 숫자
     * @return 나눗셈 결과
     * @throws ArithmeticException 0으로 나눌 경우
     */
    public double divide(double a, double b) {
        return Divide.execute(a, b);
    }
}
