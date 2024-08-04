import java.util.Scanner;
public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);

    System.out.println("Por favor, digite o numero da conta: ");
    int conta = scan.nextInt();


    System.out.println("Por favor, digite o numero da agencia: ");
    String agencia = scan.next();


    System.out.println("Por favor, digite o seu nome: ");
    String nome = scan.next();


    System.out.println("Digite o valor do saldo da sua conta: ");
    double saldo = scan.nextDouble();



    System.out.println(String.format("Ola %s obrigado por criar uma conta em nosso banco, sua agencia é: %s, conta: %d e seu saldo %f já está disponível para o saque", nome, agencia, conta, saldo));

  }
}
