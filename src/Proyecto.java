import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Desarrollador> desarrolladores;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        desarrolladores = new ArrayList<>();
    }

    public void agregarDesarrollador(Desarrollador desarrollador) {
        desarrolladores.add(desarrollador);
    }

    public Desarrollador buscarDesarrollador(String identificacion) {
        for (Desarrollador desarrollador : desarrolladores) {
            if (desarrollador.getIdentificacion().equals(identificacion)) {
                return desarrollador;
            }
        }

        return null;
    }

    public boolean eliminarDesarrollador(String identificacion) {
        Desarrollador encontrado = buscarDesarrollador(identificacion);

        if (encontrado == null) {
            return false;
        }

        return desarrolladores.remove(encontrado);
    }

    public double calcularTotalHoras() {
        double total = 0;

        for (Desarrollador desarrollador : desarrolladores) {
            total += desarrollador.getHorasAsignadas();
        }

        return total;
    }

    public String mostrarEquipo() {
        String equipo = "Proyecto: " + nombre + "\n";

        for (Desarrollador desarrollador : desarrolladores) {
            equipo += desarrollador.mostrarInformacion() + "\n";
        }

        return equipo;
    }
}
