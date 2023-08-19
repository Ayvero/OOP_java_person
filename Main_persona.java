package persona;

import java.time.LocalDate;

public class Main_persona {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Persona Juan = new Persona(90f,1.70f);
		
		System.out.println(" la masa corporal de Juan es : "+ Juan.getMasaCorporal());
		System.out.println(Juan.getEnForma());
		
		
		Persona Maria= new Persona(70f,1.70f);
		System.out.println(Maria.getEnForma());
		
		Maria.setFecha_nac(LocalDate.of(1993,7,23));
		System.out.println(Maria.getCumpleAños());
		
		System.out.println(Maria.getMayorEdad());
		
		System.out.println(Maria.getPuedeVotar());
		

		System.out.println(Maria.getCoherenciaFechas());
		
		System.out.println(Maria.getInformacion());
		
		Juan.setApellido("Gomez");
		Juan.setNombre("Juan Carlos");
		System.out.println(Juan.getInformacion());
		
		
		
		
		
		

	}

}
