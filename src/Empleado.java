
public class Empleado {

    private int codigoEmp;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String extensión;
    private String email;
    private String codigoOficina;
    private int codigoJefe;
    private String puesto;
    private static int cont=32;
    

    public Empleado(int codigoEmp, String nombre, String apellido1, String apellido2, String extensión, String email, String codigoOficina, int codigoJefe, String puesto) {
        this.codigoEmp = cont++;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.extensión = extensión;
        this.email = email;
        this.codigoOficina = codigoOficina; //clave ajena de oficina con la que se vincula el empleado.
        this.codigoJefe = codigoJefe;
        this.puesto = puesto;
    }

    public Empleado() {
    }

    public int getCodigoEmp() {        
        return codigoEmp;
    }

    public void setCodigoEmp(int codigoEmp) {
        this.codigoEmp = codigoEmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getExtensión() {
        return extensión;
    }

    public void setExtensión(String extensión) {
        this.extensión = extensión;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodigoOficina() {
        return codigoOficina;
    }

    public void setCodigoOficina(String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    public int getCodigoJefe() {
        return codigoJefe;
    }

    public void setCodigoJefe(int codigoJefe) {
        this.codigoJefe = codigoJefe;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    

}
