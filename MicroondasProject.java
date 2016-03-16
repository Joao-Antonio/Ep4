package EP4;

public class MicroondasProject {
	public static void main(String[] args) {
		MicroondasPadrao padrao = new MicroondasPadrao();
		MicroondasEconomico economico = new MicroondasEconomico();
		MicroondasPotente potente = new MicroondasPotente();
	}
}

class MicroondasPadrao {
	
	int potenciaMaxima;
	int tempoMaximo;
	
	public int descongelar(String str){
		return 1;
	}
	
	public int cozinhar(String str){
		return 1;
	}
	
	public int timer(String str){
		return 1;
	}
	
	public int pipoca(String str){
		return 1;
	}
	
	public int cha(String str){
		return 1;
	}
	
	public int grelhar(String str){
		return 1;
	}
}

//----------------------------------------------------

class MicroondasEconomico extends MicroondasEconomicoAbs{
	
	public int cozimentoBaixo(String str){
		return 1;
	}
	
	@Override
	public int cozinhar(String str) {
		return 1;
	}
	
	@Override
	public int timer(String str) {
		return 1;
	}
	
	@Override
	public int descongelar(String str) {
		return 1;
	}
	
	@Override
	public int pipoca(String str) {
		return 1;
	}
	
	@Override
	public int cha(String str) {
		return 1;
	}
	
	@Override
	public int grelhar(String str) {
		return 1;
	}
	
	@Override
	public int pesarCarne(String str) {
		return 0;
	}
	
	@Override
	public int pesarAves(String str) {
		return 0;
	}
	
}

class MicroondasPotente extends MicroondasPadrao implements MicroondasPotenteIter{
	
	@Override
	public int cozinhar(String str) {
		return 1;
	}
	
	@Override
	public int timer(String str) {
		return 1;
	}
	
	@Override
	public int descongelar(String str) {	
		return 1;
	}
	
	@Override
	public int pipoca(String str) {
		return 1;
	}
	
	@Override
	public int cha(String str) {
		return 1;
	}
	
	@Override
	public int grelhar(String str) {
		return 1;
	}
	
	public int cozimentoAlto(String str){
		return 1;
	}

	public int superDescongelante(String str) {
		return 0;
	}

	public int superTostado(String str) {
		return 0;
	}
}

//----------------------------------------------------

abstract class MicroondasEconomicoAbs extends MicroondasPadrao{
	
	public abstract int pesarCarne(String str);
	
	public int pesarPeixe(String str){
		return 1;
	};
	
	public abstract int pesarAves(String str);
}

interface MicroondasPotenteIter{
	
	public int superDescongelante(String str);
	
	public int superTostado(String str);
}