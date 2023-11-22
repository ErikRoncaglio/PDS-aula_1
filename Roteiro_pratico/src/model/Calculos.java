package model;

import javax.swing.JOptionPane;

public class Calculos {

	public float PrecoDiesel, PrecoComum, PrecoAditiv, PrecoEtanool, Preco500ml, Preco1L, Quant500ml, Quant1L,
			Total500ml, Total1L, TotalComb, TotalOleo;
	public String Total;

	public String Diesel(float qL) {
		String PrecoTotal = String.valueOf(PrecoDiesel * qL);
		TotalComb = Float.valueOf(PrecoTotal);
		return PrecoTotal;
	}

	public String Comum(float qL) {
		String PrecoTotal = String.valueOf(PrecoComum * qL);
		return PrecoTotal;
	}

	public String Aditiv(Float qL) {
		String PrecoTotal = String.valueOf(PrecoAditiv * qL);
		TotalComb = Float.valueOf(PrecoTotal);
		return PrecoTotal;
	}

	public String Etanol(float qL) {
		String PrecoTotal = String.valueOf(PrecoEtanool * qL);
		TotalComb = Float.valueOf(PrecoTotal);
		return PrecoTotal;
	}

	public String calcFrascoM() {
		String PrecoTotal = String.valueOf(Quant500ml * Preco500ml);
		Total500ml = Float.valueOf(PrecoTotal);
		return PrecoTotal;
	}

	public String calcFrascoL() {
		String PrecoTotal = String.valueOf(Quant1L * Preco1L);
		Total1L = Float.valueOf(PrecoTotal);
		return PrecoTotal;
	}

	public String totalOleo() {
		String PrecoTotal = String.valueOf(Total500ml + Total1L);
		TotalOleo = Float.valueOf(PrecoTotal);
		return PrecoTotal;
	}

	public String TotalpagarVista() {
		String total = String.valueOf((TotalComb + TotalOleo) - ((TotalComb + TotalOleo) * 0.10));
		Total = total;
		return total;
	}

	public String totalPagarPrazo() {

		String total = String.valueOf((TotalComb + TotalOleo));
		return total;
	}

	public String totalPagarPrazo30() {
		String total = String.valueOf((TotalComb + TotalOleo) + ((TotalComb + TotalOleo) * 0.10));
		return total;
	}
}
