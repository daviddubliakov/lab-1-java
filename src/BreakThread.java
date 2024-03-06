public class BreakThread implements Runnable{
    private boolean canBreak = false;

    public void run() {
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        canBreak = true;
    }

    synchronized public boolean isCanBreak() {
        return canBreak;
    }
}
