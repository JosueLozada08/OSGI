package com.ejemplo.mensaje;

public interface ServicioMensaje {
    String getMensaje();
}

public class ServicioMensajeImpl implements ServicioMensaje {
    public String getMensaje() {
        return "Hola desde el Servicio de Mensaje!";
    }
}