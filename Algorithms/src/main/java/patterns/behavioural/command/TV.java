package patterns.behavioural.command;

public class TV implements IElectronicDevice {
    @Override
    public void on() {
    // Switch on TV
    }

    @Override
    public void off() {
        // Switch off TV
    }

    @Override
    public void volumeUp() {
        //  increase volume
    }

    @Override
    public void volumeDown() {
        //decrease volume
    }
}
