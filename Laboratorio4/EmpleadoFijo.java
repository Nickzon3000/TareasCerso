public class EmpleadoFijo extends Empleado {
    private double sueldoBase;
    private int MovingAntiguedad;
    private double puntaje;

    public EmpleadoFijo(int id, String nombre, TipoContrato tipoContrato, Departamento departamento, 
                        double sueldoBase, int antiguedad, double puntaje) {
        super(id, nombre, tipoContrato, departamento);
        this.sueldoBase = sueldoBase;
        this.MovingAntiguedad = antiguedad;
        this.puntaje = puntaje;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoBase + (this.MovingAntiguedad * 50.0);
    }

    @Override
    public double evaluar() {
        return this.puntaje;
    }

    @Override
    public String getNivelDesempeno() {
        if (this.puntaje >= 85) return "Excelente";
        if (this.puntaje >= 70) return "Bueno";
        return "Regular";
    }

    @Override
    public void generarRecibo() {
        System.out.println("=== RECIBO DE SUELDO: EMPLEADO FIJO ===");
        System.out.println(getInfo());
        System.out.println("Sueldo Base: $" + sueldoBase);
        System.out.println("Antigüedad: " + MovingAntiguedad + " años");
        System.out.println("Total a Liquidar: $" + calcularSueldo());
        System.out.println("=======================================\n");
    }

    public double getSueldoBase() { return sueldoBase; }
    public void setSueldoBase(double sueldoBase) { this.sueldoBase = sueldoBase; }

    public int getAntiguedad() { return MovingAntiguedad; }
    public void setAntiguedad(int antiguedad) { this.MovingAntiguedad = antiguedad; }

    public double getPuntaje() { return puntaje; }
    public void setPuntaje(double puntaje) { this.puntaje = puntaje; }
}