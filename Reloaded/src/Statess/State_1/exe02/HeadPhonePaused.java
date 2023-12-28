package Statess.State_1.exe02;

public class HeadPhonePaused implements HPState{

    private static final HPState instance = new HeadPhonePaused();

    public HeadPhonePaused() {}

    public static HPState getInstance(){
        return instance;
    }

    @Override
    public void clickLong(HeadPhone hp) {
        hp.setOn(false);
        hp.setState(HeadPhoneOff.getInstance());
        System.out.println("Apenas desligando o aparelho.");
    }

    @Override
    public void click(HeadPhone hp) {
        if (!(hp.isPlaying())){
            hp.setPlaying(true);
            hp.setState(HeadPhonePlaying.getInstance());
            System.out.println("Reiniciando um música...");
        }
    }
}
