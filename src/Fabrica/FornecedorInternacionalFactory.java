package Fabrica;

import Interfaces.Frete;
import Interfaces.NotaFiscal;
import Interfaces.Pagamento;
import Internacional.FreteInternacional;
import Internacional.NotaFiscalInternacional;
import Internacional.PagamentoInternacional;

public class FornecedorInternacionalFactory implements FornecedorFactory{
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoInternacional();
    }

    @Override
    public Frete criarFrete() {
        return new FreteInternacional();
    }

    @Override
    public NotaFiscal criarNotaFiscal() {
        return new NotaFiscalInternacional();
    }
}
