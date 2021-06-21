import java.io.IOException;
import java.util.Scanner;

/**
 * @author João Pedro de Moura Medeiros 
 * @version 14/06/2021
 * 
 * A classe {@code M extends Auxiliarain} apresenta o jogo chamado MasterMind
 * que atende mensagens de orientação ao usuário, e que
 * verifica as entradas informadas pelo usuário.
 */

public class MainApp
{
    /**
     * @param telaInicial() não recebe nada
     * 
     * Mostra a tela de bem vindo e as orientações ao usuário
     */
    public static void telaInicial()
    {
        System.out.println("==========================================================================");
        System.out.println("                       BEM VINDO AO JOGO MASTERMIND!                      ");
        System.out.println("                                                                          ");
        System.out.println("      INDIQUE UMA PADRÃO DE CORES PARA GANHAR E DESCOBRIR A SENHA!!!      ");                           
        System.out.println("                                                                          ");
        System.out.println("           *OS PINOS PRETOS INDICAM QUE AS CORES ESTÃO CERTAS*            ");
        System.out.println("          *OS PINOS BRANCOS INDICAM QUE AS CORES ESTÃO ERRADAS*           "); 
        System.out.println("                                                                          ");
        System.out.println(" INDIQUE 4 CORES SENDO || 0-VERMELHO || 1-AZUL || 2-VERDE || 3-AMARELO || ");
        System.out.println("==========================================================================");
    }
    /**
     * @param String[] args não recebe nada
     * 
     * O programa cria um padrão de senha no qual cabe ao usuário descobrir,
     * pedindo para digitar 4 cores(int cor1, int cor2, int cor3, int cor4) 
     * em indeterminada ordem, e dando dicas das cores certas ou erradas
     * (String corStatus1, String corStatus2, String corStatus3)
     */
    public static void main(String[] args) throws IOException
    {
        //Teclado
        Scanner teclado = new Scanner(System.in); 
        
        //Tela inicial
        telaInicial();
        
        int senha[] = Auxiliar.senhas();
        
        //Jogo
        for(int t = 0; t < 10; t++)
        {
            int cor1 = teclado.nextInt();
            while(cor1 < 0 || cor1 > 3)
            {
                System.out.print("\tValor inválido. Digite novamente: ");
                cor1 = teclado.nextInt();
            }
            int cor2 = teclado.nextInt();
            while(cor2 < 0 || cor2 > 3)
            {
                System.out.print("\tValor inválido. Digite novamente: ");
                cor2 = teclado.nextInt();
            }
            int cor3 = teclado.nextInt();
            while(cor3 < 0 || cor3 > 3)
            {
                System.out.print("\tValor inválido. Digite novamente: ");
                cor3 = teclado.nextInt();
            }
            int cor4 = teclado.nextInt();
            while(cor4 < 0 || cor4 > 3)
            {
                System.out.print("\tValor inválido. Digite novamente: ");
                cor4 = teclado.nextInt();
            }
            
            //Armazena o numero das cores digitadas pelo usuário
            int cor[] = {cor1, cor2, cor3, cor4};
            
            //Var. sobre os pinos pretos e brancos
            String corStatus1;
            String corStatus2;
            String corStatus3;
            String corStatus4;
            
            //Identifica se a cor esta certa ou não PINO PRETO = COR CERTA || PINO BRANCO = COR ERRADA
            if (senha[0] == cor[0]) 
            {
               corStatus1 = "PINO PRETO";   
            }
            else
            {
               corStatus1 = "PINO BRANCO";
            }
            if (senha[1] == cor[1]) 
            {
               corStatus2 = "PINO PRETO";
            }
            else
            {
               corStatus2 = "PINO BRANCO";
            }
            if (senha[2] == cor[2])
            {
                corStatus3 = "PINO PRETO";
            }
            else
            {
                corStatus3 = "PINO BRANCO";
            }
            if (senha[3] == cor[3])
            {
                corStatus4 = "PINO PRETO";
            }
            else
            {
                corStatus4 = "PINO BRANCO";
            }
            
            System.out.printf("\nCOR 1[%S] \nCOR 2[%S] \nCOR 3[%S] \nCOR 4[%S]",corStatus1, corStatus2, corStatus3, corStatus4);
            System.out.println("\n");
            
            if(corStatus1 == "PINO PRETO" && corStatus2 == "PINO PRETO" && corStatus3 == "PINO PRETO" && corStatus4 == "PINO PRETO")
            {
                System.out.println("\n VOCÊ GANHOU!!!");
                break;
            }
        }
    }  
}                


