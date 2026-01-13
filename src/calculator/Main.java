package calculator;

import java.util.Scanner;

/**
 * 계산기 메인 클래스
 * 팀장이 작성하는 메인 실행 로직
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=================================");
        System.out.println("     🧮 Java 계산기 프로그램");
        System.out.println("=================================");
        System.out.println();
        
        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = scanner.nextDouble();
        
        System.out.println();
        System.out.println("연산을 선택하세요:");
        System.out.println("1. 더하기 (+)");
        System.out.println("2. 빼기 (-)");
        System.out.println("3. 곱하기 (×)");
        System.out.println("4. 나누기 (÷)");
        System.out.print("선택: ");
        int choice = scanner.nextInt();
        
        double result = 0;
        String operation = "";
        
        try {
            switch (choice) {
                case 1:
                    result = Add.execute(num1, num2);
                    operation = "+";
                    break;
                case 2:
                    result = Subtract.execute(num1, num2);
                    operation = "-";
                    break;
                case 3:
                    result = Multiply.execute(num1, num2);
                    operation = "×";
                    break;
                case 4:
                    result = Divide.execute(num1, num2);
                    operation = "÷";
                    break;
                default:
                    System.out.println("❌ 잘못된 선택입니다.");
                    scanner.close();
                    return;
            }
            
            System.out.println();
            System.out.println("=================================");
            System.out.printf("결과: %.2f %s %.2f = %.2f%n", num1, operation, num2, result);
            System.out.println("=================================");
            
        } catch (ArithmeticException e) {
            System.out.println("❌ 오류: " + e.getMessage());
        }
        
        scanner.close();
    }
}
