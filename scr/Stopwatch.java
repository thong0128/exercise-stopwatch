public class Stopwatch {
    private long startTime, endTime;
    public Stopwatch() {
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public void start() {
            this.startTime = System.currentTimeMillis();
    }
    public void stop() {
            this.endTime = System.currentTimeMillis();
    }
    public double getElapsedtime() {
        long elapsedTime = this.endTime - this.startTime;
        return elapsedTime;
    }
}
