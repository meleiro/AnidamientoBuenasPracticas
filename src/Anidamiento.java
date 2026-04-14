public class Anidamiento {

    static String nombre = "Ana";
    static boolean usuarioExiste = true;
    static boolean usuarioActivo = true;
    static boolean matriculado = true;
    static boolean pagoRealizado = true;

    static String curso = "Java Básico";
    static int plazasDisponibles = 3;

    public static void main(String[] args) {
        permitirAcceso();
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