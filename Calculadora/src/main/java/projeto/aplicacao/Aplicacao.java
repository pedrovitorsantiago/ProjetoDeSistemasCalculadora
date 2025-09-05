package projeto.aplicacao;

import projeto.controller.ControllerCalculadora;
import projeto.model.dto.PedeDTO;
import projeto.model.dto.RespondeDTO;
import projeto.view.Menu;

public class Aplicacao {
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.showMenu();


        PedeDTO dto = menu.pegaValores();
        ControllerCalculadora calculadora = new ControllerCalculadora();

        RespondeDTO resposta = null;
        resposta = calculadora.calcular(dto);
        menu.showResult(resposta);

    }



}
