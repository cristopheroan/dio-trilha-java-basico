import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    
    public static void main(String[] args) throws Exception{
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String resposta;
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldoDisponivel;
        
        System.out.println("Ola!");
        System.out.println("Sejá bem vindo ao nosso sistema interno de abertura de Conta Bancaria.");
        System.out.println(" ");
        
        do {
            
            System.out.println("Gostaria de criar uma conta ? (y/n): ");
            resposta = sc.nextLine().toLowerCase();
            System.out.println(" ");
            
            switch (resposta) {
              case "y":
                System.out.println("----------CONTA BANCÁRIA----------");
                System.out.println();
                System.out.println("Digite seu nome Completo: ");
                nomeCliente = sc.nextLine();
                System.out.println(" ");
                
                System.out.println("Por favor, digite o numero de sua conta corrente: ");
                numeroConta = sc.nextInt();
                sc.nextLine();
                System.out.println(" ");
                
                System.out.println("Agora digite sua Agêcia: ");
                agencia = sc.next();
                System.out.println(" ");
                
                System.out.println("Digite a quantia de Saldo Disponivel: ");
                saldoDisponivel = sc.nextFloat();
                sc.nextLine();
                System.out.println(" ");
                
                String menssagem = String.format("Olá %s, Conta criada com sucesso, Obrigado pela preferência e confiança em nosso Banco, sua agência é %s, conta %s e seu saldo de %s já esta disponivel para saque",nomeCliente,agencia,numeroConta,saldoDisponivel);
                
                    System.out.println(menssagem);
                break;
                default:
                break;
                
            }
        } while (!resposta.equals ("n"));
        
        System.out.println("Obrigado pela visita! Programa Encerrado.");
        sc.close();
    }
}
