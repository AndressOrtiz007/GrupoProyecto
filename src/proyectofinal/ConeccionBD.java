/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

package personamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Scanner;


public class ConeccionBD {
    Scanner sc= new Scanner(System.in);
    ArrayList<Sucursal> sucursales;
    Sucursal sucursal;
    private ArrayList<Sucursal> listaSucursal;
    private ArrayList<Persona> listaNombres;
    ArrayList<Persona> listaPersonas;
    Persona persona;

    public void guardarSucursal(Sucursal s){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/personamysql","root","root");
            System.out.println("Conexion establecida");
            Statement sentencia = (Statement) conexion.createStatement();
            String sentenciaSql="insert into sucursal values ('"+s.getIdSucursal()+"','"+s.getDireccion()+"','"+s.getTelefono()+"')";
            int insert = sentencia.executeUpdate(sentenciaSql);
            sentencia.close();
            conexion.close();
            
        }catch (Exception e){
            System.out.println("Error en la conexión"+e);
        }
    }

    public ArrayList<Sucursal> leerSucursalBd(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/personamysql","root","root");
            Statement sentencia = conexion.createStatement();
            String sentenciaSql = "select * from sucursal";
            ResultSet resultado = sentencia.executeQuery(sentenciaSql);
            listaSucursal = new ArrayList<Sucursal>();
            
            while(resultado.next()){
                int id=resultado.getInt("idSucursal");
                String direccion=resultado.getString("direccion");
                String telefono=resultado.getString("telefono");
                
                sucursal = new Sucursal();
                sucursal.setIdSucursal(id);
                sucursal.setDireccion(direccion);
                sucursal.setTelefono(telefono);
                listaSucursal.add(sucursal);
            }
                                    
                sentencia.close();
                conexion.close();
                
        } catch (Exception e) {
            System.out.println("Error:" + e);
        }
     return listaSucursal;
    }
public void buscarPersona(Persona per) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion=DriverManager.getConnection("jdbc:mysql://localhost/personamysql","root","root");
            System.out.println("Conexión establecida");

            Statement sentencia = (Statement) conexion.createStatement();
            String sentenciaSql = "select*from persona where nombre='"+per.getNombre()+"'";
            ResultSet resultado = sentencia.executeQuery(sentenciaSql);
            listaNombres = new ArrayList<Persona>();
            while (resultado.next()) {
                String id = resultado.getNString("id");
                String nombre = resultado.getNString("nombre");
                String apellido = resultado.getNString("apellido");
              
                System.out.println("La persona se llama "+ nombre+" Su apellido es "+ apellido+" Su Id es "+id);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexión" + ex);
        }
    } 
    
}
