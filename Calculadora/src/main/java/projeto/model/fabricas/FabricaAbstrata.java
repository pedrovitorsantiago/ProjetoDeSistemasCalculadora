package projeto.model.fabricas;

import projeto.model.exceptions.OperacaoInvalidaExcecao;

import java.lang.reflect.InvocationTargetException;

public class FabricaAbstrata<T>{

    protected String pacoteBase = "projeto.model.";

    public T criar(String opcao) throws OperacaoInvalidaExcecao {
        try{

            String pacoteBase = this.pacoteBase + opcao;

            Class<?> classeOperacao = Class.forName(pacoteBase);
            T t = (T) classeOperacao.getDeclaredConstructor().newInstance();
            return t;
        }

        catch(ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException |
               InvocationTargetException e){
            throw new OperacaoInvalidaExcecao("Erro ao criar operação:" + e.getMessage());

        }

    }

}
