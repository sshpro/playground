package patterns.behavioural.command;

public class OnCommand implements ICommand {
    IElectronicDevice mElectronicDevice;

    public OnCommand(IElectronicDevice electronicDevice){
        mElectronicDevice = electronicDevice;
    }


    @Override
    public void execute() {
        mElectronicDevice.on();
    }

    @Override
    public void unExecute() {

    }
}
