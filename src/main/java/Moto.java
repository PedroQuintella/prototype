public class Moto implements Cloneable{
    private String placa;
    private Modelo modelo;

    public Moto(String placa, Modelo modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public Moto clone() throws CloneNotSupportedException{
        Moto MotoClone = (Moto) super.clone();
        MotoClone.modelo = (Modelo) MotoClone.modelo.clone();
        return MotoClone;
    }

    @Override
    public  String toString() {
        return "Moto{"+
                "placa="+placa+
                ", modelo="+modelo+ '\''+
                '}';

    }
}
