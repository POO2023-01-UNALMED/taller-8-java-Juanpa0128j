package futbol;

import java.lang.Comparable;

public abstract class Futbolista implements Comparable<Object>{
	
	private String nombre;
	private int edad;
	private String posicion;
	
	protected Futbolista(String nombre, int edad, String posicion){
		this.setEdad(edad);
		this.setNombre(nombre);
		this.setPosicion(posicion);
	}
	
	protected Futbolista(){
		this("Maradona", 30, "delantero");
	}
	
	public boolean equals(Futbolista f) {
		if (this.compareTo(f) == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String toString(){
		return("El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion());
		
	}
	
	public abstract boolean jugarConLasManos();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

}
