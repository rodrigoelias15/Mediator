import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InquilinoApartamentoTest {
    
    @Test
    void deveElogiarSecretaria() {
        InquilinoApartamento inquilinoApartamento = new InquilinoApartamento();
        assertEquals("A Imobiliaria agradece o contato.\n" +
                        "O proprietário retornou a seguinte mensagem: Confirmo o pagamento " +
                        "de R$800.0 referente ao aluguel do apartamento.",
                         inquilinoApartamento.pagarAluguelProprietario(800));
    }

    @Test
    void deveReclamarSecretaria() {
        InquilinoApartamento inquilinoApartamento = new InquilinoApartamento();
        assertEquals("A Imobiliaria agradece o contato.\n" +
                        "Segue a resposta do proprietário à sua mensagem: O proprietário recebeu de você a " +
                        "seguinte mensagem: Banheiro precisando de reparos",
                inquilinoApartamento.enviarMensagemProprietario("Banheiro precisando de reparos"));
    }


}