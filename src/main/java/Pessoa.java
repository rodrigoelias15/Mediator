public class Pessoa {

    public String pagarAluguelProprietario(float valorAluguel) {
        return Imobiliaria.getInstancia().receberAluguelProprietario(valorAluguel);
    }

    public String enviarMensagemProprietario(String mensagem) {
        return Imobiliaria.getInstancia().receberMensagemProprietario(mensagem);
    }

}
