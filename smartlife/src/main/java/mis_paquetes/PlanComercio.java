package mis_paquetes;

public class PlanComercio extends Plan {
    private double tarifaFinal;

    public PlanComercio(double tarifaBase, double adicionalPorDispositivo){
        this.tarifaFinal = tarifaBase + adicionalPorDispositivo;
    }

    @Override
    public double calcularMonto(Cliente cliente){
        return tarifaFinal;
    }
}
// hola