package ejemplo1;

public class Alumno {

	protected String nombre;
	protected int edad;
	protected String apellido;
	
	public Alumno(String a, int b) {
		nombre=a;
		edad=b;
	}
	
	public Alumno(String a, int b, String c){
		nombre=a;
		edad=b;
		apellido=c;
	}
	public int getedad(){
		return edad;
	}
	public String getnombre(){
		return nombre;
	}
	public String getapellido(){
		return apellido;
	}
	
	
	
}
