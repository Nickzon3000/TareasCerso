public class Main {
    public static void main(String[] args) {
        Empresa miEmpresa = new Empresa("Tech Solutions");

        Empleado emp1 = new EmpleadoFijo(101, "Carlos Gómez", TipoContrato.FULLTIME, Departamento.SISTEMAS, 3000.0, 5, 90.0);
        Empleado emp2 = new EmpleadoPorHoras(102, "Ana Martínez", TipoContrato.PARTTIME, Departamento.VENTAS, 80, 25.0, 75.0);
        Empleado emp3 = new EmpleadoFijo(103, "Luis López", TipoContrato.FULLTIME, Departamento.SISTEMAS, 3500.0, 2, 65.0);

        System.out.println("--- Cargando Personal ---");
        miEmpresa.agregarEmpleado(emp1);
        miEmpresa.agregarEmpleado(emp2);
        miEmpresa.agregarEmpleado(emp3);

        miEmpresa.listarEmpleados();

        miEmpresa.calcularNomina();

        miEmpresa.reportePorDepto(Departamento.SISTEMAS);
        miEmpresa.reportePorDepto(Departamento.FINANZAS);

        System.out.println("\n--- Generación Manual de Recibos ---");
        emp1.generarRecibo();
        emp2.generarRecibo();
    }
}