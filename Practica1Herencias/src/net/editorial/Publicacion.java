package net.editorial;

public class Publicacion {
    protected String titulo;
    protected int numeroPaginas;
    protected String ISBN;
    protected double precioDistribucion;
    protected double precioVentaPublico;
    protected String fechaEdicion;
    protected String tipoImpuestos;

    public Publicacion(String titulo, int numeroPaginas, String ISBN, double precioDistribucion,
            double precioVentaPublico, String fechaEdicion, String tipoImpuestos) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.ISBN = ISBN;
        this.precioDistribucion = precioDistribucion;
        this.precioVentaPublico = precioVentaPublico;
        this.fechaEdicion = fechaEdicion;
        this.tipoImpuestos = tipoImpuestos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTipoImpuestos() {
        return tipoImpuestos;
    }

    public void setTipoImpuestos(String tipoImpuestos) {
        this.tipoImpuestos = tipoImpuestos;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public double getPrecioDistribucion() {
        return precioDistribucion;
    }

    public void setPrecioDistribucion(double precioDistribucion) {
        this.precioDistribucion = precioDistribucion;
    }

    public double getPrecioVentaPublico() {
        return precioVentaPublico;
    }

    public void setPrecioVentaPublico(double precioVentaPublico) {
        this.precioVentaPublico = precioVentaPublico;
    }

    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

}