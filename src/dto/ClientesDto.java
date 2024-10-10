package dto;

public class ClientesDto {
	
	long idCliente;

	String nombreCliente;
	String apellidoCliente;
	
	/**
	 * @return the idCliente
	 */
	public long getIdCliente() {
		return idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the nombreCliente
	 */
	public String getNombreCliente() {
		return nombreCliente;
	}
	/**
	 * @param nombreCliente the nombreCliente to set
	 */
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	/**
	 * @return the apellidoCliente
	 */
	public String getApellidoCliente() {
		return apellidoCliente;
	}
	/**
	 * @param apellidoCliente the apellidoCliente to set
	 */
	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
	
	@Override
	public String toString() {
		return "ClientesDto [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + "]";
	}
	
}
