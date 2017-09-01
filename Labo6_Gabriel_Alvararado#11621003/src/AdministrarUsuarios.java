
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gabriel Alvarado
 */
public class AdministrarUsuarios {

    private ArrayList<Usuario> ListUsuario = new ArrayList();
    private File archivo = null;

    public AdministrarUsuarios(String Path) {
         archivo = new File(Path);
    }

    public ArrayList<Usuario> getListUsuario() {
        return ListUsuario;
    }

    public void setListUsuario(ArrayList<Usuario> ListUsuario) {
        this.ListUsuario = ListUsuario;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministrarUsuarios{" + "ListUsuario=" + ListUsuario + ", archivo=" + archivo + '}';
    }

     //Extra mutador
    public void setUsuario(Usuario Usuario) {
        this.ListUsuario.add(Usuario);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Usuario t : ListUsuario) {
                bw.write(t.getNombre() + ",");
                bw.write(t.getApellido()+",");
                bw.write(t.getCorreo()+",");
                bw.write(t.getFecha() + ",");
                bw.write(t.getPais() + ",");
                bw.write(t.getNumero() + ",");
                bw.write(t.getContraseña() + ";");

            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }

    public void CargarArchivo() {
        Scanner sc = null;
        if (archivo.exists()) {
            ListUsuario= new ArrayList();
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");

                while (sc.hasNext()) {
                    ListUsuario.add(new Usuario(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception e) {
            }
        }
    }//Fin Exist

}
