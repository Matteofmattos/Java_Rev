package Observer_1;

import java.util.ArrayList;
import java.util.List;

public class Journalist implements Subject{

    private final List<Observer> observers = new ArrayList<>();
    private String title,summary,image,text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(this));
    }

    public void publish(String title, String summary, String image, String text) {
        this.title = title;
        this.summary = summary;
        this.image = image;
        this.text = text;
        notifyObserver();
    }

    @Override
    public String toString() {
        return "\ntitle: " + title + '\n' +
                "summary: " + summary + '\n' +
                "image: " + image + '\n' +
                "text: " + text + '\n';
    }
}
