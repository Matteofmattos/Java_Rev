package prototype_1;

// Prototype.
public final class Document1 implements Cloneable {

    String name;
    String visibility;
    String type;
    String localization;

    @Override
    protected Document1 clone() throws CloneNotSupportedException {
        return (Document1) super.clone();
    }

    @Override
    public String toString() {
        return String.format(" Name: %s%n visibility: %s%n Type: %s%n Localization: %s%n ",
                this.name,this.visibility,this.type,this.localization);
    }
}
