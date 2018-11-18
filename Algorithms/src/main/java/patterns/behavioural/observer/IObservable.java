package patterns.behavioural.observer;

public interface IObservable {
    void register(IObserver observer);
    void unRegister(IObserver observer);
    void notifyObserver();
}
