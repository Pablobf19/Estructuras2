import java.util.LinkedList;
import java.util.Scanner;

public class Proyecto {
    
    public static void main(String[] args) {
        
        LinkedList<Empleado> empleados = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        ModificarEdad me = new ModificarEdad();
        for (int i = 0; i < 3; i++) {
            Empleado item = new Empleado();
            System.out.println("Ingrese el nombre del Empleado: ");
            item.setNombre(sc.next());
            System.out.println("Ingrese el apellido del empleado: ");
            item.setApellido(sc.next());
            System.out.println("Ingrese la direccion del empleado: ");
            item.setDireccion(sc.next());
            System.out.println("Ingrese la edad del empleado: ");
            item.setEdad(sc.nextInt());    
            System.out.println("Ingrese el cargo del empleado: ");
            item.setCargo(sc.next());
            empleados.add(item);
        }
        String cadena ="";

        empleados = me.Edad(empleados);

        for (Empleado empleado : empleados) {
            cadena = cadena + empleado.getNombre() + "\n" + empleado.getApellido() + "\n" + empleado.getDireccion() + "\n" +
             empleado.getEdad() + "\n" + empleado.getCargo();
            System.out.println(cadena);
        }
    }
}
