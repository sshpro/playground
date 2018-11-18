package patterns.behavioural.command;

public class VolumeDownCommand implements ICommand {
    IElectronicDevice mElectronicDevice;

    public VolumeDownCommand(IElectronicDevice electronicDevice){
        mElectronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        mElectronicDevice.volumeDown();
    }

    @Override
    public void unExecute() {

    }
}
