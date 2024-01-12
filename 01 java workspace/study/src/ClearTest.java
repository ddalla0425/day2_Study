import java.io.IOException;
public class ClearTest {

    public static void main(String[] args) {
        try {
            // 콘솔 창을 지우기 위해 clear 명령을 실행 (Windows에서는 cls, macOS나 Linux에서는 clear)
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }

            // 여기에 초기화 된 내용이 출력됩니다.
            System.out.println("콘솔이 초기화되었습니다.");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
