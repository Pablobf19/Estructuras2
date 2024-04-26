import java.util.LinkedList;

public class ModificarEdad {
    public LinkedList<Empleado> Edad(LinkedList<Empleado> empleados){
       
        for (Empleado item : empleados) {
            if (item.getEdad() < 18) {
                item.setEdad(15);
                
            }else{
                item.setEdad(20);
            }
        }
       
        return empleados;
    }
}
