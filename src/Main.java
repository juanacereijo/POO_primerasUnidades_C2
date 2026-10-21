
public static void main(String[] args) {

        // Instancio dos libros
        //Libro en sector sin decuento
        Libro libro1 = new Libro("L001", "El Aleph", "Jorge Luis Borges", 'a', 5, 1200.0, 2500.0);
        // Libro en sector c con descuento especial
        Libro libro2 = new Libro("L002", "Cien años de soledad", "Gabriel García Márquez", 'C', 3, 1500.0, 3000.0);

        //Muestro los datos de los libros registrados.
        libro1.mostrarDatos();
        libro2.mostrarDatos();



        // Pruebo los métodos

        System.out.println("¿Hay disponibilidad?: " + libro1.hayDisponibilidad());
        System.out.println("Precio de venta de lista: $" + libro1.getPrecioVenta());
        System.out.println("Precio Final al cobrar: $" + libro1.calcularPrecioFinalVenta());


        System.out.println("¿Hay disponibilidad?: " + libro2.hayDisponibilidad());
        System.out.println("Precio de venta de lista: $" + libro2.getPrecioVenta());
        System.out.println("Precio Final al cobrar: $" + libro2.calcularPrecioFinalVenta());

        //Modificar el stock por movimiento
        //Realizar una venta exitosa
        libro1.modificarStock(2, true);
        System.out.println("Stock actual: " + libro1.getStockDisponible());
        // Intentar sobrepasar el stock en una venta
        libro2.modificarStock(5, true);
        // Reposición y actualización completa
        System.out.print(" ");
        libro2.modificarStock(10, false);
        libro2.actualizarStockCompleto(20);

        System.out.print(" ");
        //Costo Total de las unidades actualies
        System.out.println("El costo total del stock actual del libro "  + libro1.getTitulo() + "es de $" + libro1.calcularCostoTotal());

        System.out.print(" ");

        // Consultar precio aclarando el descuento por pertenecer al sector 'c'
        System.out.println("Precio de venta de lista: $" + libro2.getPrecioVenta());
        System.out.println("Precio Final aplicando descuento de sector: $" + libro2.calcularPrecioFinalVenta());
        System.out.println("Precio de venta de lista: $" + libro1.getPrecioVenta());
        System.out.println("Precio Final $" + libro1.calcularPrecioFinalVenta());


    }
