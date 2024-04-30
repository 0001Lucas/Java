import java.util.Scanner;
public class ContaTerminal {
//Faz um cadastro de nova conta de usuário via terminal.
    public static void main(String[] args) throws Exception {
        
        System.out.println("Olá, seja bem vindo!");
        Scanner sc1 = new Scanner(System.in);

        String nome;
        String conta;
        String agencia;
        double saldo;

        System.out.println("Digite o numero de sua conta:");
        conta = sc1.nextLine();

        System.out.println("Agora, digite o numero da Agência:");
        agencia = sc1.nextLine();

        System.out.println("O seu nome completo:");
        nome = sc1.nextLine();

        System.out.println("Para finalizar o seu saldo:");
        saldo = sc1.nextDouble();

        System.out.println("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua Agência é: " +agencia+ ", Conta: " +conta+ " e seu Saldo de " +saldo+" R$ Ja está disponivel!");


    }
}

        