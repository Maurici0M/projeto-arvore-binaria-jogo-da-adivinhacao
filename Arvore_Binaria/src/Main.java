void main() {
    NoArvore noArvore = new NoArvore("Sou famoso por ter implementado uma métodologia única no mundo?");

    Joguinho joguinho = new Joguinho();

    /*preenchendo o no com dados para serem acertados, com base no construtor que montamos*/

    noArvore.caminhoVerdadeiro = new NoArvore(
            "Toyota",
            "Sou do Japão",
            "Tenho um bom histórico de qualidade",
            "Sou do setor automotivo"
    );

    noArvore.caminhoFalso = new NoArvore(
            "eneas",
            "Sou considerado por muitos como o melhor presidente que o Brasil nunca teve.",
            "Sempre fui à frente do meu tempo, e por isso, taxado de louco pela mídia e pessoas.",
            "Já faleci, porém, 'MEU NOME É...'"
    );

    /*Iniciando o jogo*/

    joguinho.iniciaJogo(
            noArvore,

            "Você deseja ir pelo caminho da resposta sobre o tema: MUNDO? \n\nResponda com s para SIM ou n para NÃO: "
    );

}
