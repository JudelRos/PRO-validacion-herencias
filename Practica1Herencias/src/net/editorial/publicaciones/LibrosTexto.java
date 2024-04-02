package net.editorial.publicaciones;

import net.editorial.Publicacion;

public class LibrosTexto extends Publicacion {
    protected String asignatura;
    protected String temas[];

    public LibrosTexto(String titulo, int numeroPaginas, String ISBN, double precioDistribucion,
            double precioVentaPublico, String fechaEdicion, String tipoImpuestos, String asignatura, String temas[]) {
        super(titulo, numeroPaginas, ISBN, precioDistribucion, precioVentaPublico, fechaEdicion, tipoImpuestos);
        this.asignatura = asignatura;
        this.temas = temas;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String[] getTemas() {
        return temas;
    }

    public void setTemas(String[] temas) {
        this.temas = temas;
    }

    @Override
    public String toString() {
        StringBuilder temasString = new StringBuilder("Temas: ");

        for (String tema : temas) {
            temasString.append("< ").append(tema).append(" > \n ");
        }

        return "---------------------===< " + super.titulo + " >===-----------------------\n" +
                "* Asignatura: " + this.asignatura + "\n" +
                "* Lista de temas: " + temasString.toString() +
                "* Precio de distribucion: " + super.precioDistribucion + "\n" +
                "* Precio de venta al público " + super.precioVentaPublico;
    }

}
