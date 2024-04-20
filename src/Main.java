import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfThreads = scanner.nextInt();
        BreakThread breakThread = new BreakThread();

        for (int i = 0; i < numberOfThreads; i++) {
            int threadId = i + 1;
            Random random = new Random();
            int stepsToAdd = random.nextInt(10 - 1 + 1) + 10; // Generates random number from 1 to 10
            new MainThread(threadId,stepsToAdd, breakThread).start();
        }

        System.out.println("Started amount of threads: " + numberOfThreads);

        new Thread(breakThread).start();

    }
}