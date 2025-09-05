package projeto.view;

import projeto.model.dto.PedeDTO;
import projeto.model.dto.RespondeDTO;

import java.util.Scanner;

public class Menu {


    public PedeDTO pegaValores (){

        Scanner input = new Scanner(System.in);
        String opcao = input.nextLine();
        System.out.println("Informe o primeiro valor:");
        double valor1 = input.nextDouble();
        System.out.println("Informe o segundo valor:");
        double valor2 = input.nextDouble();

        return new PedeDTO(opcao,valor1,valor2);
    }

    public void showMenu(){

        System.out.println("---->Olá Professor Querido!<----");
        System.out.println("Digite o número ou nome da operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Vá embora ...");

    }

    public void showResult (RespondeDTO dto){

        System.out.println("O Resultado é: "+dto.getResultado());
    }


}
