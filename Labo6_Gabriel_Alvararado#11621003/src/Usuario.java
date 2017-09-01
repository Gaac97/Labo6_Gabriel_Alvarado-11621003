
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Alvarado
 */
public class Usuario {

    private String nombre;
    private String apellido;
    private String correo;
    private String pais;
    private String fecha;
    private String numero;
    private String contraseña;

    private ArrayList<Usuario> ListMensajesN = new ArrayList();
    private ArrayList<Usuario> ListNoDeseados = new ArrayList();
    private ArrayList<Usuario> ListSpam = new ArrayList();
    private ArrayList<Usuario> ListBorradores = new ArrayList();
    private ArrayList<Usuario> ListEnviados = new ArrayList();
    private ArrayList<Usuario> ListEliminados = new ArrayList();
    private ArrayList<Usuario> ListImportantes = new ArrayList();

    public Usuario(String nombre, String apellido, String correo, String pais, String fecha, String numero, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.pais = pais;
        this.fecha = fecha;
        this.numero = numero;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Usuario> getListMensajesN() {
        return ListMensajesN;
    }

    public void setListMensajesN(Usuario x) {
        ListMensajesN.add(x);
    }

    public ArrayList<Usuario> getListNoDeseados() {
        return ListNoDeseados;
    }

    public void setListNoDeseados(Usuario x) {
        ListNoDeseados.add(x);
    }

    public ArrayList<Usuario> getListSpam() {
        return ListSpam;
    }

    public void setListSpam(Usuario x) {
        ListSpam.add(x);
    }

    public ArrayList<Usuario> getListBorradores() {
        return ListBorradores;
    }

    public void setListBorradores(Usuario x) {
        ListBorradores.add(x);
    }

    public ArrayList<Usuario> getListEnviados() {
        return ListEnviados;
    }

    public void setListEnviados(Usuario x) {
        ListEnviados.add(x);
    }

    public ArrayList<Usuario> getListEliminados() {
        return ListEliminados;
    }

    public void setListEliminados(Usuario x) {
        ListEliminados.add(x);
    }

    public ArrayList<Usuario> getListImportantes() {
        return ListImportantes;
    }

    public void setListImportantes(Usuario x) {
        ListImportantes.add(x);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", fecha=" + fecha + ", numero=" + numero + ", contrase\u00f1a=" + contraseña + ", ListMensajesN=" + ListMensajesN + ", ListNoDeseados=" + ListNoDeseados + ", ListSpam=" + ListSpam + ", ListBorradores=" + ListBorradores + ", ListEnviados=" + ListEnviados + ", ListEliminados=" + ListEliminados + ", ListImportantes=" + ListImportantes + '}';
    }

}
