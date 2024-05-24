import java.util.LinkedList;
import java.util.List;

public class Oficina {
    
    private String codigoOficina;
    private String ciudad;
    private String pais;
    private String region;
    private String CP;
    private String telefono;
    private String lineaDir1;
    private String lineaDir2;
    private List<Empleado> listaEmpleados;

    public Oficina(String codigoOficina, String ciudad, String pais, String region, String CP, String telefono, String lineaDir1, String lineaDir2) {
        this.codigoOficina = codigoOficina;
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        this.CP = CP;
        this.telefono = telefono;
        this.lineaDir1 = lineaDir1;
        this.lineaDir2 = lineaDir2;
        this.listaEmpleados=new LinkedList();
    }

    public Oficina() {
    }

    public String getCodigoOficina() {
        return codigoOficina;
    }

    public void setCodigoOficina(String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLineaDir1() {
        return lineaDir1;
    }

    public void setLineaDir1(String lineaDir1) {
        this.lineaDir1 = lineaDir1;
    }

    public String getLineaDir2() {
        return lineaDir2;
    }

    public void setLineaDir2(String lineaDir2) {
        this.lineaDir2 = lineaDir2;
    }
    
    public List<Empleado> getListaEmpleados() {
        return  listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaempleados) {
        this.listaEmpleados=listaempleados;
    }

    
    
    
    
    
    
    
    

    
}
