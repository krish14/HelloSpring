package javaAbstract;

public class ElectricGuitar extends StringedInstrument {
	
	public ElectricGuitar(){
		super();	
		this.instrumentName = "ElectricGuitar";
		this.numOfStrings = 2;
		
	}
	
	public ElectricGuitar(int noOfStrings){
		super();
		this.instrumentName = "ElecticGuitor";
		this.numOfStrings = noOfStrings;
	}

	@Override
	public void play() {

		 System.out.println("An electric "+instrumentName+"/"+ numOfStrings +" is rocking!");
		 
	}


}
