/**
 * Escreva a descrição da classe AuxiliarJogo aqui.
 * 
 * @author João Pedro de Moura Medeiros
 * @version 14/06/2021
 */
class Auxiliar
{
    /** Cria números aletórios de 0 a 3
     * 
     * @param senha1 o primeiro número
     * @param senha2 o segundo número
     * @param senha3 o terceiro número
     * @param senha4 o quarto número
     * 
     * @return valores
     */ 
    public static int[] senhas()
    {   
        int senha1;
        int senha2;
        int senha3;
        int senha4;
        
        //Criação da Senha
        senha1 = (int)(Math.random() * 4);
        senha2 = (int)(Math.random() * 4);
        while(senha1 == senha2)
        {
            senha2 = (int)(Math.random() * 4);
        }
        senha3 = (int)(Math.random() * 4);
        while(senha3 == senha2 || senha3 == senha1)
        {
            senha3 = (int)(Math.random() * 4);
        }
        senha4 = (int)(Math.random() * 4);
        while(senha4 == senha1 || senha4 == senha2 || senha4 == senha3)
        {
            senha3 = (int)(Math.random() * 4);
        }
        
        int valores[] = new int[4];
        
        valores[0] = senha1;
        valores[1] = senha2;
        valores[2] = senha3;
        valores[3] = senha4;
        
        return valores;
    }
}