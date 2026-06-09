public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double valorHora;
    private double puntaje;

    public EmpleadoPorHoras(int id, String nombre, TipoContrato tipoContrato, Departamento departamento, 
                            int horasTrabajadas, double valorHora, double puntaje) {
        super(id, nombre, tipoContrato, departamento);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.puntaje = puntaje;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajadas * this.valorHora;
    }

    @Override
    public double evaluar() {
        return this.puntaje;
    }

    @Override
    public String getNivelDesempeno() {
        if (this.puntaje >= 80) return "Destacado";
        return "Cumple Expectativas";
    }

    @Override
    public void generarRecibo() {
        System.out.println("=== RECIBO DE SUELDO: POR HORAS ===");
        System.out.println(getInfo());
        System.out.println("Horas Trabajadas: " + horasTrabajadas + " hrs");
        System.out.println("Valor de la Hora: $" + valorHora);
        System.out.println("Total a Liquidar: $" + calcularSueldo());
        System.out.println("====================================\n");
    }

    public int getHorasTrabajadas() { return horasTrabajadas; }
    public void setHorasTrabajadas(int horasTrabajadas) { this.horasTrabajadas = horasTrabajadas; }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    public double getPuntaje() { return puntaje; }
    public void setPuntaje(double puntaje) { this.puntaje = puntaje; }
}