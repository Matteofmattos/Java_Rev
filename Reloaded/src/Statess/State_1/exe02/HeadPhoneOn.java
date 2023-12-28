package Statess.State_1.exe02;

public class HeadPhoneOn implements HPState{

    private static final HPState instance = new HeadPhoneOn();

    public HeadPhoneOn() {}

    public static HPState getInstance(){
        return instance;
    }

    @Override
    public void clickLong(HeadPhone hp) {
        hp.setOn(false);
        System.out.println("Desligando o aparelho...");
    }

    @Override
    public void click(HeadPhone hp) {
        hp.setPlaying(true);
        hp.setState(HeadPhonePlaying.getInstance());
        System.out.println("Tocando uma música...");
    }

}
