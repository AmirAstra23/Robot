import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Data d = new Data();
        ExecutorService es = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) es.submit(new PoolThreads(d));
        TimeUnit.SECONDS.sleep(1);
        es.shutdown();
        es.awaitTermination(10000, TimeUnit.MILLISECONDS);
        Data.printMap();

    }
}

