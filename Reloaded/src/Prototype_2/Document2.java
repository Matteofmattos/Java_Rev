package Prototype_2;

// Prototype.
public final class Document2 implements Cloneable {

    String name;
    String visibility;
    String type;
    String localization;

    @Override
    protected Document2 clone() throws CloneNotSupportedException {
        return (Document2) super.clone();
    }

    @Override
    public String toString() {
        return String.format(" Name: %s%n visibility: %s%n Type: %s%n Localization: %s%n ",
                this.name,this.visibility,this.type,this.localization);
    }
}
