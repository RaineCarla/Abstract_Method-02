package Nacional;

import Interfaces.Frete;

public class FreteNacional implements Frete {

    @Override
    public double calcular_Frete(double pesoKg, String cep_Destino) {
        return 15.0 + (pesoKg * 2.0);
    }
}
