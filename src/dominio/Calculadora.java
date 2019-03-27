package dominio;

import exepciones.DivisionPorCeroExcepcion;

public class Calculadora {

	// Attributes

	private double num1;
	private double num2;
	private String operacion;
	private String numActual;
	private String numMemoria;

	// Constructor
	public Calculadora() {

	}

	// Getters and Setters

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public String getNumActual() {
		return numActual;
	}

	public void setNumActual(String numActual) {
		this.numActual = numActual;
	}

	public String getNumMemoria() {
		return numMemoria;
	}

	public void setNumMemoria(String numMemoria) {
		this.numMemoria = numMemoria;
	}

	// Arithmetic operations

	public double sumar() {
		return 0;
	}

	public double restar() {
		return 0;
	}

	public double multiplicar() {
		return 0;
	}

	public double dividir() throws DivisionPorCeroExcepcion {
		return 0;
	}

	public void porcentaje() {

	}

	public double raiz() {
		return 0;
	}

	public double inversa() throws DivisionPorCeroExcepcion {
		return 0;
	}

	// Change sign to current value
	public void cambiarSigno() {

	}

	// Reset all variables
	public void reset() {

	}

	// Concatenate number to numActual
	public String concatenar(String numero) {
		return null;
	}

	public void retroceder() {

	}

	public void sumarMemoria() {

	}

	public void restarMemoria() {

	}

	// Calculate any operation
	public double calcular() throws DivisionPorCeroExcepcion {
		double res = 0;
		switch (operacion) {
		case "+":
			res = sumar();
			break;
		case "-":
			res = restar();
			break;
		case "*":
			res = multiplicar();
			break;
		case "/":
			res = dividir();
			break;
		case "+%":
			porcentaje();
			res = sumar();
			break;
		case "-%":
			porcentaje();
			res = restar();
			break;
		case "*%":
			porcentaje();
			res = num2;
			break;
		case "/%":
			porcentaje();
			res = dividir();
			break;
		}
		return res;
	}
}
