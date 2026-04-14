package mis_paquetes;

public class FacturaMensual {
    private Cliente unCliente;

    public FacturaMensual(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public double calcularMonto(){
        return unCliente.getPlanCliente().calcularMonto(unCliente);
    }
}