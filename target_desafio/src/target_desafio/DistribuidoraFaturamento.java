package target_desafio;

public class DistribuidoraFaturamento {
	public static void main(String[] args) {

		double[] faturamentoDiario = { 1000.0, 2500.0, 0.0, 0.0, 3000.0, 1200.0, 4000.0, 500.0, 0.0, 0.0, 1500.0, 0.0,
				2700.0, 0.0, 0.0, 2300.0 };

		double menorFaturamento = Double.MAX_VALUE;
		double maiorFaturamento = Double.MIN_VALUE;
		double somaFaturamento = 0.0;
		int diasComFaturamento = 0;

		for (double valor : faturamentoDiario) {
			if (valor > 0) {
				if (valor < menorFaturamento) {
					menorFaturamento = valor;
				}
				if (valor > maiorFaturamento) {
					maiorFaturamento = valor;
				}
				somaFaturamento += valor;
				diasComFaturamento++;
			}
		}

		double mediaFaturamento = somaFaturamento / diasComFaturamento;

		int diasAcimaDaMedia = 0;
		for (double valor : faturamentoDiario) {
			if (valor > mediaFaturamento) {
				diasAcimaDaMedia++;
			}
		}

		System.out.println("Menor faturamento do mês: " + menorFaturamento);
		System.out.println("Maior faturamento do mês: " + maiorFaturamento);
		System.out.println("Número de dias com faturamento superior à média: " + diasAcimaDaMedia);

	}
}
