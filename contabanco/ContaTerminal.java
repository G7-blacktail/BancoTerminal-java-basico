package contabanco;

import java.util.Scanner;

public class  ContaTerminal {


    public static void main(String[] args){

        int numero = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        Scanner cliente = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        String agenciaUsuario = cliente.next();
        System.out.println("Por favor, digite o número da conta !");
        int contaUsuario = cliente.nextInt();
            if(agenciaUsuario.equals(agencia) && contaUsuario == numero) System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta  " + numero + " e seu saldo R$" + saldo + " e já está disponível para saque.");
            else System.out.println("Você ainda não é cliente deste banco, abra uma conta agora e aproveite para investir em nosso CDB");

    

        cliente.close();
    }
}