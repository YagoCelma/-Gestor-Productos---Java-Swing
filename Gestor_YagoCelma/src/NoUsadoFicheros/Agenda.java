/*package NoUsadoFicheros;


import Dominio.*;
import Transversal.Empleado;
import Transversal.Cliente;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Agenda {
    
    private Cliente[] clientes;
    private Empleado[] empleados;

    public Agenda(Cliente[] clientes) {
        this.clientes = clientes;
    }
    
    public Agenda() {
        this.clientes = new Cliente[100];
        this.empleados = new Empleado[100];
    }
    
    public Agenda(Empleado[] empleados){
        this.empleados = empleados;
    }

    public Cliente[] getClientes() {
        return clientes;
    }
    public Empleado[] getEmpleados(){
        return empleados;
    }
    
    public boolean existeCliente(Cliente c){   
        
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null && c.getNombre().trim().equals(clientes[i].getNombre().trim())){
                
                return true;
            }
        }
        return false;
    }
    
    public void addCliente(Cliente c){
        
        if(existeCliente(c)){
            JOptionPane.showMessageDialog(null, "Ese cliente ya esta añadido", "ATENCION!!", JOptionPane.ERROR_MESSAGE);
        } else {
            boolean encontrado = false;
            
            for(int i = 0; i < clientes.length && !encontrado; i++){
                if(clientes[i] == null){
                    clientes[i] = c;
                    encontrado = true;          
                }
            }
            
            if(encontrado){
                JOptionPane.showMessageDialog(null, "Cliente añadido correctamente", "Atencion!!!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido añadir el cliente. La agenda está llena.", "Error!!!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    public void delCliente(Cliente c){
        
        boolean encontrado = false;
        
        for(int i = 0; i < clientes.length && !encontrado; i++){
            if(clientes[i] != null && c.getNombre().trim().equals(clientes[i].getNombre().trim())){
                clientes[i] = null;
                encontrado = true;
                
                JOptionPane.showMessageDialog(null, "Cliente borrado", "Atencion!!!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        if(!encontrado){
            JOptionPane.showMessageDialog(null, "No existe ese cliente", "Atencion!!!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public Cliente encontrarCliente(String nombre){   
        
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i] != null && nombre.trim().equalsIgnoreCase(clientes[i].getNombre().trim())){
                
                return clientes[i];
            }
        }
        return null;
    }
    
    public Cliente actualizarCliente(Cliente nuevo, Cliente viejo){
        
        viejo.setNombre(nuevo.getNombre());
        viejo.setDireccion(nuevo.getDireccion());
        viejo.setNif(nuevo.getNif());
        viejo.setTelefono(nuevo.getTelefono());
        viejo.setCorreo(nuevo.getCorreo());
        
        return viejo;
    }
    
    public void importarClientes(String ruta) throws FileNotFoundException, IOException{
        
        Cliente aux;
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))){
            
            while(true){
            
                aux = (Cliente) ois.readObject();
                
                addCliente(aux);
            }
        }catch(java.io.EOFException e){ 
        // ¡AGREGAR ESTO! El archivo ha terminado. El proceso es un éxito.
        // No hacemos nada para salir sin error.
    }catch(ClassNotFoundException e){
        JOptionPane.showMessageDialog(null, "Error: Clase de objeto no encontrada.", "ATENCION!!!", JOptionPane.ERROR_MESSAGE);
    }catch(IOException e){
        // Mantenemos tu mensaje de error para otros IOExceptions
        JOptionPane.showMessageDialog(null, "Error al importar los datos", "ATENCION!!!", JOptionPane.ERROR_MESSAGE);
        // Es mejor re-lanzar si jpn_Cliente lo espera
        throw e; 
    }
    }
    
    public void exportarContactos(String ruta){
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))){
            
            for(int i = 0; i < clientes.length; i++){
                
                if(clientes[i] != null){
                    oos.writeObject(clientes[i]);
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha exportado con exito.");
        }catch(IOException ex){
            JOptionPane.showConfirmDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void addEmpleado(Empleado e){
        
        if(!empleadoExiste(e)){
            
            boolean encontrado = false;
            
            for(int i = 0; i < empleados.length && !encontrado; i++){
                if(empleados[i] == null){
                    empleados[i] = e;
                    encontrado = true;
                }
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Empleado ya existe", "Aviso!!!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public boolean empleadoExiste(Empleado e){
                
        for(int i = 0; i < empleados.length; i++){
            if(empleados[i] != null && empleados[i].getDni().equalsIgnoreCase(e.getDni())){
                return true;
            }
        }
        return false;
    }
    
    public void delEmpleado(Empleado e){
        
        boolean encontrado = false;
        
        for(int i = 0; i < empleados.length && !encontrado; i++){
            if(empleados[i].getDni().equalsIgnoreCase(e.getDni())){
                empleados[i] = null;
                encontrado = true;
            }
        }
    }
    
    public Empleado encontrarEmpleado(String dni){
        
        boolean encontrado = false;
        for(int i = 0; i < empleados.length | !encontrado; i++){
            if(empleados[i].getDni().equalsIgnoreCase(dni)){
                return empleados[i];
            }
        }
        return null;
    }
    
    public Empleado actualizarEmpleado(Empleado viejo, Empleado nuevo){
        
        viejo.setDni(nuevo.getDni());
        viejo.setNombre(nuevo.getNombre());
        viejo.setDireccion(nuevo.getDireccion());
        viejo.setSueldo(nuevo.getSueldo());
        viejo.setPuesto(nuevo.getPuesto());
        viejo.setDepartamento(nuevo.getDepartamento());
        viejo.setFechaContratacion(nuevo.getFechaContratacion());
        viejo.setIdEmpresa(nuevo.getIdEmpresa());
        viejo.setCorreo(nuevo.getCorreo());
        
        return viejo;
    }
}
*/
