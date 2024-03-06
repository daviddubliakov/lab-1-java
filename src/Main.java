//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();

        new MainThread(1,5, breakThread).start();
        new MainThread(2, 10, breakThread).start();
        new MainThread(3, 1, breakThread).start();

        new Thread(breakThread).start();
    }
}