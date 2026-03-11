package Fabrica;

import Interfaces.Frete;
import Interfaces.NotaFiscal;
import Interfaces.Pagamento;
import Nacional.FreteNacional;
import Nacional.NotaFiscalNacional;
import Nacional.PagamentoNacional;

public class FornecedorNacionalFactory implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoNacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteNacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalNacional();
    }
}
