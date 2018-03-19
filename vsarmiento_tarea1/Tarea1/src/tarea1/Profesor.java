package tarea1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.SimpleDateFormat;

import java.util.Calendar;

public class Profesor {
    String sNombre;
    String sFecha_Ingreso;
    Integer nTotal_Cursos;

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setSFecha_Ingreso(String sFecha_Ingreso) {
        this.sFecha_Ingreso = sFecha_Ingreso;
    }

    public String getSFecha_Ingreso() {
        return sFecha_Ingreso;
    }

    public void setNTotal_Cursos(Integer nTotal_Cursos) {
        this.nTotal_Cursos = nTotal_Cursos;
    }

    public Integer getNTotal_Cursos() {
        return nTotal_Cursos;
    }

    public Profesor() {
        super();
    }
    
    public int Calcular_Dias()
    {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Integer nTotal_dias=0;
            
            Calendar cal=Calendar.getInstance();             
            int diaHoy = cal.get(cal.DATE); 
            int mesHoy = cal.get(cal.MONTH); 
            int anioHoy = cal.get(cal.YEAR); 
            
            String sObtener_Fecha = sFecha_Ingreso;
            String[] sFecha_Vector = sObtener_Fecha.split("/"); 
            int nDia_Ant = Integer.parseInt(sFecha_Vector[0]); 
            int nMes_Ant = Integer.parseInt(sFecha_Vector[1]); 
            int nAnio_Ant = Integer.parseInt(sFecha_Vector[2]); 
            
            nTotal_dias=(anioHoy-nAnio_Ant)*365;
            nTotal_dias=nTotal_dias+(mesHoy-nMes_Ant)*30;
            nTotal_dias=nTotal_dias+(diaHoy-nDia_Ant);
            return nTotal_dias;
        }

    public static void main(String[] args) throws IOException{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        String sNombre_Profesor;
        Integer nTotal_Cursos;
        String sFecha;
        
        Profesor NuevoProfesor = new Profesor();
        
        System.out.println("Ingrese Nombre del Profesor : "); 
        sNombre_Profesor=buffer.readLine();
        System.out.println("Ingrese la Cantidad de cursos asignados");
        nTotal_Cursos=Integer.parseInt( buffer.readLine());
        System.out.println("Ingrese fecha de Ingreso");
        sFecha=buffer.readLine();
        
        NuevoProfesor.setSNombre(sNombre_Profesor);        
        NuevoProfesor.setNTotal_Cursos(nTotal_Cursos);   
        NuevoProfesor.setSFecha_Ingreso(sFecha);
        
        NuevoProfesor.setSNombre("Verocienta");        
        NuevoProfesor.setNTotal_Cursos(10);   
        NuevoProfesor.setSFecha_Ingreso("12/03/2017");
        

        System.out.println("Usted es "+ NuevoProfesor.getSNombre() + " y lleva laborando " + NuevoProfesor.Calcular_Dias()+ " dias , tiene "+ NuevoProfesor.getNTotal_Cursos()+ " cursos."); 
    }
}
