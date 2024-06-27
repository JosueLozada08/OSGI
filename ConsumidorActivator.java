package com.ejemplo.consumidor;

import com.ejemplo.mensaje.ServicioMensaje;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class ConsumidorActivator implements BundleActivator {
    private ServiceReference<ServicioMensaje> reference;

    public void start(BundleContext context) throws Exception {
        reference = context.getServiceReference(ServicioMensaje.class);
        if (reference != null) {
            ServicioMensaje servicio = context.getService(reference);
            System.out.println(servicio.getMensaje());
        }
    }

    public void stop(BundleContext context) throws Exception {
        if (reference != null) {
            context.ungetService(reference);
        }
    }
}