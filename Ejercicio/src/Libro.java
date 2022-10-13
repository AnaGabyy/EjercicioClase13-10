
public class Libro {
	
	private String nombre, a�oPublicacion;
	private int cantidadEjemplares, costo;
	private Autor autor;
	private Editorial editorial;
	

	public Libro(String nombre, String a�oPublicacion, int cantidadEjemplares, int costo, Autor autor,
			Editorial editorial) {
		super();
		this.nombre = nombre;
		this.a�oPublicacion = a�oPublicacion;
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

	public String getA�oPublicacion() {
		return a�oPublicacion;
	}

	public void setA�oPublicacion(String a�oPublicacion) {
		this.a�oPublicacion = a�oPublicacion;
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
		return "Libro [nombre=" + nombre + ", a�oPublicacion=" + a�oPublicacion + ", cantidadEjemplares="
				+ cantidadEjemplares + ", costo=" + costo + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	
	
	

}
