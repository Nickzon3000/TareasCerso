public abstract class Empleado implements Pagable, Evaluable {
    private int id;
    private String nombre;
    private TipoContrato tipoContrato;
    private Departamento departamento;

    public Empleado(int id, String nombre, TipoContrato tipoContrato, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.tipoContrato = tipoContrato;
        this.departamento = departamento;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public TipoContrato getTipoContrato() { return tipoContrato; }
    public void setTipoContrato(TipoContrato tipoContrato) { this.tipoContrato = tipoContrato; }

    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }

    public String getInfo() {
        return "ID: " + id + " | Nombre: " + nombre + " | Depto: " + departamento + " | Contrato: " + tipoContrato;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}