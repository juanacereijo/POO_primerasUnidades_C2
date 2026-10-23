public class CuentaBilletera {
    //Atributos de la cuenta
    private String nombre;
    private String dni;
    private double saldo;
    private String numeroCuenta;

    //Variables y constantes estáticas de la entidad
    private static double limitePrestamoMax = 100000.0; // Modificable por la clase
    private static final double COMISION_RECEPCION = 0.05; // 5.0%
    private static final double MINIMO_TRANSFERENCIA = 1000.0;

    //Constructor
    public CuentaBilletera(String nombre, String dni, double saldoInicial, String numeroCuenta) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
    }
    //Propiedades
    public double getSaldo() {
        return this.saldo;
    }


    //Pedir préstamo express
    public void pedirPrestamoExpress(double monto) {
        if (monto <= 0) {
            System.out.println("El monto del préstamo debe ser mayor a cero.");
            return;
        }
        if (monto > limitePrestamoMax) {
            System.out.println("Error: El límite máximo de préstamo es de $" + limitePrestamoMax);
            return;
        }
        this.saldo += monto;
        System.out.println("Préstamo aprobado. Nuevo saldo: $" + this.saldo);
    }

    //Enviar transferencia a otra cuenta
    public void enviarTransferencia(CuentaBilletera destino, double monto) {
        if (destino == null) {
            System.out.println("Cuenta de destino no válida.");
            return;
        }
        if (monto < MINIMO_TRANSFERENCIA) {
            System.out.println("Error: El monto mínimo para transferir es de $" + MINIMO_TRANSFERENCIA);
            return;
        }
        if (monto > this.saldo) {
            System.out.println("Error: Saldo insuficiente para realizar la transferencia.");
            return;
        }

        this.saldo -= monto;
        destino.recibirTransferencia(monto);
        System.out.println("Transferencia enviada con éxito.");
    }

    //Recibir transferencia aplicando comisión del 5%
    public void recibirTransferencia(double monto) {
        double comision = monto * COMISION_RECEPCION;
        double montoNeto = monto - comision;
        this.saldo += montoNeto;
        System.out.println("Recibido: $" + montoNeto + " (Comisión aplicada: $" + comision + ").");
    }

    //Modificar el límite de préstamo (Solo puede acceder la clase)
    public static void setLimitePrestamoMax(double nuevoLimite) {
        if (nuevoLimite >= 0) {
            limitePrestamoMax = nuevoLimite;
            System.out.println("El nuevo limite máximo de préstamo es: $" + nuevoLimite);
        }
    }


}
