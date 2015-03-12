/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the proveedor table.
 */
public class ProveedorPk implements Serializable
{
	protected String tipoDocumento;

	protected String numDocumento;

	/** 
	 * Sets the value of tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
	}

	/** 
	 * Gets the value of tipoDocumento
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/** 
	 * Sets the value of numDocumento
	 */
	public void setNumDocumento(String numDocumento)
	{
		this.numDocumento = numDocumento;
	}

	/** 
	 * Gets the value of numDocumento
	 */
	public String getNumDocumento()
	{
		return numDocumento;
	}

	/**
	 * Method 'ProveedorPk'
	 * 
	 */
	public ProveedorPk()
	{
	}

	/**
	 * Method 'ProveedorPk'
	 * 
	 * @param tipoDocumento
	 * @param numDocumento
	 */
	public ProveedorPk(final String tipoDocumento, final String numDocumento)
	{
		this.tipoDocumento = tipoDocumento;
		this.numDocumento = numDocumento;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ProveedorPk)) {
			return false;
		}
		
		final ProveedorPk _cast = (ProveedorPk) _other;
		if (tipoDocumento == null ? _cast.tipoDocumento != tipoDocumento : !tipoDocumento.equals( _cast.tipoDocumento )) {
			return false;
		}
		
		if (numDocumento == null ? _cast.numDocumento != numDocumento : !numDocumento.equals( _cast.numDocumento )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (tipoDocumento != null) {
			_hashCode = 29 * _hashCode + tipoDocumento.hashCode();
		}
		
		if (numDocumento != null) {
			_hashCode = 29 * _hashCode + numDocumento.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.ProveedorPk: " );
		ret.append( "tipoDocumento=" + tipoDocumento );
		ret.append( ", numDocumento=" + numDocumento );
		return ret.toString();
	}

}
