import java.util.Scanner;

public class Joguinho {

    public void iniciaJogo(NoArvore noRecebido, String msgInicial) {
        Scanner sc = new Scanner(System.in);

        NoArvore noArvoreAtual;

        System.out.printf("""
                Que começem os jogos!
                
                %s
                
                """, msgInicial);

        if (sc.nextLine().trim().equalsIgnoreCase("s")) {
            noArvoreAtual = noRecebido.caminhoVerdadeiro;
        } else {
            noArvoreAtual = noRecebido.caminhoFalso;
        }

        int chancesDeAcerto = 3;

        for (int i = 0; i < 3; i++) {
            String resposta = "";

            System.out.printf("""
                    
                    ------------------
                    Você tem %d vidas.
                   --------------------
                    
                    Vamos a dica %d:
                    
                    %s 
                    
                    Digite a sua resposta: 
                    
                    """,
                    chancesDeAcerto,

                    i+1,

                    noArvoreAtual.dicas[i]
            );

            resposta = sc.nextLine().trim().toUpperCase();


            if (resposta.equalsIgnoreCase(noArvoreAtual.perguntaResposta)) {

                System.out.printf("""
                        Tú é o bixão mesmo, hein?! ::)
                        
                        Meus parabéns! Você venceu o jogo da Árvore. Professor, manda uns pontinhos para fera! ^^/
                        
                        """);

                break;
            }

            else {
                chancesDeAcerto --;

                if (chancesDeAcerto > 0) {
                    System.out.println("\nOps! Não é essa a respota! Vamos tentar novamente.\n\n");
                }

                else {
                    System.out.printf("""
                            
                            Não! Era melhor ter ido ver o filme do Pelé! ::(
                            
                            Você não venceu o jogo, sinto muito.
                            
                            A resposta correta era: %s
                            """, noArvoreAtual.perguntaResposta);
                }

            }

        }

    }

}
