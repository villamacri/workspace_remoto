package Ejercicio6;

public class CuentaEmpresa extends Cuenta {

	private double cuota;

	public CuentaEmpresa(double saldo, double cuota) {
		super(saldo);
		this.cuota = cuota;
		
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [cuota=" + cuota + "]";
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

	@Override
	public double ingresoSaldo(double cantidad) {
		// TODO Auto-generated method stub
		return super.ingresoSaldo(cantidad);
	}

	@Override
	public double retiroDinero(double cantidad) {
		// TODO Auto-generated method stub
		return super.retiroDinero(cantidad)-cuota;
	}
	
	public void contadorOperacionesCuota(int contador) {
		
		contador++;
		
	}
	
	
	
}
