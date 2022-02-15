public class ProprietarioApartamento implements ProprietarioImovel {

    private static ProprietarioApartamento instancia = new ProprietarioApartamento();

    private ProprietarioApartamento(){}

    public static ProprietarioApartamento getInstancia() {
        return instancia;
    }

    public String receberAluguel(float valorAluguel) {
        return "Confirmo o pagamento de R$" + valorAluguel + " referente ao aluguel do apartamento.";
    }

    @Override
    public String receberMensagem(String mensagem) {
        return "O proprietário recebeu de você a seguinte mensagem: "
                + mensagem;
    }
}
