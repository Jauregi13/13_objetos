
public class Coche {
	
	final double GASOLINA = 1.39;
	final double GASOIL = 1.12;
	
	private String color;
	private String conductor;
	private String matricula;
	private int num_puertas;
	private int num_plazas;
	private int tamanio_maletero;
	private int caballos;
	private boolean tipo_combustible;
	private int kilometraje;
	private double litros_combustible;
	private double max_litros;
	private int marcha;
	private double velocidad;
	private double precioCompra;
	private double consumoMedio;
	private int anioMatriculacion;
	
	//getters y setters
	
	public String getColor() {
		return color;
	}
	public double getMax_litros() {
		return max_litros;
	}
	public void setMax_litros(double max_litros) {
		this.max_litros = max_litros;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNum_puertas() {
		return num_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	public int getNum_plazas() {
		return num_plazas;
	}
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	public int getTamanio_maletero() {
		return tamanio_maletero;
	}
	public void setTamanio_maletero(int tamanio_maletero) {
		this.tamanio_maletero = tamanio_maletero;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public boolean isCombustible() {
		return tipo_combustible;
	}
	public void setCombustible(boolean combustible) {
		this.tipo_combustible = combustible;
	}
	
	public boolean isTipo_combustible() {
		return tipo_combustible;
	}
	public void setTipo_combustible(boolean tipo_combustible) {
		this.tipo_combustible = tipo_combustible;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}
	public double getLitros_combustible() {
		return litros_combustible;
	}
	public void setLitros_combustible(double litros_combustible) {
		this.litros_combustible = litros_combustible;
	}
	public int getMarcha() {
		return marcha;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public double getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getConsumoMedio() {
		return consumoMedio;
	}
	public void setConsumoMedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}
	
	public int getAnioMatriculacion() {
		return anioMatriculacion;
	}
	public void setAnioMatriculacion(int anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}
	
	//funciones y procedimientos
	
	
	public void trucar(){
		this.caballos = getCaballos() + (int)(this.caballos*0.02);
	}
	public double repostar(int euros){
		double repostaje_litros;
		if(tipo_combustible){
			repostaje_litros = getLitros_combustible() + (euros/GASOLINA);
			if(repostaje_litros > getMax_litros()){
				setLitros_combustible(getMax_litros());
			}
			else {
				setLitros_combustible(repostaje_litros);
			}
			
		}
		else {
			repostaje_litros = getLitros_combustible() + (euros/GASOIL);
			if(repostaje_litros > getMax_litros()){
				setLitros_combustible(getMax_litros());
			}
			else {
				setLitros_combustible(repostaje_litros);
			}
		}
		return euros;
	}
	public void acelerar(int kmHora){
		this.velocidad = getVelocidad() + kmHora;
	}
	public void cambiarMarcha(boolean mas){
		if (mas){
			this.marcha = getMarcha() + 1;
		}
		else {
			this.marcha = getMarcha() -1;
		}
	}
	public void circular(int kms){
		this.kilometraje = getKilometraje() + kms;
	}
	
	public double valorar(){
		for (int i = 0; i <= getKilometraje(); i= i + 20000){
			setPrecioCompra(getPrecioCompra() - 100);
		}
		for (int i = 0; i < getAnioMatriculacion(); i++){
			setPrecioCompra(getPrecioCompra() - 500);
		}
		return this.precioCompra;
	}
	
	
}
