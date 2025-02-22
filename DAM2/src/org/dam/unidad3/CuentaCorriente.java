package org.dam.unidad3;

public class CuentaCorriente {
	
	private int numero;
	private float saldo;
	
	public CuentaCorriente(int numero, int saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero (float importe) {
		saldo = saldo+importe;
			
	}
	
	public void sacarDinero (float importe) {
		saldo = saldo-importe;
	}
	
	public void mostrarCuenta () {
		System.out.println(getNumero());
		System.out.println(getSaldo());
	}
	
	

}
