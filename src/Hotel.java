public class Hotel {

    static String nombreCliente = "Lucía";
    static boolean clienteRegistrado = true;
    static boolean clienteBloqueado = false;
    static int edad = 30;
    static boolean habitacionDisponible = true;
    static boolean pagoValido = true;
    static boolean premium = true;
    static boolean temporadaAlta = true;
    static boolean desayunoIncluido = true;
    static boolean parkingIncluido = false;
    static int noches = 4;

    public static void main(String[] args) {
        gestionarReserva();
    }

    static void gestionarReserva() {

        if (clienteRegistrado) {
            if (!clienteBloqueado) {
                if (edad >= 18) {
                    if (habitacionDisponible) {
                        if (pagoValido) {

                            double precioBase = 50 * noches;
                            double precioFinal = precioBase;

                            if (temporadaAlta) {
                                precioFinal = precioFinal + (precioBase * 0.20);
                            } else {
                                precioFinal = precioFinal + 0;
                            }

                            if (desayunoIncluido) {
                                precioFinal = precioFinal + (10 * noches);
                            } else {
                                precioFinal = precioFinal + 0;
                            }

                            if (parkingIncluido) {
                                precioFinal = precioFinal + (8 * noches);
                            } else {
                                precioFinal = precioFinal + 0;
                            }

                            if (premium) {
                                if (noches >= 5) {
                                    precioFinal = precioFinal - (precioFinal * 0.25);
                                } else {
                                    precioFinal = precioFinal - (precioFinal * 0.15);
                                }
                            } else {
                                if (noches >= 7) {
                                    precioFinal = precioFinal - (precioFinal * 0.10);
                                } else {
                                    precioFinal = precioFinal - 0;
                                }
                            }

                            if (precioFinal > 300) {
                                System.out.println("Reserva confirmada para " + nombreCliente);
                                System.out.println("Precio final: " + precioFinal + " €");
                                System.out.println("Reserva de importe alto.");
                            } else {
                                System.out.println("Reserva confirmada para " + nombreCliente);
                                System.out.println("Precio final: " + precioFinal + " €");
                                System.out.println("Reserva estándar.");
                            }

                        } else {
                            System.out.println("No se puede realizar la reserva: pago no válido.");
                        }
                    } else {
                        System.out.println("No se puede realizar la reserva: no hay habitaciones disponibles.");
                    }
                } else {
                    System.out.println("No se puede realizar la reserva: el cliente debe ser mayor de edad.");
                }
            } else {
                System.out.println("No se puede realizar la reserva: cliente bloqueado.");
            }
        } else {
            System.out.println("No se puede realizar la reserva: cliente no registrado.");
        }
    }
}