public class Anidamiento {

    static String nombre = "Ana";
    static boolean usuarioExiste = true;
    static boolean usuarioActivo = false;
    static boolean matriculado = false;
    static boolean pagoRealizado = true;

    static String curso = "Java Básico";
    static int plazasDisponibles = 3;

    public static void main(String[] args) {
        permitirAccesoSinAnidamiento();
    }

    static void permitirAccesoSinAnidamiento() {

        boolean valido = true;


        if(!usuarioExiste) {
            System.out.println("El usuario no existe");
            valido = false;
        }

        if(curso == null) {
            System.out.println("El curso no existe");
            valido = false;
        }

        if(!usuarioActivo) {
            System.out.println("El usuario no está activo");
            valido = false;
        }

        if(!matriculado) {
            System.out.println("El usuario no está matriculado");
            valido = false;
        }

        if(!pagoRealizado) {
            System.out.println("El pago no está realizado");
            valido = false;
        }

        if(plazasDisponibles == 0) {
            System.out.println("No hay plazas");
            valido = false;
        }



        if (valido) {
            System.out.println("Acceso concedido a " + nombre +
                    " para el curso " + curso);
        }







    }

    static void permitirAcceso() {

         if (usuarioExiste) {
            if (curso != null) {
                if (usuarioActivo) {
                    if (matriculado) {
                        if (pagoRealizado) {
                            if (plazasDisponibles > 0) {

                                System.out.println("Acceso concedido a " + nombre +
                                        " para el curso " + curso);

                            } else {
                                System.out.println("No hay plazas disponibles.");
                            }
                        } else {
                            System.out.println("El usuario no ha pagado.");
                        }
                    } else {
                        System.out.println("El usuario no está matriculado.");
                    }
                } else {
                    System.out.println("El usuario no está activo.");
                }
            } else {
                System.out.println("El curso no existe.");
            }
        } else {
            System.out.println("El usuario no existe.");
        }
    }
}