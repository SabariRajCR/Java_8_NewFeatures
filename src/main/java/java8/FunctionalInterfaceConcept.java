package java8;

//SAM - Single Abstract Interface
//Can also be denoted with @Functional Interface annotation

@FunctionalInterface
public interface FunctionalInterfaceConcept {
	
	public void name(String value);
	
	public static void main(String[] args) {	
	
		FunctionalInterfaceConcept f = (value) ->System.out.println("Funtional Interface " +value );
					
		f.name("Sabari");
						
		}	
	
}

