package patterns.behavioural.observer;

import java.util.HashSet;

public class WeatherService implements IObservable {

    private HashSet<IObserver> mObservers = new HashSet<>();
    private Weather mWeather = new Weather();

    @Override
    public void register(IObserver observer) {
        mObservers.add(observer);
    }

    @Override
    public void unRegister(IObserver observer) {
        mObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(IObserver observer: mObservers)
            observer.update();
    }

    Weather getStatus(){ // for simplicity i have not explained how weather changes, as it is beyond scope of this pattern
        return mWeather;
    }

}
