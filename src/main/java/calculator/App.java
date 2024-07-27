package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();// Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        System.out.print("사칙연산 기호를 입력하세요: ");

        //2.
        char calculationSymbol = sc.nextLine().charAt(0);// 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.


        int result = 0;


        //4. 반복문 사용 해서 연산을 반복, exit를 입력 받으면 반복 종료
        boolean runnuing = true ;
        while (runnuing) {/* 반복문 사용 해서 연산을 반복 */
            if (calculationSymbol == '+') {/* 3.제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
                result = num1 + num2;
            }
            else if (calculationSymbol == '-'){
                result = num1 - num2;
            }
            else if (calculationSymbol == '*'){
                result = num1 * num2;
            }
            else if (calculationSymbol == '/'){
                result = num1 / num2;
            }

            System.out.println("결과: " + result);



            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까 ? 예 : y 키를 누르세요(exit 입력 시 종료)");/* exit을 입력 받으면 반복 종료 */
            String answer = sc.nextLine();
            if (answer.equals("y")) {
               continue;
            }
            else if (answer.equals("exit")) {
                runnuing = false;
            }
        }

        // 5 . 연산 결과 10개를 저장할 수 있는 배열을 선언 및 생성하고 연산의 결과를 저장합니다
        int[] resultArr = new int[10];
        for (int i = 0; i < 10; i++) { /* index를 증가 시킵니다. */
            resultArr[i] = result;/* 연산의 결과를 배열에 저장합니다. */
            System.out.println("결과: " + resultArr[i]);
        }


        //6.연산 결과가 10개를 초과하는 경우 가장 먼저 저장된 결과를 삭제하고
        // 새로운 연산 결과가 저장될 수 있도록 소스 코드를 수정합니다



    }
}
