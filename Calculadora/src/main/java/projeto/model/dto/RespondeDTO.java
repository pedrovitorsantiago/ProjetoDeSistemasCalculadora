package projeto.model.dto;

public class RespondeDTO {

    double resultado = 0;

    public RespondeDTO(double resultado){
        this.resultado = resultado;
    }

    public double getResultado(){
        return resultado;
    }

    public void setResultado(int resultado){
        this.resultado = resultado;
    }
}
