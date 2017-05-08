package ar.edu.unlam.pb2;

public class Fecha {

	private String dia;
	private String mes;
	private String anio;
		
	public Fecha (String dia, String mes, String anio)
	{
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	
	
	//SOURCE --> Generate Hashcode and Equals. Para comparar dos objetos en los test
		// se puede elegir que datos voy a comparar, en este caso usamos los dos datos
	
// el codigo hash se utiliza para que cada objeto tenga un codigo hash. Ahora no lo vamos a usar, despues para colecciones
	// el codigo hash es unico e irrepetible, hash y equals trabajan juntos siempre
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((dia == null) ? 0 : dia.hashCode());
		result = prime * result + ((mes == null) ? 0 : mes.hashCode());
		return result;
	}

	// la sobreescritura del metodo equals es para comparar los tipos de datos de objetos diferentes
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (dia == null) {
			if (other.dia != null)
				return false;
		} else if (!dia.equals(other.dia))
			return false;
		if (mes == null) {
			if (other.mes != null)
				return false;
		} else if (!mes.equals(other.mes))
			return false;
		return true;
	}

	
	
	// Getters y Setters //
	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}
	
	
	
	
}
