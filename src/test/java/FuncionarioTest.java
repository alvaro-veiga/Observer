import org.example.Empresa;
import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FuncionarioTest {
    @Test
    public void deveEnviarResultadoDeDesempenho() {
        Empresa empresa = new Empresa("casas bahia", "Excelente");
        Funcionario funcionario = new Funcionario("Marcão brabo");
        funcionario.adicionar(empresa);
        empresa.relatarDesempenho();
        assertEquals("Marcão brabo, resultado de desempeno: Status { Funcionario: casas bahia, Status: Excelente }", funcionario.getDesempenho());
    }
}
