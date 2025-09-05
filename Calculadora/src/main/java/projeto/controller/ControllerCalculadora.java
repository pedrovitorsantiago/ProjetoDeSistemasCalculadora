package projeto.controller;

import projeto.model.calculadora.Calculadora;
import projeto.model.dto.PedeDTO;
import projeto.model.dto.RespondeDTO;
import projeto.model.exceptions.OperacaoInvalidaExcecao;
import projeto.model.fabricas.FabricaOperacao;
import projeto.model.operacoes.IOperacao;

import java.util.Objects;

public class ControllerCalculadora {

    public RespondeDTO calcular(PedeDTO dto){
        double resultado = 0;
        String opcao = dto.getOpcao();
        Calculadora calculadora = new Calculadora();

        FabricaOperacao fabrica = new FabricaOperacao();
        IOperacao operacao = null;
        if (dto.getOpcao().equals("1")){
            opcao = "Soma";
        }
        if (dto.getOpcao().equals("2")){
            opcao = "Subtracao";
        }
        if (dto.getOpcao().equals("3")){
            opcao = "Multiplicacao";
        }
        if (dto.getOpcao().equals("4")){
            opcao = "Divisao";
        }
        try {
            operacao =  fabrica.criar(opcao);
        } catch (OperacaoInvalidaExcecao e) {
            System.out.println(operacao);
            System.out.println("Erro: operação inválida.");
        }

        if(operacao != null){
            resultado = operacao.fazerOperacao(dto.getNum1(),dto.getNum2());

        }

        return new RespondeDTO(resultado);


    }
}
