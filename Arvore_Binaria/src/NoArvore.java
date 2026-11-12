public class NoArvore {
    String[] dicas;

    String perguntaResposta;

    NoArvore caminhoVerdadeiro;

    NoArvore caminhoFalso;

    public NoArvore () {
        dicas = null;

        perguntaResposta = null;

        caminhoFalso = null;

        caminhoVerdadeiro = null;
    }

    public NoArvore(String pergunta) {
        dicas = null;

        this.perguntaResposta = pergunta;

        caminhoFalso = null;

        caminhoVerdadeiro = null;
    }

    public NoArvore(String resposta, String primeiraDica, String segundaDica, String terceiraDica) {
        this.dicas = new String[] {
            primeiraDica,
                segundaDica,
                    terceiraDica
        };

        this.perguntaResposta = resposta.trim().toUpperCase();

        this.caminhoVerdadeiro = null;

        this.caminhoFalso = null;
    }

}
