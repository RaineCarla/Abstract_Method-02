package Fabrica;

import Interfaces.Frete;
import Interfaces.NotaFiscal;
import Interfaces.Pagamento;

public interface FornecedorFactory {

    Pagamento criarPagamento();
    Frete criarFrete();
    NotaFiscal criarNotaFiscal();

}
