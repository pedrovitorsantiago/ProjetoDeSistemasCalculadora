package projeto.model.fabricas;

import projeto.model.exceptions.OperacaoInvalidaExcecao;

public interface IFabrica<T> {
    T criar(String opcao) throws OperacaoInvalidaExcecao;
}
