package calculator;

import java.util.Scanner;

public class App {
    // 1.Scanner 를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
    // 2.Scanner 를 사용하여 사칙연산 기호를 전달 받을 수 있습니다
    // 3.입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력합니다.
    // 4.반복문을 사용하여 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있도록 소스 코드를 수정합니다
    // 5.연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 연산의 결과를 저장합니다.
    // 6. 연산 결과가 10개를 초과하는 경우 가장 먼저 저장된 결과를 삭제하고 새로운 연산 결과가 저장될 수 있도록 소스 코드를 수정합니다
    public static void main(String[] args) {
        int resultArr_size = 5; /* 연산의 결과가 저장된 배열의 마지막 index 를 저장하는 변수를 선언 */
        int resultArr_LastIndex = resultArr_size - 1; //마지막 인덱스 선언
        int[] resultArr = new int[resultArr_size];/* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        Scanner sc = new Scanner(System.in);

        int resultArr_Index = 0; // resultArr 에들어갈 인덱스 선언
        String answer = "y";
        while (!answer.equals("exit")) {// 반복문 사용 해서 연산을 반복
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();// Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();// Scanner 를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("사칙연산 기호를 입력하세요: ");
            char calculationSymbol = sc.next().charAt(0);// 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.

            int result = 0;

            switch (calculationSymbol) {/* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;


            }
            System.out.println("결과: " + result);

            resultArr[resultArr_Index] = result;/* 연산의 결과를 배열에 저장합니다. */
            resultArr_Index++; /* index 를 증가 시킵니다. */
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.next();
            /* exit 을 입력 받으면 반복 종료 */

            /* 6.위 요구사항에 맞게 구현 */
            if (resultArr_Index == resultArr_size) { // 현재 인덱스가 배열의 사이즈와 같으면
                resultArr_Index = resultArr_LastIndex;  // 현재인덱스에 마지막 인덱스 대입
                for (int i = 0; i <resultArr.length -1; i++) { //
                    resultArr[i] = resultArr[i +1];

                }

            }
            resultArr[resultArr_LastIndex] = result;


        }


    }

}

