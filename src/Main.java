public static void main(String[] args) {


    // Instancio cuentas
    CuentaBilletera cuentaJuana = new CuentaBilletera("Juana Cereijo", "12345678", 5000.0, "CBU-001");
    CuentaBilletera cuentaVictorino = new CuentaBilletera("Victorino Pera", "87654321", 2000.0, "CBU-002");

    System.out.println("\n Saldos Iniciales ");
    System.out.println("Juana: $" + cuentaJuana.getSaldo());
    System.out.println("Victorino: $" + cuentaVictorino.getSaldo());


    // Pido un préstamo Express
    System.out.println("\n Solicitud de Préstamos ");
    // Caso 1:  Menor al límite
    cuentaJuana.pedirPrestamoExpress(30000.0);

    // Caso 2: Supera el límite estático máximo
    cuentaJuana.pedirPrestamoExpress(150000.0);


    //Realizo transferencias
    System.out.println("\n Envío de Transferencias ");
    // Caso 1:  Menor al mínimo permitido
    cuentaJuana.enviarTransferencia(cuentaVictorino, 500.0);

    // Caso 2: Saldo insuficiente
    cuentaVictorino.enviarTransferencia(cuentaJuana, 5000.0);

    // Cumple el mínimo y descuenta/aplica comisión del 5%

    cuentaJuana.enviarTransferencia(cuentaVictorino, 10000.0);


    // Modificar el límite de la Clase (Método Estático)
    System.out.println("\n Modificación del límite máximo de préstamo");
    CuentaBilletera.setLimitePrestamoMax(200000.0);


    // Volvemos a intentar el préstamo que antes falló
    System.out.println("Reintentando préstamo de $150.000 para Juana:");
    cuentaJuana.pedirPrestamoExpress(150000.0); // Ahora debería ser exitoso


    //Muesto los Saldos Finales
    System.out.println("\n---Saldos Finales ---");
    System.out.println("Saldo final de Juana: $" + cuentaJuana.getSaldo());
    System.out.println("Saldo final de Victorino: $" + cuentaVictorino.getSaldo());
}


