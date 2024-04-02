package net.editorial.publicaciones;

import net.editorial.Publicacion;

public class Novela extends Publicacion {
    public enum TematicaNovela {
        CIENCIA_FICCION,
        FANTASIA,
        SUSPENSE,
        ROMANCE,
        DRAMA,
        OTROS
    }

    protected String nombreAutor;
    protected TematicaNovela tematicaNovela;

    public Novela(String titulo, int numeroPaginas, String ISBN, double precioDistribucion,
            double precioVentaPublico, String fechaEdicion, String tipoImpuestos,
            TematicaNovela tematicaNovela, String nombreAutor) {
        super(titulo, numeroPaginas, ISBN, precioDistribucion, precioVentaPublico, fechaEdicion, tipoImpuestos);
        this.tematicaNovela = tematicaNovela;
        this.nombreAutor = nombreAutor;
    }

    public TematicaNovela getTematicaNovela() {
        return tematicaNovela;
    }

    public void setTematicaNovela(TematicaNovela tematicaNovela) {
        this.tematicaNovela = tematicaNovela;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        return "---------------------===< " + super.titulo + " >===-----------------------\n" +
                "* Tematica: " + this.tematicaNovela + "\n" +
                "* Autor: " + this.nombreAutor + "\n" +
                "* Numero de paginas: " + this.numeroPaginas + "\n" +
                "* Precio de distribucion: " + super.precioDistribucion + "\n" +
                "* Precio de venta al público " + super.precioVentaPublico;
    }
}