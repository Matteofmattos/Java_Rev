package Statess.State_1.exe02;

public class HeadPhoneOff implements HPState{

    private static final HPState instance = new HeadPhoneOff(); // Singleton;

    public HeadPhoneOff() {}

    public static HPState getInstance() { // Passa a instância dessa classe ( singleton );
        return instance;
    }

    @Override
    public void clickLong(HeadPhone hp) {
        hp.setOn(true);
        System.out.println("Ligando aparelho...");
        hp.setState(HeadPhoneOn.getInstance());
    }

    @Override
    public void click(HeadPhone hp) {

    }
}
