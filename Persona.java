package persona;

 import java.time.LocalDate;

public class Persona {
	
	
	String nombre= "N";
	String apellido= "N";
	int edad =30;
	String DNI= "30.777.999";
	LocalDate fecha_nac= LocalDate.of(2000, 1, 1);
	String sexo="femenino";
	float peso=1;
	float altura=1;
	
	//constructores
	
	public Persona() {
		 nombre= "N";
		 apellido= "N";
		 edad =30;
		 DNI= "30.777.999";
		 fecha_nac= LocalDate.of(2000, 1, 1);
		 sexo="femenino";
		 peso=1;
		 altura=1;
		
	}
	
	public Persona(String DNI) {
		this.DNI=DNI;
	}
	
	public Persona(String DNI, String nombre, String apellido) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public Persona(String DNI, String nombre, LocalDate fecha_nac) {
		this.DNI=DNI;
		this.nombre=nombre;
		this.fecha_nac= fecha_nac;
	}
	
	public Persona(float peso, float altura) {
		this.peso= peso;
		this.altura=altura;
	}
	
	//metodos getters
	
	//calculo masa corporal:
	
	public float getMasaCorporal() {
		float masaC= (peso/ (altura*altura));
		return masaC;
	}

	//saber si esta en forma:
	
	public String getEnForma() {
		
		 float masaCo= this.getMasaCorporal();
		 if(masaCo > 18.5 && masaCo < 25 ) {
			 return "Ud esta en forma";
		 }else {
			 return " Ud. no esta en forma";
		 }
	}
	
	//saber si esta cumpliendo años:
	
	public  void setFecha_nac(LocalDate fecha_nac) {
		this.fecha_nac=fecha_nac;
	}
	
	public String getCumpleAños() {
		LocalDate hoy= LocalDate.now();
		if((hoy.getMonthValue() == fecha_nac.getMonthValue())&& (hoy.getDayOfMonth()== fecha_nac.getDayOfMonth())) {
			
			return "Feliz cumpleaños!";
			
		}else {
			return "Tienes que esperar un poco todavia para tu cumpleaños: va ser el :" +  fecha_nac.getDayOfMonth() + " del "+
		fecha_nac.getMonthValue();
			
		}
		
	}
	
	//saber si es mayor de edad:
	
	public String getMayorEdad() {
		
		LocalDate hoy= LocalDate.now();
		int anio= hoy.getYear();
		int anioNac = fecha_nac.getYear();
		
		if((anio-anioNac) >=18) {
			return "ud. es mayor de edad";
		}else {
			return "Ud. es menor de edad";
		}
	}
	
	
	//saber si puede votar:
	
	public String getPuedeVotar() {
		if (edad > 16) {
			return " Ud es mayor de 16 años y puede votar:";
		}else {
			return "Ud es menor de 16 años y no puede votar";
		}
		
	}
	
	//si es coherente la edad con la fecha de nacimiento:
	
	public String getCoherenciaFechas() {
		
		LocalDate hoy= LocalDate.now();
		int anio= hoy.getYear();
		int anioNac = fecha_nac.getYear();
		
		if(anio - edad == anioNac) {
			return "los datos son coherentes: ud tiene: " + edad + " años .";
		}
		else {
			 return "Los datos no son coherentes, ud tiene : " + edad + "años y su año de nacimiento es :  " + anioNac; 
		}
		
	}
	
	public String getInformacion() {
		
		return "Los datos son los siguientes:\n nombre: " + nombre +
				"\n apellido: " + apellido  + 
				"\n edad: "+ edad +
				"\n fecha de nacimiento: " + fecha_nac +
				"\n DNI: " + DNI +
				"\n sexo: " + sexo ;
	}
	
	// metodos setters:
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	
	public void setEdad(int edad ) {
		this.edad=edad;
	}
	
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	
	public void setPeso(float peso) {
		this.peso=peso;
	}
	
	public void setAltura(float altura) {
		this.altura=altura;
	}
}
