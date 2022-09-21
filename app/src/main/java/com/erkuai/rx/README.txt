
    Flowable       发送0个N个的数据，支持Reactive-Streams和背压
    Observable     发送0个N个的数据，不支持背压
    Single         只能发送单个数据或者一个错误
    Completable    没有发送任何数据，但只处理 onComplete 和 onError 事件
    Maybe          能够发射0或者1个数据，要么成功，要么失败


Schedulers：
    AndroidSchedulers.mainThread()	需要引用rxandroid, 切换到UI线程
    Schedulers.computation()	    用于计算任务，如事件循环和回调处理，默认线程数等于处理器数量
    Schedulers.io()	                用于IO密集型任务，如异步阻塞IO操作，这个调度器的线程池会根据需求，它默认是一个CacheThreadScheduler
    Schedulers.newThread()	        为每一个任务创建一个新线程
    Schedulers.trampoline()	        在当前线程中立刻执行，如当前线程中有任务在执行则将其暂停，
                                    等插入进来的任务执行完成之后，在将未完成的任务继续完成
    Scheduler.from(executor)	    指定Executor作为调度器



