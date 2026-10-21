public class Libro {

    //Declaro los atributos de la clase

    private final String CODIGO; //No se modifica
    private String titulo;
    private String autor;
    private char sector;
    private int stockDisponible;
    private final double PRECIO_COSTO; //No se modifica
    private double precioVenta;


    //Constructor

    public Libro(String CODIGO, String titulo, String autor, char sector, int stockDisponible,
                 double PRECIO_COSTO, double precioVenta){
       this.CODIGO = CODIGO;
       this.titulo = titulo;
       this.autor = autor;
       this.sector = Character.toLowerCase(sector);
       this.stockDisponible = stockDisponible;
       this.PRECIO_COSTO = PRECIO_COSTO;
       this.precioVenta = precioVenta;
    }

    //Propiedades

    public String getCODIGO (){ return CODIGO;}
    public String getTitulo (){ return titulo;}
    public String getAutor (){ return autor;}
    public char getSector(){return this.sector;}
    public void setSector(String sector){
        if (sector != null && !sector.trim(). isEmpty()){
            this.sector = sector.toLowerCase().charAt(0); }}
    public int getStockDisponible(){ return stockDisponible;}
    public double getPRECIO_COSTO(){return PRECIO_COSTO;}
    public double getPrecioVenta(){
        if (sector == 'c'){
            System.out.print("Aviso: Este libro pertence al sector c. Cuanta con un 10% de descuento activo. ");
        }
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta){
        if(precioVenta <=0){
            System.out.println("Error. Precio invalido.");
            return;
        }
        this.precioVenta = precioVenta;
    }

    //Metodos

    //Consulta de disponibilidad

    public boolean hayDisponibilidad(){
        return this.stockDisponible > 0;
    }

    //Actulización de stock completo

    public void actualizarStockCompleto(int nuevoStock){
        if(nuevoStock < 0){
            System.out.println("Error. Cantidad ingresada inválida. ");
            return;
        }
        this.stockDisponible = nuevoStock;
        System.out.println("Stock actualizado correctamente.");
    }

    //Modificar stock por motivo de reposición (suma) o venta (resta).
    public void modificarStock(int cantidad, boolean esVenta){
        if (cantidad <=0){
            System.out.println("Error.Cantidad ingresada inválida. ");
            return;
        }
        if (esVenta){
            if(this.stockDisponible>=cantidad){
                this.stockDisponible -= cantidad;
                System.out.println("Venta realizada con éxito. Cantidad vendida: " + cantidad );
            }
            else{
                System.out.println("Error: Stock insuficiente. Cantidad disponible: " + this.stockDisponible);
            }
        }
        else {
            this.stockDisponible += cantidad;
            System.out.println("Reposicion exitosa. Unidades añanidas: " + cantidad);
            }
    }

    //Calcular el costo por el total de unidades.
    public double calcularCostoTotal(){
        return this.stockDisponible * this.PRECIO_COSTO;
    }
    //Calcular precio final
    public double calcularPrecioFinalVenta(){
        //Se aplica el descuento del 10% si es del sector c.
        if(sector== 'c'){
            return this.precioVenta * 0.90;
        }
        return this.precioVenta;
    }

    public void mostrarDatos() {

        System.out.println(" Datos del Libro: " + this.titulo);
        System.out.println("• Código: " + this.CODIGO);
        System.out.println("• Autor: " + this.autor);
        System.out.println("• Sector: '" + this.sector + "'");
        System.out.println("• Stock Disponible: " + this.stockDisponible + " unidades");
        System.out.println("• Precio de Costo: $" + this.PRECIO_COSTO);
        System.out.println("• Precio de Venta Lista: $" + this.getPrecioVenta()); // Usamos el getter por si avisa lo del sector 'c'
        System.out.println("*---------------------------------------------*");
    }

}

