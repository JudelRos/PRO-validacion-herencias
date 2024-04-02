import java.util.Arrays;
import java.util.Scanner;
import net.editorial.Publicacion;
import net.editorial.calculadora.CalculadoraImpuestos;
import net.editorial.publicaciones.LibrosTexto;
import net.editorial.publicaciones.Novela;
import net.editorial.publicaciones.Novela.TematicaNovela;
import net.editorial.publicaciones.Revista;

public class App {
    static final Scanner SCANNER = new Scanner(System.in);
    static Publicacion[] listaPublicaciones = new Publicacion[10];

    public static void main(String[] args) throws Exception {
        String menuEditorial = """
                a) Añadir nueva revista.
                b) Añadir un nuevo libro de texto.
                c) Añadir una nueva novela.
                d) Mostrar el listado de todas las publicaciones.
                e) Selección de una publicación y cálculo de su precio en Canarias y Península.
                f) Salir del programa.
                """;
        do {
            System.out.println(menuEditorial);
            String eleccionUsuario = SCANNER.nextLine();
            switch (eleccionUsuario) {
                case "a":
                    anadirNuevaRevista();
                    break;
                case "b":
                    anadirNuevoLibroTexto();
                    break;
                case "c":
                    anadirNuevaNovela();
                    break;
                case "d":
                    listaPublicacionestoString();
                    break;
                case "e":
                    calculoImpuestosPublicacion();
                    break;
                case "f":
                    SCANNER.close();
                    return;
                default:
                    System.out.println("Introduce un valor válido.");
                    break;
            }
        } while (true);
    }

    public static void anadirNuevaRevista() {
        System.out.println("Dime el título de la revista que quieres añadir");
        String tituloRevista = SCANNER.nextLine();
        System.out.println("Dime el número de páginas de la revista");
        int numeroPaginasRevista = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Dime el ISBN de la revista");
        String revistaISBN = SCANNER.nextLine();
        System.out.println("Dime el precio de distribución de la revista (sin impuestos)");
        double precioDistribucionRevista = SCANNER.nextDouble();
        SCANNER.nextLine();
        System.out.println("Dime la fecha de edicion de la revista (dd/mm/yyyy)");
        String fechaEdicionRevista = SCANNER.nextLine();
        System.out.println("Dime el tipo de impuestos que va a tener esta revista (IGIC/IVA)");
        String tipoImpuestosRevista = SCANNER.nextLine();
        System.out.println("Dime el numero de revista");
        int nuevoNumeroRevista = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Dime los nombres de los artículos de la revista (separados por comas)");
        String nombresArticulosRevista = SCANNER.nextLine();
        String[] arrayNombresArticulos = nombresArticulosRevista.split(",");
        Revista nuevaRevista = new Revista(tituloRevista, numeroPaginasRevista, revistaISBN, precioDistribucionRevista,
                precioDistribucionRevista, fechaEdicionRevista, tipoImpuestosRevista, nuevoNumeroRevista,
                arrayNombresArticulos);

        for (int i = 0; i < listaPublicaciones.length; i++) {
            if (listaPublicaciones[i] == null) {
                listaPublicaciones[i] = nuevaRevista;
                break;
            }
        }
    }

