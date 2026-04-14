package mis_paquetes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Plan planCliente;
    private List<Dispositivo> dispositivos;

    public Cliente(Plan planCliente) {
        this.planCliente = planCliente;
        this.dispositivos = new ArrayList<>();
    }

    public List<Dispositivo> getDispositivos() {
        return dispositivos;
    }

    public Plan getPlanCliente() {
        return planCliente;
    }

    public int getCantidadDispositivos(){
        return this.dispositivos.size();
    }
}