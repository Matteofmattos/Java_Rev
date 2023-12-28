package Statess.State_1.exe02;

public class AppHeadPhone {

    public static void main(String[] args) {
        HeadPhone phone = new HeadPhone();
        System.out.println(phone.isOn());
        phone.click();
        phone.clickLong();
        System.out.println(phone.isOn());
        phone.click();
        phone.clickLong();
        System.out.println(phone.isOn());
        phone.clickLong();
        phone.click();
        phone.click();
        phone.clickLong();
        phone.click();
        System.out.println(phone.isOn());

    }
}
