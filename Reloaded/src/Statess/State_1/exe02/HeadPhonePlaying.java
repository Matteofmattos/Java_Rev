package Statess.State_1.exe02;

public class HeadPhonePlaying implements HPState{

    private static final HPState instance = new HeadPhonePlaying();

    public HeadPhonePlaying() {}

    public static HPState getInstance(){
        return instance;
    }

    @Override
    public void clickLong(HeadPhone hp) {
        hp.setOn(false);
        hp.setPlaying(false);
        hp.setState(HeadPhoneOff.getInstance());
        System.out.println("Desligando o aparelho e interrompendo a música.");
    }

    @Override
    public void click(HeadPhone hp) {
        if (hp.isPlaying()){
            System.out.println("pausando a música...");
            hp.setPlaying(false);
            hp.setState(HeadPhonePaused.getInstance());
        }
    }
}
