package main.java.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.println("첫번째숫자,두번째숫자="+firstNumber+","+secondNumber);
    }
}