/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaMySQL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sucursal suc = new Sucursal();
        Persona p = new Persona();

        ConeccionBD bd = new ConeccionBD();
        Empleado em = new Empleado();

//        Revista rev = new Revista();
//
        System.out.println("Que operación desea realizar:" + "\n 1. Ingresar registros a la tabla" + "\n 2. Mostrar Los registros de la tabla" + "\n 3. Buscar un registro por su nombre");
        System.out.println("Escoja la tabla que ingresará los datos ");
        int es = sc.nextInt();

        switch (es) {
            case 1:

                while (true) {
                    System.out.println("Ingrese el ID de la sucursal:");
                    int idSuc;
                    suc.setIdSucursal(idSuc = sc.nextInt());
                    System.out.println("Ingrese la direccion de la sucursal:");
                    String dir = sc.next();
                    suc.setDireccion(dir);
                    System.out.println("Ingrese el telefono de la sucursal");
                    String tel = sc.next();
                    suc.setTelefono(tel);

                    bd.guardarSucursal(suc);

                    System.out.println("Desea ingresar una nueva sucursal?");
                    String res = sc.next();
                    if (res.equalsIgnoreCase("no")) {
                        break;
                    }
                }
                break;
            case 2:
                ArrayList<Sucursal> list = new ArrayList<Sucursal>();
                list = bd.leerSucursalBd();
                for (Sucursal sucu : list) {
                    System.out.println("" + sucu.imprimir());
                }
                break;
            case 3:
                System.out.println("cual es el nombre de la persona q desea buscar:");
                p.setNombre(sc.next());
                bd.buscarPersona(p);

                break;

            default:
                System.out.println("No existe ninguna tabla con ese nombre");
        }
    }
}