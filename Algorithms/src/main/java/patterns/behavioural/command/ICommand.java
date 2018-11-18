package patterns.behavioural.command;

public interface ICommand {
    void execute();
    void unExecute(); // optional
}