    public static void anadirNuevoLibroTexto() {
        System.out.println("Dime el título del libro de texto que quieres añadir");
        String tituloLibroTexto = SCANNER.nextLine();
        System.out.println("Dime el número de páginas del libro de texto");
        int numeroPaginasLibroTexto = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Dime el ISBN del libro de texto");
        String libroTextoISBN = SCANNER.nextLine();
        System.out.println("Dime el precio de distribución del libro de texto (sin impuestos)");
        double precioDistribucionLibroTexto = SCANNER.nextDouble();
        SCANNER.nextLine();
        System.out.println("Dime la fecha de edicion del libro de textp (dd/mm/yyyy)");
        String fechaEdicionLibroTexto = SCANNER.nextLine();
        System.out.println("Dime el tipo de impuestos que va a tener este libro de texto (IGIC/IVA)");
        String tipoImpuestosLibroTexto = SCANNER.nextLine();
        System.out.println("Dime la asignatura sobre la que trata este libro de texto");
        String asignaturaLibroTexto = SCANNER.nextLine();
        System.out.println("Dime los temas sobre los que tratará este libro de texto (separados por comas)");
        String nombresTemasLibrosTextos = SCANNER.nextLine();
        String[] arrayNombresTemas = nombresTemasLibrosTextos.split(",");

        LibrosTexto nuevoLibroTexto = new LibrosTexto(tituloLibroTexto, numeroPaginasLibroTexto, libroTextoISBN,
                precioDistribucionLibroTexto, precioDistribucionLibroTexto, fechaEdicionLibroTexto,
                tipoImpuestosLibroTexto, asignaturaLibroTexto, arrayNombresTemas);

        for (int i = 0; i < listaPublicaciones.length; i++) {
            if (listaPublicaciones[i] == null) {
                listaPublicaciones[i] = nuevoLibroTexto;
                break;
            }
        }
    }

    public static void anadirNuevaNovela() {
        System.out.println("Dime el título del libro de la novela que quieres añadir");
        String tituloNovela = SCANNER.nextLine();
        System.out.println("Dime el número de páginas de la novela");
        int numeroPaginasNovela = SCANNER.nextInt();
        SCANNER.nextLine();
        System.out.println("Dime el ISBN de la novela");
        String novelaISBN = SCANNER.nextLine();
        System.out.println("Dime el precio de distribución de la novela (sin impuestos)");
        double precioDistribucionNovela = SCANNER.nextDouble();
        SCANNER.nextLine();
        System.out.println("Dime la fecha de edicion de la novela (dd/mm/yyyy)");
        String fechaEdicionNovela = SCANNER.nextLine();
        System.out.println("Dime el tipo de impuestos que va a tener este libro de texto (IGIC/IVA)");
        String tipoImpuestosNovela = SCANNER.nextLine();
        System.out.println("Dime la temática de la novela:");
        System.out.println("Opciones: " + Arrays.toString(TematicaNovela.values()));
        String tematicaInput = SCANNER.nextLine().toUpperCase();
        TematicaNovela tematicaNovela = TematicaNovela.valueOf(tematicaInput);
        System.out.println("Dime el nombre del autor de la novela");
        String autorNovela = SCANNER.nextLine();

        Novela nuevaNovela = new Novela(tituloNovela, numeroPaginasNovela, novelaISBN, precioDistribucionNovela,
                precioDistribucionNovela, fechaEdicionNovela, tipoImpuestosNovela, tematicaNovela, autorNovela);

        for (int i = 0; i < listaPublicaciones.length; i++) {
            if (listaPublicaciones[i] == null) {
                listaPublicaciones[i] = nuevaNovela;
                break;
            }
        }
    }

    public static void listaPublicacionestoString() {
        for (int i = 0; i < listaPublicaciones.length; i++) {
            if (listaPublicaciones[i] != null) {
                System.out.println(listaPublicaciones[i].toString());
            }
        }
    }

    public static void calculoImpuestosPublicacion() {
        System.out.println("Dime el nombre de la publicación sobre la que quieres calcular el impuesto.");
        String publicacionImpuestos = SCANNER.nextLine();

        for (int i = 0; i < listaPublicaciones.length; i++) {
            Publicacion publicacion = listaPublicaciones[i];

            if (publicacion != null && publicacion.getTitulo().equals(publicacionImpuestos)) {
                CalculadoraImpuestos calculadoraImpuestos = new CalculadoraImpuestos(publicacion);
                calculadoraImpuestos.calcularImpuestos();
                System.out.println("Recálculo de precios completado para la publicación: " + publicacion.getTitulo());
                return;
            }
        }
    }
}