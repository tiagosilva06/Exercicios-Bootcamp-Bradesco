import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //to-do > Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuario
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        System.out.println("BEM VINDO AO BANCO DIGITAL");
        System.out.println("---------------------------------");
        System.out.println("Crie sua conta de forma rápida e fácil:");
        System.out.println("");
        
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
            
            System.out.println("Digite seu nome:");
            String nome = entrada.nextLine();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = entrada.nextLine();

            System.out.println("Digite o número da sua agência: (xxx-x)");
            String agencia = entrada.nextLine();

            System.out.println("Digite o número da sua conta: (xxxx)");
            int conta = entrada.nextInt();

            System.out.println("Insira o valor que deseja depositar em sua conta:");
            double saldo = entrada.nextDouble();


            System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de " + saldo + " já está disponivel para saque.");


        entrada.close();

    }
}
