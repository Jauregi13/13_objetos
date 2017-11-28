import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
	//atributos private
		private String nombre;
		private int edad;
		private Date fecha_nacimiento;
		private String telefono;
		private String nacionalidad;
		private String direccion;
		private String DNI;
		private String apellidos;
		private String poblacion;
		private double peso;
		private double dinero;
	
	//metodos public
		public void comer(){
			System.out.println("He comido");
			
		}
		public void gastarDinero(double cantidad){
			if (cantidad > this.dinero){
				System.out.println("Has gastado mas de lo que puedes!!");
			}
			else{
				setDinero(getDinero() - cantidad);
			}
			
		}
		public double getDinero() {
			return dinero;
		}
		public void setDinero(double dinero) {
			this.dinero = dinero;
		}
		public void setPeso(double peso) {
			this.peso = peso;
		}
		public void correr(double km){
			double pesoPerdido = 0.05*km;
			this.peso = this.peso - pesoPerdido;
			System.out.println("He corrido " + km + "kilometros y he perdido " + pesoPerdido + " kilos.");
		}
		public void dormir(){
			System.out.println("He comido");
		}
		/*
		 * @param peso en cuanto se va a cambiar el peso
		 */
		public void engordar(int peso){
			this.peso = this.peso + peso;
		}
		public void cumplirAnio(){
				this.edad++;
		}
		
		public void cambiarEdad(int edad){
			this.edad = edad;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			if (this.edad < 0){
				System.out.println("Edad introducida incorrecta");
			}else{
				this.edad = edad;
			}
			
		}
		public Date getFecha_nacimiento() {
			return fecha_nacimiento;
		}
		public void setFecha_nacimiento(Date fecha_nacimiento) {
			this.fecha_nacimiento = fecha_nacimiento;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			if (this.telefono.length() > 9){
				System.out.println("El telefono introducido es incorrecto");
			}else{
				this.telefono = telefono;
			}
			
		}
		public String getNacionalidad() {
			return nacionalidad;
		}
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getDNI() {
			return DNI;
		}
		public void setDNI(String dNI) {
			if (this.DNI.length() < 9){
				System.out.println("El DNI introducido es incorrecto");
			}else {
				DNI = dNI;
			}
			
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getPoblacion() {
			return poblacion;
		}
		public void setPoblacion(String poblacion) {
			this.poblacion = poblacion;
		}
		public double getPeso() {
			return peso;
		}
		public void setPeso(int peso) {
			if (this.peso < 0 ){
				System.out.println("El peso introducido es incorrecto");
			}else {
				this.peso = peso;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
