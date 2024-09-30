package App;


import heroClass.Hero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero guerreiro = new Hero("Aragorn",80,"guerreiro");
		Hero ninja = new Hero("ryuk",20,"ninja");
		Hero mago = new Hero("Gandalf",1500,"mago");
		Hero hobbit = new Hero("frodo",20,"hobbit");
		
		System.out.println(guerreiro.attack());	
		System.out.println(ninja.attack());
		System.out.println(mago.attack());
		System.out.println(hobbit.attack());
		

	}

}
