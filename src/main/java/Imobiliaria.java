public class Imobiliaria {

    private static Imobiliaria instancia = new Imobiliaria();

    private Imobiliaria() {}

    public static Imobiliaria getInstancia() {
        return instancia;
    }

    public String receberAluguelProprietario(float valorAluguel) {
        return "A Imobiliaria agradece o contato.\n"+
                "O proprietário retornou a seguinte mensagem: " +
                ProprietarioApartamento.getInstancia().receberAluguel(valorAluguel);
    }

    public String receberMensagemProprietario(String mensagem) {
        return "A Imobiliaria agradece o contato.\n"+
                "Segue a resposta do proprietário à sua mensagem: " +
                ProprietarioApartamento.getInstancia().receberMensagem(mensagem);
    }
}
