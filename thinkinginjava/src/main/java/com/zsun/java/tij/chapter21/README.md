# 并发

不光有《Java编程思想》里第21章的内容，还有下面三篇博客的内容：

1. https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/
2. https://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/
3. https://winterbe.com/posts/2015/05/22/java8-concurrency-tutorial-atomic-concurrent-map-examples/

## Threads and Runnables

### 基本的 Runnable
一般一个Runnable的实例可以称之为一个 task
可以直接 task.run()
也可以把 task 做为参数传给 Thread，然后 thread.start()。

区别是，task.run() 运行的主体是main线程，thread.start() 则是 thread这个线程。

## Executors
直接用 Runnable 容易出错，所以Java 5 发布了 Concurrency API。
这个API即是 java.util.concurrent 这个库。

>Executors拥有多个方法，可以获取各种类型的 ExecutorService。
>1. newFixedThreadPool
>2. newWorkStealingPool
>3. newWorkStealingPool
>4. newFixedThreadPool
>5. newSingleThreadExecutor
>6. newSingleThreadExecutor
>7. newCachedThreadPool
>8. newCachedThreadPool

### 普通的 ExecutorService
Executors.newSingleThreadExecutor() 会返回一个 ExecutorService，然后submit一个任务。
这里的threadName 不再是 Thread-0，而是 pool-1-thread-1



优雅的关闭一个 ExecutorService：
```java
    try {
        System.out.println("attempt to shutdown executor");
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
        System.err.println("tasks interrupted");
    } finally {
        if (!executor.isTerminated()) {
            System.err.println("cancel non-finished tasks");
        }
        executor.shutdownNow();
        System.out.println("shutdown finished");
}
```

### Callables and Futures
Runnable是返回void，Callable则可以拥有返回值。

此外，Callable 也可以被 ExecutorService submit，但是 submit 只是提交，并不会等待结果返回，
所以 ExecutorService 就无法直接返回 Callable的结果。

这里，ExecutorService在submit之后返回一个 Future 类型的对象，然后这个 Future对象会在 Callable结束之后获得返回值。
```java
    Future<Integer> future = executor.submit(...);
    Integer result = future.get();
```

_*这里要注意，如果先行终止 ExecutorService，那么 future.get 就会报错！*_


### Timeouts
直接使用 future.get() 会阻塞整个程序，所以我们需要给它设置一个超时时间。
```java
    Integer result = future.get(1, TimeUnit.SECONDS);
```

### InvokeAll
ExecutorService批量提交task，可以使用 invokeAll 方法。同时返回一个 Future 列表。

### InvokeAny
invokeAll 会返回 Future 列表，而 invokeAny 会立马返回最先结束的任务。其他任务就不管了。


## Scheduled Executors
Executors 可以提交并运行tasks一次，如果想周期性运行任务，则需要 Scheduled Thread Pools。

ScheduledExecutorService可以周期性运行、或者延时一段时间的任务。
1. scheduleWithFixedRate(): 这个是定时器，到时间就跑，不管上次结束没有。
    它的运行时间也不是很精确的，从毫秒数看，误差在加减5毫秒以内
    例如：
    ```
    Scheduling: 1562373935836, nanoTime: 11909511287828
    Scheduling: 1562373936837, nanoTime: 11910511481794
    Scheduling: 1562373937834, nanoTime: 11911508583159
    ```
2. scheduleWithFixedDelay(): 这个是延时器，每隔固定时间跑一次，上次任务跑完才会运行。
    它的运行时间收到任务执行时间的影响，但是从毫秒数看，是递增的。
    ```
    Scheduling fixedDelay: 1562374331797, nanoTime: 12305454936286
    Scheduling fixedDelay: 1562374334808, nanoTime: 12308465301823
    Scheduling fixedDelay: 1562374337810, nanoTime: 12311467577072
    Scheduling fixedDelay: 1562374340812, nanoTime: 12314469935207
    Scheduling fixedDelay: 1562374343818, nanoTime: 12317475532392
    Scheduling fixedDelay: 1562374346825, nanoTime: 12320482121901
    Scheduling fixedDelay: 1562374349833, nanoTime: 12323490430627
    ```

这两种运行的方法，前者适合定时上报类似的任务；后者适合需要等任务完结后再跑的任务。
