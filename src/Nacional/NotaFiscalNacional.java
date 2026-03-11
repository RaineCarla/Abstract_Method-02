package Nacional;

import Interfaces.NotaFiscal;

public class NotaFiscalNacional implements NotaFiscal {
    @Override
    public String emitir(String idPedido, double valor) {
        return "NF-NAC-" +  idPedido ;
    }
}
