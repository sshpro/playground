package patterns.behavioural.command;

public class TVRemote implements IRemote {

    ICommand onCommand, offCommand, upCommand, downCommand;


    TVRemote( ICommand onCommand,ICommand offCommand,ICommand upCommand,ICommand downCommand){
        this.onCommand = onCommand;
        this.offCommand = offCommand;
        this.upCommand = upCommand;
        this.downCommand = downCommand;
    }

    @Override
    public void onOnClick() {
        onCommand.execute();
    }

    @Override
    public void onOffClick() {
        offCommand.execute();
    }

    @Override
    public void onUpClick() {
        upCommand.execute();
    }

    @Override
    public void onDownClick() {
        downCommand.execute();
    }
}
