package patterns.behavioural.command;

public class VolumeUpCommand implements ICommand {
    IElectronicDevice mElectronicDevice;

    public VolumeUpCommand(IElectronicDevice electronicDevice){
        mElectronicDevice = electronicDevice;
    }


    @Override
    public void execute() {
        mElectronicDevice.volumeUp();
    }

    @Override
    public void unExecute() {

    }
}
