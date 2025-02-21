package controller;

public class ContaController {

	public int ContaVezes(int maior, int menor) {

		// Condição de parada: se o valor maior, que está sendo diviido
		// se tornar zero, ou seja, indivisível, um zero será retornado
		// para começar a soma na recursão
		if (maior == 0) {

			return 0;

		}

		// Se o resto da divisão por 10 for igual ao número que queremos encontrar
		// somaremos 1 na contagem, pois ele apareceu mais uma vez
		// também retornamos o numero maior reduzido para subtrair um dígito e se tornar
		// possível dividi-lo até o fim

		if (maior % 10 == menor) {

			return 1 + ContaVezes(maior / 10, menor);

		}
		
		//Se a divisão do número não trazer o resto que estamos procurando
		//Apenas dividimos para conseguir conferir o próximo dígito

		return ContaVezes(maior / 10, menor);

	}

}
