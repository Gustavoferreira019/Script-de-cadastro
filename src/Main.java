import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Clients c001 = new Clients(); //Criando objeto
        System.out.println("--------REGISTRE-SE------"); // Tela padrão de Registro
        System.out.println("Insira seu nome:"); // Inserir nome
        Scanner scan = new Scanner(System.in); // Scanneando a informaçao da entrada
        c001.nome= scan.next(); //Definindo que o nome será referente a entrada
        System.out.println("Digite sua idade:");
        c001.idade= scan.next();

        System.out.println("Sua idade é " + c001.nome+ " e você tem " + c001.idade + " anos?\n Sim ------- Não");
        String confirmacao = scan.next().toLowerCase();
        String confirmacao1 = "sim";


        if(confirmacao.equals(confirmacao1))
            c001.criandoConta();
        else
            System.out.println("Operação finalizada.");

    }
}

