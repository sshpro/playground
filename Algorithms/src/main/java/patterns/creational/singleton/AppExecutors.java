package patterns.creational.singleton;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AppExecutors {

    private static AppExecutors sInstance;
    private static final Object SYNC_LOCK = new Object();

    private Executor mDiskIO, mNetworkIO, mMainThread;

    private AppExecutors(Executor mainThread, Executor diskIO, Executor networkIO){
        mMainThread = mainThread;
        mDiskIO = diskIO;
        mNetworkIO = networkIO;
    }

    public static AppExecutors getInstance(){

        if(sInstance == null){
            synchronized (SYNC_LOCK){
                sInstance = new AppExecutors(new MainThreadExecutor(), Executors.newSingleThreadExecutor(), Executors.newFixedThreadPool(3));
            }
        }

        return null;

    }

    public Executor diskIO() {
        return mDiskIO;
    }

    public Executor mainThread() {
        return mMainThread;
    }

    public Executor networkIO() {
        return mNetworkIO;
    }

    private static class MainThreadExecutor implements Executor{

        @Override
        public void execute(Runnable runnable) {
         // get hold of main thread & pass the runnable here
        }
    }

}
