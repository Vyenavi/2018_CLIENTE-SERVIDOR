package vsarmiento_sesion1;
public class Alumno {
    public Alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;
    }
    String sNombre="Yenavi Veronica";
    String sApellido ="Sarmiento Limachi";
    String sFecha_Nacimiento="01/28/";
    String sCodigo="2014124368";
    String sSexo="Femenino";

    public void setSApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getSApellido() {
        return sApellido;
    }

    public void setSFecha_Nacimiento(String sFecha_Nacimiento) {
        this.sFecha_Nacimiento = sFecha_Nacimiento;
    }

    public String getSFecha_Nacimiento() {
        return sFecha_Nacimiento;
    }

    public void setSCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getSCodigo() {
        return sCodigo;
    }

    public void setSSexo(String sSexo) {
        this.sSexo = sSexo;
    }

    public String getSSexo() {
        return sSexo;
    }

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getNEdad() {
        return nEdad;
    }
    int nEdad;
    public Alumno() {
        super();
    }
    public String SaludoBienvenida(String psNombre) {
        return "Hola mundo!!. Bienvenid@ " + psNombre;
    }
    public static void main(String[] args) {
        Alumno myAlumno = new Alumno();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.SaludoBienvenida("Pierina"));
        }
    }
}
