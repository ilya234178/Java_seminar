package Interface;

public class Boy implements Player, Study{
    @Override
    public void play() {
        System.out.println("Запускать ногой ");
    }

    @Override
    public void read() {

    }
}
