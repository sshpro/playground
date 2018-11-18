package patterns.behavioural.command;

public class OffCommand implements ICommand {
    IElectronicDevice mElectronicDevice;

    public OffCommand(IElectronicDevice electronicDevice){
        mElectronicDevice = electronicDevice;
    }

    @Override
    public void execute() {
        mElectronicDevice.off();
    }

    @Override
    public void unExecute() {

    }
}
