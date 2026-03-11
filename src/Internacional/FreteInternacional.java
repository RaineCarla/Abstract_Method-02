package Internacional;

import Interfaces.Frete;

public class FreteInternacional implements Frete {
    @Override
    public double calcular_Frete(double pesoKg, String cep_Destino) {
        return 40.0 + (pesoKg * 5.0);
    }
}
