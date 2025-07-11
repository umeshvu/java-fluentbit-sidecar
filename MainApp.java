import java.io.FileWriter;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        try (FileWriter writer = new FileWriter("/app/logs/app.log", true)) {
            while (true) {
                writer.write("Hello from Main Java App - " + System.currentTimeMillis() + "\n");
                System.out.println("Hello from Main Java App without time");
                writer.flush();
                Thread.sleep(5000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
