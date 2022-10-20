
/**
 * Atividade Colaborativa (4.03)
 * 
 * @author Hermes Feitoza Barros 
 * @version 19/10/2022
 */

public class verificarVoto
{
    public static void main(String[] args){
        int idade = 19;
        if (idade < 16){
            System.out.println("Você não pode votar por ser menor que 16."); } 
        else if (idade > 65){
            System.out.println("Seu voto é facultativo. Caso queira, faça a biometria.");}
        else if (idade >= 18 && idade < 65){
            System.out.println("Seu voto é obrigatório!");}
        else if (idade == 16 || idade == 17 || idade >= 65){
            System.out.println("Você possuí idade para votar, mas ainda não é necessário.");}
    }
}
