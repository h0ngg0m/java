package exception.ex2;


import java.util.Scanner;

public class MainV2_5 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

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
