package projeto.model.dto;

public class PedeDTO {

    String opcao = "";
    double num1 = 0;
    double num2 = 0;

    public PedeDTO(String opcao, double num1, double num2) {

        this.opcao = opcao;
        this.num1 = num1;
        this.num2 = num2;

    }

    public String getOpcao(){
        return opcao;
    }

    public void setOpcao(String dado){
        this.opcao = dado;
    }

    public double getNum1(){
        return num1;
    }

    public void setNum1(double valor){
        this.num1 = valor;
    }

    public double getNum2(){
        return num2;
    }

    public void setNum2(double valor){
        this.num2 = valor;
    }

}
