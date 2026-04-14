package mis_paquetes;

public class PlanComercio extends Plan {
    private double tarifaBase;
    private double adicionalPorDispositivo;

    public PlanComercio(double tarifaBase, double adicionalPorDispositivo) {
        this.tarifaBase = tarifaBase;
        this.adicionalPorDispositivo = adicionalPorDispositivo;
    }

    @Override
    public double calcularMonto(Cliente cliente){
        return tarifaBase + (adicionalPorDispositivo * cliente.getCantidadDispositivos());
    }

}