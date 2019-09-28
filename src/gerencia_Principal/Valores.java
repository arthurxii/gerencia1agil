package gerencia_Principal;

public class Valores implements ValoresITF {
	private int[] vetor = new int[10];
	
	public Valores() {
		
	}
	@Override
	public boolean ins(int num) {
		if(size() == 10) return false; 
		if(num > 0) {
			for(int i = 0; i < this.vetor.length; i++) {
				if(this.vetor[i] == 0) {
					this.vetor[i] = num;
				}
		} 
			return true;
		}
		return false;
	}

	@Override
	public int del(int num) {
		if(vetor.length == 0) {
			return -1;
		}
		int valor = 0;
		if (num >= 0 && num <= 9) {
			valor = this.vetor[num];
		}
		return valor;
	}
		
	@Override
	public int size() {
		int tamanho = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] != 0) {
				tamanho++;
			}
		}
		return tamanho;
	}

	@Override
	public double mean() {
		if(vetor.length == 0) {
			return -1;
		}
		double media = 0;
		for(int i = 0; i < vetor.length; i++){
			media = media + vetor[i];
		}
		return media;
	}

	@Override
	public int greater() {
		if(vetor.length == 0) {
			return -1;
		}
		int maior = 0;
		for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
            maior = vetor[i];     
			}
		}return maior;
	}

	@Override
	public int lower() {
		if(vetor.length == 0) {
			return -1;
		}
		int menor = 0;
		for (int i = 0; i < vetor.length; i++) {
			menor = vetor[i];
            if (vetor[i] < menor) {
            menor = vetor[i];     
			}
		}return menor;
	}
	
}
