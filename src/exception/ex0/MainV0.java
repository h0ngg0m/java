package exception.ex0;

import java.util.Scanner;

public class MainV0 {

    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 데이터를 입력하세요: ");
            String data = scanner.nextLine();
            if (data.equals("exit")) {
                break;
            }
            networkService.sendMessage(data);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
