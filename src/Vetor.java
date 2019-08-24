
public class Vetor {
	
	public static final int TAMANHO = 10 ;
	private int v[] = new int [TAMANHO]; //armazena os elementos 
	private int numElementos; //informa��o sobre o numero de elementos inseridos  
 
 public Vetor (int numElementos ) {
	 this.numElementos= 0;
	 
 }
 public String toStringPosVetor ( int numElementos, int v[]) {
	 this.numElementos = 0; 
	 this.v = new int [TAMANHO];
	 int i;
	 for (i = 0; i < TAMANHO; i++) {
		 v[i]= 0;
	 }
	  return "[]";
 }
 
 
 public int obtemTamanho ( int v[], int numElementos) {
	 int i;
	 int aux;
	 for( i = 0; i < v.length; i++)
	 {  aux= v[i];
	 	numElementos= aux + v[i];
	 }
	 
	 return numElementos;}
 
 public int insereNoFinal (int Elemento) {
	 
	 for (int i =0 ; i < this.v.length; i ++) {
		 if ( this.v == null) {
			 this.v[i] = Elemento;
			 return i;
		 }
	 } return -1;
		 
 
 }
 
 public int posicaoDe(int elemento) {
	 
	 
	 return 0;}
 
 public void alteraEm (int pos, int novoValor) {}
 
 public int elementoDe(int pos) {return 0;}
 
 
 
 public void reverte() {}
 

}