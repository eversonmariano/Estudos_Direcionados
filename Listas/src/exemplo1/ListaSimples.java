package exemplo1;

/*CRIE UM PROGRAMA QUE ARMAZENE NOMES, DIGITADOS PELO USUARIOS, EM UMA LISTA.
AO FINAL O PROGRAMA DEVE EXIBIR TODOS OS NOMES EM ORDEM ALFABETICA.
 */


import java.util.*;


public class ListaSimples {

    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        List<String> nomes = new ArrayList<String>();

        int sairLaco = 0;
        do {
            System.out.println("Digite um nome: ");
            nomes.add(leitorTeclado.next());
            System.out.println("Digite 1 para sair: ");
            sairLaco = leitorTeclado.nextInt();
        } while (sairLaco != 1);

        Collections.sort(nomes);

        for (String nomeAtual : nomes){
            System.out.println(nomeAtual);
        }
    }
}
