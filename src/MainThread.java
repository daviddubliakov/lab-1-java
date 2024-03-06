public class MainThread extends Thread{
    private final int id;
    private final int stepToAdd;
    private final BreakThread breakThread;

    public MainThread(int id, int stepToAdd, BreakThread breakThread) {
        this.id = id;
        this.stepToAdd = stepToAdd;
        this.breakThread = breakThread;
    }

    public void run() {
        long sum = 0;
        long sumOfSteps = 0;
        boolean isStop = false;

        do {
            sum += stepToAdd;
            isStop = breakThread.isCanBreak();
            sumOfSteps++;
        } while (!isStop);
        System.out.println(id + ", steps: " + sumOfSteps + ", sum: " + sum);
    }
}
