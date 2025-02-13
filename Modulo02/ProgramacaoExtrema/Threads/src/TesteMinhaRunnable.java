public class TesteMinhaRunnable {
    public static void main(String[] args) {
        MinhaRunnableThread runnable = new MinhaRunnableThread();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
