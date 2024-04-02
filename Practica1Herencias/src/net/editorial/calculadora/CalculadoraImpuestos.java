package net.editorial.calculadora;

import net.editorial.Publicacion;

public class CalculadoraImpuestos {
    private Publicacion publicacion;

    public CalculadoraImpuestos(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public void calcularImpuestos() {
        String tipoImpuestos = publicacion.getTipoImpuestos();
        if ("IGIC".equalsIgnoreCase(tipoImpuestos)) {
            double impuesto = publicacion.getPrecioDistribucion() * 0.07;
            double impuestoEnPeninsula = publicacion.getPrecioDistribucion()
                    + (publicacion.getPrecioDistribucion() * 0.21);
            double nuevoPrecio = publicacion.getPrecioDistribucion() + impuesto;
            publicacion.setPrecioVentaPublico(nuevoPrecio);
            System.out.println("El precio de su venta en Canarias es de " + nuevoPrecio);
            System.out.println("Si el producto se vendiese en la peninsula su precio sería de " + impuestoEnPeninsula);

        } else if ("IVA".equalsIgnoreCase(tipoImpuestos)) {
            double impuesto = publicacion.getPrecioDistribucion() * 0.21;
            double impuestoEnCanarias = publicacion.getPrecioDistribucion()
                    + (publicacion.getPrecioDistribucion() * 0.07);
            double nuevoPrecio = publicacion.getPrecioDistribucion() + impuesto;
            publicacion.setPrecioVentaPublico(nuevoPrecio);
            System.out.println("El precio de su venta en Península es de " + nuevoPrecio);
            System.out.println("Si el producto se vendiese en Canarias su precio sería de " + impuestoEnCanarias);
        } else {
            System.out.println("Tipo de impuesto no valido");
        }
    }
}