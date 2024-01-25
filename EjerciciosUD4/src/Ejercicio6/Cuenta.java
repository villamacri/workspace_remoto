package Ejercicio6;

public class Cuenta {

	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + "]";
	}
	
	public double ingresoSaldo(double cantidad) {
		return saldo+=cantidad;
	}
	
	public double retiroDinero(double cantidad) {
		return saldo-=cantidad;
	}
	
	public double calcularSaldos() {
		
		return saldo;
	}
	
}
