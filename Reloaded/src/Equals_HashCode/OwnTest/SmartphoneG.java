package Equals_HashCode.OwnTest;

import java.util.Objects;

public class SmartphoneG {
    private Integer serialNumber;
    private String marca;

    public SmartphoneG(Integer serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }


    // Regras do Equals.
    // Reflexivo e consistente : x.equals(x)== true para tudo diferente de null;
    // Simétrico : x.equals(y) = y.equals(x) == true; para diferentes de null.
    // Transitividade para x,y,z. x.equals(y)==y.equals(z)==z.equals(x).
    // Se x!=null então x.equals(null) = false;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphoneG that = (SmartphoneG) o;
        return Objects.equals(serialNumber, that.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    public boolean equals1(Object o) {
        return this == o;
    }
}
