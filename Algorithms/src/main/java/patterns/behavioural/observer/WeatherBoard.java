package patterns.behavioural.observer;

public class WeatherBoard implements IObserver {

    private  IObservable mObservable;
    public WeatherBoard(IObservable observable){
        mObservable = observable;
    }

    private void startObserving(){
        mObservable.register(this);
    }

    private void stopObserving(){
        mObservable.unRegister(this);
    }
    
    @Override
    public void update() {
        // update the display board
    }
}
