public class Modelo implements Cloneable{
    private String nome;
    private String motor;

    public Modelo(String nome, String motor) {
        super();
        this.nome = nome;
        this.motor = motor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return "Modelo{" +
                "nome=" + nome +
                ", motor=" + motor + '\'' +
                "}";
    }
}