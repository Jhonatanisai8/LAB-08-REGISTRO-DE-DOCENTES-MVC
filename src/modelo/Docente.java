package modelo;
public abstract class Docente {
    
    private String codigo;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private Long horasClase;

    public Docente() {
    }

    public Docente(String codigo, String nombres, String apellidos, String especialidad, Long horasClase) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.horasClase = horasClase;
    }

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}
    public String getNombres() {return nombres;}
    public void setNombres(String nombres) {this.nombres = nombres;}
    public String getApellidos() {return apellidos;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public String getEspecialidad() {return especialidad;}
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}
    public Long getHorasClase() {return horasClase;}
    public void setHorasClase(Long horasClase) {this.horasClase = horasClase;}

}
