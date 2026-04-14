package mis_paquetes;

public class PlanHogar extends Plan {
    private double tarifaBase;

    public PlanHogar(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularMonto(Cliente cliente){
        return tarifaBase;
    }
}