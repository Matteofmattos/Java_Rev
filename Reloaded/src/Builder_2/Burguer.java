package Builder_2;

public class Burguer {
    private String Meat= "NO Meat.";
    private String Cheese = "NO Cheese.";
    private String Salad = "NO Salad.";
    private String Bun="NO Bun.";
    private String Souce="NO Souce.";

    public String getMeat() {
        return Meat;
    }

    public void setMeat(String meat) {
        Meat = meat;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public String getSalad() {
        return Salad;
    }

    public void setSalad(String salad) {
        Salad = salad;
    }

    public String getBun() {
        return Bun;
    }

    public void setBun(String bun) {
        Bun = bun;
    }

    public String getSouce() {
        return Souce;
    }

    public void setSouce(String souce) {
        Souce = souce;
    }

    @Override
    public String toString() {
        return "Ingredientes: "+this.Bun+","+this.Cheese+","+this.Meat+","+
                this.Salad+","+this.Souce;
    }
}
