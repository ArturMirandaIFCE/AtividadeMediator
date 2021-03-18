package mediatoratividade1;


public class Main {

	public static void main(String[] args) 
	{	
		ConcreteMediatorTorre mediator = new ConcreteMediatorTorre();
		
		ConcretePiloto1 piloto1 = new ConcretePiloto1(mediator);
		ConcretePiloto2 piloto2 = new ConcretePiloto2(mediator);
		
		mediator.setPiloto1(piloto1);
		mediator.setPiloto2(piloto2);
		
		piloto1.send("Solicitando permissão para pouso");
		piloto2.send("Solicitando permissão para decolagem");
	}

}