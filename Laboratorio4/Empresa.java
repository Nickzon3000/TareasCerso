import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        if (empleado != null) {
            empleados.add(empleado);
            System.out.println("Empleado '" + empleado.getNombre() + "' agregado con éxito.");
        }
    }

    public void listarEmpleados() {
        System.out.println("\n--- LISTADO DE EMPLEADOS DE " + nombre.toUpperCase() + " ---");
        for (Empleado e : empleados) {
            System.out.println(e.toString());
        }
    }

    public void calcularNomina() {
        double totalNomina = 0;
        for (Empleado e : empleados) {
            totalNomina += e.calcularSueldo();
        }
        System.out.println("\n[NÓMINA TOTAL] El gasto total en salarios de la empresa es: $" + totalNomina);
    }

    public void reportePorDepto(Departamento depto) {
        System.out.println("\n--- REPORTE DEL DEPARTAMENTO: " + depto + " ---");
        boolean flag = false;
        for (Empleado e : empleados) {
            if (e.getDepartamento() == depto) {
                System.out.println(e.getInfo() + " | Sueldo: $" + e.calcularSueldo() + " | Desempeño: " + e.getNivelDesempeno());
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("No hay empleados asignados a este departamento.");
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Empleado> getEmpleados() { return empleados; }
}