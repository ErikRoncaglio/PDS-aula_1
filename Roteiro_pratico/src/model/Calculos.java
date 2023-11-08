package model;

import javax.swing.JOptionPane;

public class Calculos {

	private float result1 = 0;
	private float result = 0;

	public float CalcOleoM(float frascoM, float precoFrascoM) {
		result1 = frascoM * precoFrascoM;
		return result1;
	}

	public float CalcOleoL(float FrascoL, float PrecoFrascoL) {
		result = PrecoFrascoL * FrascoL;
		return result;
	}

	public float CalcOleoTotal() {

		float total = result + result1;

		return total;
	}

}
