import java.util.Date;
/**
 * Esta clase permite almacenar informacion de una persona
 * @author Jon Jauregi
 *
 */
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
		/**
		 * Con este metodo permite saber si tenemos suficiente dinero para
		 * hacer un gasto concreto, y si lo tiene se calculará el gasto
		 * @param cantidad
		 */
		public void gastarDinero(double cantidad){
			if (cantidad > this.dinero){
				System.out.println("Has gastado mas de lo que puedes!!");
			}
			else{
				setDinero(getDinero() - cantidad);
			}
			
		}
		/**
		 * Esta funcion devuelve el dinero que tiene una persona
		 * @return dinero
		 */
		public double getDinero() {
			return dinero;
		}
		/**
		 * Este metodo nos permite definir el dinero que tiene una persona
		 * @param dinero
		 */
		public void setDinero(double dinero) {
			this.dinero = dinero;
		}
		/**
		 * Este metodo permite definir el peso de una persona, y si es
		 * negativo nos dara un error
		 * @param peso
		 */
		public void setPeso(double peso) {
			if (this.peso < 0 ){
				System.out.println("El peso introducido es incorrecto");
			}else {
				this.peso = peso;
			}
		}
		/**
		 * Esta funcion nos devuelve el peso que le hemos puesto a una persona
		 * @return peso
		 */
		public double getPeso() {
			return peso;
		}
		/**
		 * Este metodo permite saber cuantos kilometros ha corrido una persona
		 * @param km
		 */
		public void correr(double km){
			double pesoPerdido = 0.05*km;
			this.peso = this.peso - pesoPerdido;
			System.out.println("He corrido " + km + " kilometros y he perdido " + pesoPerdido + " kilos.");
		}
		public void dormir(){
			System.out.println("He comido");
		}
		/**
		 * Este metodo sirve para saber cuantos kilos ha engordado
		 * @param peso en cuanto se va a cambiar el peso
		 */
		public void engordar(int peso){
			this.peso = this.peso + peso;
		}
		public void cumplirAnio(){
				this.edad++;
		}
		/**
		 * Esta funcion devuelve el nombre que le hemos puesto a una persona
		 * @return nombre
		 */
		public String getNombre() {
			return nombre;
		}
		/**
		 * Este metodo nos permite definir el nombre de una persona
		 * @param nombre
		 */
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
		/**
		 * Esta funcion devuelve el DNI que le hemos puesto a una persona
		 * @return DNI
		 */
		public String getDNI() {
			return DNI;
		}
		/**
		 * Este metodo permite definir el DNI de una persona
		 * @param dNI
		 */
		public void setDNI(String DNI) {
			if (DNI.length() < 9){
				System.out.println("El DNI introducido es incorrecto");
			}else {
				this.DNI = DNI;
			}
			
		}
		/**
		 * Esta funcion devuelve los apellidos de una persona
		 * @return apellidos
		 */
		public String getApellidos() {
			return apellidos;
		}
		/**
		 * Este metodo sirve para definir los apellidos de una persona
		 * @param apellidos
		 */
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public String getPoblacion() {
			return poblacion;
		}
		public void setPoblacion(String poblacion) {
			this.poblacion = poblacion;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
