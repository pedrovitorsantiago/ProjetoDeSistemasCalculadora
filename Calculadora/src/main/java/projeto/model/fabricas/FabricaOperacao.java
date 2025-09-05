package projeto.model.fabricas;

import projeto.model.operacoes.IOperacao;

public class FabricaOperacao extends FabricaAbstrata<IOperacao> {

    public FabricaOperacao(){
        super.pacoteBase = super.pacoteBase+"operacoes.";
    }

}
