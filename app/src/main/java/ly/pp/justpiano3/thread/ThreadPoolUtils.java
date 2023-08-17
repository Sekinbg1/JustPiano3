package ly.pp.justpiano3.thread;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolUtils {

    // 线程池核心线程数
    private static final int CORE_POOL_SIZE = 10;
    // 线程池最大线程数
    private static final int MAX_POOL_SIZE = 100;
    // 额外线程空状态生存时间
    private static final int KEEP_ALIVE_TIME = 10000;
    // 阻塞队列。当核心线程都被占用，且阻塞队列已满的情况下，才会开启额外线程。
    private static final BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(10);

    // 线程工厂
    private static final ThreadFactory threadFactory = new ThreadFactory() {
        private final AtomicInteger integer = new AtomicInteger();

        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "ThreadPool thread:" + integer.getAndIncrement());
        }
    };

    //线程池
    private static final ThreadPoolExecutor threadPool;

    static {
        threadPool = new ThreadPoolExecutor(CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS, workQueue, threadFactory);
    }

    /**
     * 从线程池中抽取线程，执行指定的Runnable对象
     *
     * @param runnable 线程
     */
    public static void execute(Runnable runnable) {
        if (runnable != null) {
            threadPool.execute(runnable);
        }
    }
}