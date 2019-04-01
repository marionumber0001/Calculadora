package dominio;

import exepciones.DivisionPorCeroExcepcion;

public class Calculadora {

	// Attributes
	private double num1;
	private double num2;
	private String  ;
	private String numActual;
	private String numMemoria;

	// Constructor
	public Calculadora() {

		reset();
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
		return this.num1 + this.num2;
	}

	public double restar() {
		return this.num1 - this.num2;
	}

	public double multiplicar() {
		return this.num1 * this.num2;

	}

	public double dividir() throws DivisionPorCeroExcepcion {
		if (this.num2 == 0) {
			throw new DivisionPorCeroExcepcion();
		} else {
			return this.num1 / this.num2;
		}
	}

	public void porcentaje() {
	}

	public double raiz() {
		return Math.sqrt(this.num1);
	}

	public double inversa() throws DivisionPorCeroExcepcion {
		return 1 / this.num1;
	}

	// Change sign to current value
	public void cambiarSigno() {
	}

	// Reset all variables
	public void reset() {

		this.operacion = "";
		this.numActual = "0";
		this.numMemoria = "";
	}

	// Concatenate number to current number
	public String concatenar(String numero) {

		return this.numActual += numero;
	}

	public void retroceder() {
	}

	public void sumarMemoria() {
	}

	public void restarMemoria() {
	}

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
			porcentaje();
			res = sumar();
			sumar();
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