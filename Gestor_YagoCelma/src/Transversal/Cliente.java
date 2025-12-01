package Transversal;

public class Cliente {
    
    private int idCliente;
    private String nombre;
    private String razonComercial;
    private String nif;  
    private String correo;
    private String telefono;
    private String tipoPago;
    private String direccionFacturacion;
    private String direccionEnvio;

    /*public Cliente(String nombre, String razonComercial, String nif, String correo, String telefono, String tipoPago, String direccionFacturacion, String direccionEnvio) {
        this.nombre = nombre;
        this.razonComercial = razonComercial;
        this.nif = nif;
        this.correo = correo;
        this.telefono = telefono;
        this.tipoPago = tipoPago;
        this.direccionFacturacion = direccionFacturacion;
        this.direccionEnvio = direccionEnvio;
    }*/

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonComercial() {
        return razonComercial;
    }

    public void setRazonComercial(String razonComercial) {
        this.razonComercial = razonComercial;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(String direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }
    
    

    
}
