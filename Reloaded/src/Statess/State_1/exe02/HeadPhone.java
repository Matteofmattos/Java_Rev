package Statess.State_1.exe02;

public class HeadPhone {
    private HPState state; // Estado;
    private boolean isOn; // Situação;
    private boolean isPlaying; // situação;

    public HeadPhone() {
        this.state = HeadPhoneOff.getInstance();
        this.isOn = false;
        this.isPlaying = false;
    }

    public void setState(HPState state) {
        this.state = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void clickLong(){
        System.out.println("click long pressed.");
        state.clickLong(this);
    }

    public void click(){
        System.out.println("click pressed.");
        state.click(this);
    }

    public HPState getState() {
        return state;
    }

    public boolean isPlaying() {
        return isPlaying;
    }
}
