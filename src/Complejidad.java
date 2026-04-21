public class Complejidad {

    static boolean clienteRegistrado = true;
    static boolean premium = false;
    static int comprasAnteriores = 6;
    static double importeCompra = 80;
    static boolean rebajas = true;
    static boolean cuponValido = false;

    public static void main(String[] args) {
        boolean descuento = aplicarDescuentoMejorada();
        System.out.println("¿Se aplica descuento? " + descuento);
    }
    static boolean aplicarDescuentoMejorada() {

        //  Regla 1: cliente premium
        if (esClientePremiumConBeneficio()) {
            return true;
        }

        //  Regla 2: cliente habitual
        if (esClienteHabitualConBeneficio()) {
            return true;
        }

        //  Regla 3: cliente no registrado con cupón especial
        if (esInvitadoConCuponEspecial()) {
            return true;
        }

        return false;
    }

    static boolean esClientePremiumConBeneficio() {
        if (!clienteRegistrado) return false;
        if (!premium) return false;

        return importeCompra > 50 || rebajas || cuponValido;
    }

    static boolean esClienteHabitualConBeneficio() {
        if (!clienteRegistrado) return false;
        if (premium) return false;
        if (comprasAnteriores <= 5) return false;

        return importeCompra > 100 || rebajas;
    }

    static boolean esInvitadoConCuponEspecial() {
        if (clienteRegistrado) return false;
        if (!cuponValido) return false;

        return importeCompra > 200;
    }



    static boolean aplicarDescuento() {

        if (clienteRegistrado) {
            if (premium) {
                if (importeCompra > 50) {
                    return true;
                } else {
                    if (rebajas) {
                        return true;
                    } else {
                        if (cuponValido) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            } else {
                if (comprasAnteriores > 5) {
                    if (importeCompra > 100) {
                        return true;
                    } else {
                        if (rebajas) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                } else {
                    if (cuponValido) {
                        if (importeCompra > 30) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        } else {
            if (cuponValido) {
                if (importeCompra > 200) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}