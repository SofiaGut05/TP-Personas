package personas;

public class Personas {
	private String nombre;
	private String apellido;
	private String identificacion;
	private String area;
	private int sector;
	private int diasVacaciones;
	private int categoriaVacaciones;
	private int codigo;
	private int edad;
	
	public Personas (String nombre,String apellido,String identificacion, String area, int diasVacaciones, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.identificacion = identificacion;
		this.area = area;
		this.sector = 0;
		this.diasVacaciones = diasVacaciones;
		this.categoriaVacaciones = 0;
		this.codigo = 0;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getSector() {
		return sector;
	}
	public void setSector(int sector) {
		this.sector = sector;
	}
	public int getDiasVacaciones() {
		return diasVacaciones;
	}
	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	public int getCategoriaVacaciones() {
		return categoriaVacaciones;
	}
	public void setCategoriaVacaciones(int categoriaVacaciones) {
		this.categoriaVacaciones = categoriaVacaciones;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPersona() {
		String parametrosPersona;
		parametrosPersona = "Nombre: " + getApellido() + ", " + getNombre() 
				+ " - Identificación: " + getIdentificacion() + " - Area:" + getArea()
			    + " - Id Sector: " + getSector() + " - Días vacaciones:" 
				+ getDiasVacaciones() + " - Categoria Vacaciones:" + getCategoriaVacaciones() + 
				" - Codigo:" + getCodigo() + " - Edad:" + getEdad() + " años.";
		return parametrosPersona;
	}
	public void eliminarPersona() {
		this.nombre = "";
		this.apellido = "";
		this.identificacion = "";
		this.area = "";
		this.sector = 0;
		this.diasVacaciones = 0;
		this.categoriaVacaciones = 0;
		this.codigo = 0;
		this.edad = 0;
	}
	
	public String eliminarMenor18() {
		if(this.edad < 18) {
			eliminarPersona();
			return "* Menor de 18 años, se eliminó usuario (" + getPersona()+ ")";
		} else {
			return "Nombre: " + getApellido() + ", " + getNombre() 
			+ " - Identificación: " + getIdentificacion() + " - Edad:" 
			+ getEdad() + " años.";
			}
	}
	
	public String asignarIdSector(String area){
		if (identificacion != "") {
		switch (area) {
		  case "Comercial":
		     setSector(1);
		    break;
		  case "Atencion al publico":
			 setSector(2);
		    break;
		  case "Programador":
			 setSector(3);
		    break;
		  default:
			 setSector(10);;
		    break;
		}
		return "Nombre: " + getApellido() + ", " + getNombre() 
		+ " - Identificación: " + getIdentificacion() + " - Area:"
		+ area + " - Id Sector: " + sector  ;
		}
		return "* No se asigna id sector ya que este usuario fue eliminado";
	}

	public String asignarCategoriaVacaciones(int diasVacaciones){
		if (identificacion != "") {
		switch (diasVacaciones) {
		  case 7:
		     setCategoriaVacaciones(1);
		    break;
		  case 14:
			 setCategoriaVacaciones(2);
		    break;
		  case 21:
			 setCategoriaVacaciones(3);
		    break;
		  case 28:
			 setCategoriaVacaciones(4);
		    break;
		  default:
			 setCategoriaVacaciones(5);;
		    break;
		}
		return "Nombre: " + getApellido() + ", " + getNombre() 
				+ " - Identificación: " + getIdentificacion() + " - Días vacaciones:" 
				+ getDiasVacaciones() + " - Categoria Vacaciones:" + getCategoriaVacaciones() ;
		}
		return "* No se asigna categoría de vacaciones ya que este usuario fue eliminado";
	}
	
	public String getPersonaPostFunciones() {
		if (identificacion != "") {
		return getPersona();
		}
		return "Se eliminó usuario por ser menor de 18 años";
	}
}
	
