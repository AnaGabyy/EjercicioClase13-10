
public class Libro {
	
	private String nombre, añoPublicacion;
	private int cantidadEjemplares, costo;
	private Autor autor;
	private Editorial editorial;
	

	public Libro(String nombre, String añoPublicacion, int cantidadEjemplares, int costo, Autor autor,
			Editorial editorial) {
		super();
		this.nombre = nombre;
		this.añoPublicacion = añoPublicacion;
		this.cantidadEjemplares = cantidadEjemplares;
		this.costo = costo;
		this.autor = autor;
		this.editorial = editorial;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public int getCantidadEjemplares() {
		return cantidadEjemplares;
	}

	public void setCantidadEjemplares(int cantidadEjemplares) {
		this.cantidadEjemplares = cantidadEjemplares;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", añoPublicacion=" + añoPublicacion + ", cantidadEjemplares="
				+ cantidadEjemplares + ", costo=" + costo + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	
	
	

}
