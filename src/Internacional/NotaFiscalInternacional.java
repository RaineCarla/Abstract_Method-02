package Internacional;

import Interfaces.NotaFiscal;

public class NotaFiscalInternacional implements NotaFiscal {
    @Override
    public String emitir(String idPedido, double valor) {

        return "NF-INT-" +  idPedido;

    }
}
