package back;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        new FunctionsK();
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}