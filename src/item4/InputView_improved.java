package item4;

public class InputView_improved {

    private static final String inputMessage="값을 입력하세요 : ";

    // 인스턴스화 방지용
    private InputView_improved() {
        throw new AssertionError("유틸리티 클래스입니다.");
    }

    public static void printInputMessage() {
        System.out.println("inputMessage = " + inputMessage);
    }

}
