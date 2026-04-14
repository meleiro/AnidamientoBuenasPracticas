public class Mejorable {

    static boolean registrado = true;
    static boolean bloqueado = false;
    static int edad = 22;
    static boolean aceptaCondiciones = true;

    public static void main(String[] args) {
        comprobarAccesoPromocion();
    }

    static void comprobarAccesoPromocion() {

           if (registrado) {
            if (!bloqueado) {
                if (edad >= 18) {
                    if (aceptaCondiciones) {
                        System.out.println("Acceso permitido a la promoción.");
                    } else {
                        System.out.println("Debes aceptar las condiciones.");
                    }
                } else {
                    System.out.println("Debes ser mayor de edad.");
                }
            } else {
                System.out.println("Tu cuenta está bloqueada.");
            }
        } else {
            System.out.println("Debes estar registrado.");
        }
    }
}