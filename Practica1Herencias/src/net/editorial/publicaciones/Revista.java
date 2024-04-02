package net.editorial.publicaciones;

import net.editorial.Publicacion;

public class Revista extends Publicacion {
    protected int numeroRevista;
    protected String nombresArticulos[];

    public Revista(String titulo, int numeroPaginas, String ISBN, double precioDistribucion, double precioVentaPublico,
            String fechaEdicion, String tipoImpuestos, int numeroRevista, String nombresArticulos[]) {
        super(titulo, numeroPaginas, ISBN, precioDistribucion, precioVentaPublico, fechaEdicion, tipoImpuestos);
        this.numeroRevista = numeroRevista;
        this.nombresArticulos = nombresArticulos;
    }

    public int getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(int numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String[] getNombresArticulos() {
        return nombresArticulos;
    }

    public void setNombresArticulos(String[] nombresArticulos) {
        this.nombresArticulos = nombresArticulos;
    }

    @Override
    public String toString() {
        StringBuilder articulosString = new StringBuilder("Artículos: ");

        for (String nombreArticulo : nombresArticulos) {
            articulosString.append("< ").append(nombreArticulo).append(" > \n ");
        }

        return "---------------------===< " + super.titulo + " >===-----------------------\n" +
                "* Numero de revista: " + this.numeroRevista + "\n" +
                "* Lista de artículos: " + articulosString.toString() +
                "* Precio de distribucion: " + super.precioDistribucion + "\n" +
                "* Precio de venta al público " + super.precioVentaPublico;
    }
}
