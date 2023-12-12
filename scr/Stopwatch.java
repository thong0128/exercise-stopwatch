public class Stopwatch {
    private long startTime;
    private long endTime;

    public void start() {
            this.startTime = System.currentTimeMillis();
    }
    public void stop() {
            this.endTime = System.currentTimeMillis();
    }
    public double getElapsedtime() {
        long elapsedTime = this.endTime - this.startTime;
        long milliseconds = elapsedTime % 1000;
        return milliseconds;
    }
}
