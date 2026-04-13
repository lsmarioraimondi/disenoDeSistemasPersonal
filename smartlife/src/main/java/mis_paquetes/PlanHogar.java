package mis_paquetes;

public class PlanHogar extends Plan {
    private double tarifaFinal;

    public PlanHogar(double tarifaBase) {
        this.tarifaFinal = tarifaBase;
    }

    @Override
    public double calcularMonto(Cliente cliente) {
        return tarifaFinal;
    }
}// hola