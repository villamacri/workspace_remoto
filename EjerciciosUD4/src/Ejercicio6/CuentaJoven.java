package Ejercicio6;

public class CuentaJoven extends Cuenta{


	public CuentaJoven(double saldo) {
		super(saldo);
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
		return super.ingresoSaldo(cantidad)+1;
	}

	@Override
	public double retiroDinero(double cantidad) {
		// TODO Auto-generated method stub
		return super.retiroDinero(cantidad);
	}


	public void contadorOperacionesRegalo(int contador) {
		
		contador++;
	}
	
	
}
