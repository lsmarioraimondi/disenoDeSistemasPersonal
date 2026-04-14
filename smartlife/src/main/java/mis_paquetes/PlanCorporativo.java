package mis_paquetes;

import java.util.ArrayList;
import java.util.List;

public class PlanCorporativo extends Plan{
    private double tarifaBase;
    private double descuento;

    public PlanCorporativo(double tarifaBase, double descuento) {
        this.tarifaBase = tarifaBase;
        this.descuento = descuento;
    }

    @Override
    public double calcularMonto(Cliente cliente){
        return tarifaBase * ((100 - descuento) * 0.01);
    }
}