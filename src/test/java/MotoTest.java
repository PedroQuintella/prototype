import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {

    @Test
    void testClone() throws CloneNotSupportedException{
        Moto moto = new Moto("1920kg60", new Modelo("Suzuki", "suzukiv3"));

        Moto motoClone = moto.clone();
        motoClone.setPlaca("1880kg40");
        motoClone.getModelo().setNome("Honda");
        motoClone.getModelo().setMotor("hondav2");

        assertEquals("Moto{placa=1920kg60, modelo=Modelo{nome=Suzuki, motor=suzukiv3'}'}", moto.toString());
        assertEquals("Moto{placa=1880kg40, modelo=Modelo{nome=Honda, motor=hondav2'}'}", motoClone.toString());
    }
}