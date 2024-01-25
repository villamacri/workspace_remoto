package Ejercicio6;

public class CuentaCorriente extends Cuenta {

	private int puntos;
	private double mantenimiento;
	
	public CuentaCorriente(double saldo, int puntos, double mantenimiento) {
		super(saldo);
		this.puntos = puntos;
		this.mantenimiento = mantenimiento;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public double getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(double mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [puntos=" + puntos + ", mantenimiento=" + mantenimiento + "]";
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return super.getSaldo();
	}

	@Override
	public void setSaldo(double saldo) {
		// TODO Auto-generated method stub
		super.setSaldo(saldo);
	}
	
	public double calcularSaldo() {
		return getSaldo() - mantenimiento;
	}

	@Override
	public double ingresoSaldo(double ingreso) {
		double cien = 100;
		puntos = ingreso * 100;
		return super.setSaldo(getSaldo())+ingreso-mantenimiento;
	}

	@Override
	public double retiroDinero(double cantidad) {
		// TODO Auto-generated method stub
		return super.retiroDinero(cantidad)-mantenimiento;
	}
	
	public int sumaPuntos() {
		return puntos++;
	}

	
}
