package projeto.model.calculadora;

import projeto.model.operacoes.IOperacao;

public class Calculadora {

    public double calculo(IOperacao operacao,double num1, double num2){

        return operacao.fazerOperacao(num1,num2);

    }

}
