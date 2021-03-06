/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dto;

import edu.co.sena.onlineshop.integracion.dao.*;
import edu.co.sena.onlineshop.integracion.factory.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class Cuenta implements Serializable
{
	/** 
	 * This attribute maps to the column PRIMER_NOMBRE in the cuenta table.
	 */
	protected String primerNombre;

	/** 
	 * This attribute represents whether the attribute primerNombre has been modified since being read from the database.
	 */
	protected boolean primerNombreModified = false;

	/** 
	 * This attribute maps to the column SEGUNDO_NOMBRE in the cuenta table.
	 */
	protected String segundoNombre;

	/** 
	 * This attribute represents whether the attribute segundoNombre has been modified since being read from the database.
	 */
	protected boolean segundoNombreModified = false;

	/** 
	 * This attribute maps to the column PRIMER_APELLIDO in the cuenta table.
	 */
	protected String primerApellido;

	/** 
	 * This attribute represents whether the attribute primerApellido has been modified since being read from the database.
	 */
	protected boolean primerApellidoModified = false;

	/** 
	 * This attribute maps to the column SEGUNDO_APELLIDO in the cuenta table.
	 */
	protected String segundoApellido;

	/** 
	 * This attribute represents whether the attribute segundoApellido has been modified since being read from the database.
	 */
	protected boolean segundoApellidoModified = false;

	/** 
	 * This attribute maps to the column TIPO_DOCUMENTO in the cuenta table.
	 */
	protected String tipoDocumento;

	/** 
	 * This attribute represents whether the attribute tipoDocumento has been modified since being read from the database.
	 */
	protected boolean tipoDocumentoModified = false;

	/** 
	 * This attribute maps to the column NUMERO_DOCUMENTO in the cuenta table.
	 */
	protected String numeroDocumento;

	/** 
	 * This attribute represents whether the attribute numeroDocumento has been modified since being read from the database.
	 */
	protected boolean numeroDocumentoModified = false;

	/** 
	 * This attribute maps to the column PASSWORD in the cuenta table.
	 */
	protected String password;

	/** 
	 * This attribute represents whether the attribute password has been modified since being read from the database.
	 */
	protected boolean passwordModified = false;

	/** 
	 * This attribute maps to the column CORREO_ELECTRONICO in the cuenta table.
	 */
	protected String correoElectronico;

	/** 
	 * This attribute represents whether the attribute correoElectronico has been modified since being read from the database.
	 */
	protected boolean correoElectronicoModified = false;

	/** 
	 * This attribute maps to the column USUARIO in the cuenta table.
	 */
	protected String usuario;

	/** 
	 * This attribute represents whether the attribute usuario has been modified since being read from the database.
	 */
	protected boolean usuarioModified = false;

	/** 
	 * This attribute maps to the column usuario_idusuario in the cuenta table.
	 */
	protected String usuarioIdusuario;

	/** 
	 * This attribute represents whether the attribute usuarioIdusuario has been modified since being read from the database.
	 */
	protected boolean usuarioIdusuarioModified = false;

	/**
	 * Method 'Cuenta'
	 * 
	 */
	public Cuenta()
	{
	}

	/**
	 * Method 'getPrimerNombre'
	 * 
	 * @return String
	 */
	public String getPrimerNombre()
	{
		return primerNombre;
	}

	/**
	 * Method 'setPrimerNombre'
	 * 
	 * @param primerNombre
	 */
	public void setPrimerNombre(String primerNombre)
	{
		this.primerNombre = primerNombre;
		this.primerNombreModified = true;
	}

	/** 
	 * Sets the value of primerNombreModified
	 */
	public void setPrimerNombreModified(boolean primerNombreModified)
	{
		this.primerNombreModified = primerNombreModified;
	}

	/** 
	 * Gets the value of primerNombreModified
	 */
	public boolean isPrimerNombreModified()
	{
		return primerNombreModified;
	}

	/**
	 * Method 'getSegundoNombre'
	 * 
	 * @return String
	 */
	public String getSegundoNombre()
	{
		return segundoNombre;
	}

	/**
	 * Method 'setSegundoNombre'
	 * 
	 * @param segundoNombre
	 */
	public void setSegundoNombre(String segundoNombre)
	{
		this.segundoNombre = segundoNombre;
		this.segundoNombreModified = true;
	}

	/** 
	 * Sets the value of segundoNombreModified
	 */
	public void setSegundoNombreModified(boolean segundoNombreModified)
	{
		this.segundoNombreModified = segundoNombreModified;
	}

	/** 
	 * Gets the value of segundoNombreModified
	 */
	public boolean isSegundoNombreModified()
	{
		return segundoNombreModified;
	}

	/**
	 * Method 'getPrimerApellido'
	 * 
	 * @return String
	 */
	public String getPrimerApellido()
	{
		return primerApellido;
	}

	/**
	 * Method 'setPrimerApellido'
	 * 
	 * @param primerApellido
	 */
	public void setPrimerApellido(String primerApellido)
	{
		this.primerApellido = primerApellido;
		this.primerApellidoModified = true;
	}

	/** 
	 * Sets the value of primerApellidoModified
	 */
	public void setPrimerApellidoModified(boolean primerApellidoModified)
	{
		this.primerApellidoModified = primerApellidoModified;
	}

	/** 
	 * Gets the value of primerApellidoModified
	 */
	public boolean isPrimerApellidoModified()
	{
		return primerApellidoModified;
	}

	/**
	 * Method 'getSegundoApellido'
	 * 
	 * @return String
	 */
	public String getSegundoApellido()
	{
		return segundoApellido;
	}

	/**
	 * Method 'setSegundoApellido'
	 * 
	 * @param segundoApellido
	 */
	public void setSegundoApellido(String segundoApellido)
	{
		this.segundoApellido = segundoApellido;
		this.segundoApellidoModified = true;
	}

	/** 
	 * Sets the value of segundoApellidoModified
	 */
	public void setSegundoApellidoModified(boolean segundoApellidoModified)
	{
		this.segundoApellidoModified = segundoApellidoModified;
	}

	/** 
	 * Gets the value of segundoApellidoModified
	 */
	public boolean isSegundoApellidoModified()
	{
		return segundoApellidoModified;
	}

	/**
	 * Method 'getTipoDocumento'
	 * 
	 * @return String
	 */
	public String getTipoDocumento()
	{
		return tipoDocumento;
	}

	/**
	 * Method 'setTipoDocumento'
	 * 
	 * @param tipoDocumento
	 */
	public void setTipoDocumento(String tipoDocumento)
	{
		this.tipoDocumento = tipoDocumento;
		this.tipoDocumentoModified = true;
	}

	/** 
	 * Sets the value of tipoDocumentoModified
	 */
	public void setTipoDocumentoModified(boolean tipoDocumentoModified)
	{
		this.tipoDocumentoModified = tipoDocumentoModified;
	}

	/** 
	 * Gets the value of tipoDocumentoModified
	 */
	public boolean isTipoDocumentoModified()
	{
		return tipoDocumentoModified;
	}

	/**
	 * Method 'getNumeroDocumento'
	 * 
	 * @return String
	 */
	public String getNumeroDocumento()
	{
		return numeroDocumento;
	}

	/**
	 * Method 'setNumeroDocumento'
	 * 
	 * @param numeroDocumento
	 */
	public void setNumeroDocumento(String numeroDocumento)
	{
		this.numeroDocumento = numeroDocumento;
		this.numeroDocumentoModified = true;
	}

	/** 
	 * Sets the value of numeroDocumentoModified
	 */
	public void setNumeroDocumentoModified(boolean numeroDocumentoModified)
	{
		this.numeroDocumentoModified = numeroDocumentoModified;
	}

	/** 
	 * Gets the value of numeroDocumentoModified
	 */
	public boolean isNumeroDocumentoModified()
	{
		return numeroDocumentoModified;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
		this.passwordModified = true;
	}

	/** 
	 * Sets the value of passwordModified
	 */
	public void setPasswordModified(boolean passwordModified)
	{
		this.passwordModified = passwordModified;
	}

	/** 
	 * Gets the value of passwordModified
	 */
	public boolean isPasswordModified()
	{
		return passwordModified;
	}

	/**
	 * Method 'getCorreoElectronico'
	 * 
	 * @return String
	 */
	public String getCorreoElectronico()
	{
		return correoElectronico;
	}

	/**
	 * Method 'setCorreoElectronico'
	 * 
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico)
	{
		this.correoElectronico = correoElectronico;
		this.correoElectronicoModified = true;
	}

	/** 
	 * Sets the value of correoElectronicoModified
	 */
	public void setCorreoElectronicoModified(boolean correoElectronicoModified)
	{
		this.correoElectronicoModified = correoElectronicoModified;
	}

	/** 
	 * Gets the value of correoElectronicoModified
	 */
	public boolean isCorreoElectronicoModified()
	{
		return correoElectronicoModified;
	}

	/**
	 * Method 'getUsuario'
	 * 
	 * @return String
	 */
	public String getUsuario()
	{
		return usuario;
	}

	/**
	 * Method 'setUsuario'
	 * 
	 * @param usuario
	 */
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
		this.usuarioModified = true;
	}

	/** 
	 * Sets the value of usuarioModified
	 */
	public void setUsuarioModified(boolean usuarioModified)
	{
		this.usuarioModified = usuarioModified;
	}

	/** 
	 * Gets the value of usuarioModified
	 */
	public boolean isUsuarioModified()
	{
		return usuarioModified;
	}

	/**
	 * Method 'getUsuarioIdusuario'
	 * 
	 * @return String
	 */
	public String getUsuarioIdusuario()
	{
		return usuarioIdusuario;
	}

	/**
	 * Method 'setUsuarioIdusuario'
	 * 
	 * @param usuarioIdusuario
	 */
	public void setUsuarioIdusuario(String usuarioIdusuario)
	{
		this.usuarioIdusuario = usuarioIdusuario;
		this.usuarioIdusuarioModified = true;
	}

	/** 
	 * Sets the value of usuarioIdusuarioModified
	 */
	public void setUsuarioIdusuarioModified(boolean usuarioIdusuarioModified)
	{
		this.usuarioIdusuarioModified = usuarioIdusuarioModified;
	}

	/** 
	 * Gets the value of usuarioIdusuarioModified
	 */
	public boolean isUsuarioIdusuarioModified()
	{
		return usuarioIdusuarioModified;
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
		
		if (!(_other instanceof Cuenta)) {
			return false;
		}
		
		final Cuenta _cast = (Cuenta) _other;
		if (primerNombre == null ? _cast.primerNombre != primerNombre : !primerNombre.equals( _cast.primerNombre )) {
			return false;
		}
		
		if (primerNombreModified != _cast.primerNombreModified) {
			return false;
		}
		
		if (segundoNombre == null ? _cast.segundoNombre != segundoNombre : !segundoNombre.equals( _cast.segundoNombre )) {
			return false;
		}
		
		if (segundoNombreModified != _cast.segundoNombreModified) {
			return false;
		}
		
		if (primerApellido == null ? _cast.primerApellido != primerApellido : !primerApellido.equals( _cast.primerApellido )) {
			return false;
		}
		
		if (primerApellidoModified != _cast.primerApellidoModified) {
			return false;
		}
		
		if (segundoApellido == null ? _cast.segundoApellido != segundoApellido : !segundoApellido.equals( _cast.segundoApellido )) {
			return false;
		}
		
		if (segundoApellidoModified != _cast.segundoApellidoModified) {
			return false;
		}
		
		if (tipoDocumento == null ? _cast.tipoDocumento != tipoDocumento : !tipoDocumento.equals( _cast.tipoDocumento )) {
			return false;
		}
		
		if (tipoDocumentoModified != _cast.tipoDocumentoModified) {
			return false;
		}
		
		if (numeroDocumento == null ? _cast.numeroDocumento != numeroDocumento : !numeroDocumento.equals( _cast.numeroDocumento )) {
			return false;
		}
		
		if (numeroDocumentoModified != _cast.numeroDocumentoModified) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (passwordModified != _cast.passwordModified) {
			return false;
		}
		
		if (correoElectronico == null ? _cast.correoElectronico != correoElectronico : !correoElectronico.equals( _cast.correoElectronico )) {
			return false;
		}
		
		if (correoElectronicoModified != _cast.correoElectronicoModified) {
			return false;
		}
		
		if (usuario == null ? _cast.usuario != usuario : !usuario.equals( _cast.usuario )) {
			return false;
		}
		
		if (usuarioModified != _cast.usuarioModified) {
			return false;
		}
		
		if (usuarioIdusuario == null ? _cast.usuarioIdusuario != usuarioIdusuario : !usuarioIdusuario.equals( _cast.usuarioIdusuario )) {
			return false;
		}
		
		if (usuarioIdusuarioModified != _cast.usuarioIdusuarioModified) {
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
		if (primerNombre != null) {
			_hashCode = 29 * _hashCode + primerNombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (primerNombreModified ? 1 : 0);
		if (segundoNombre != null) {
			_hashCode = 29 * _hashCode + segundoNombre.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (segundoNombreModified ? 1 : 0);
		if (primerApellido != null) {
			_hashCode = 29 * _hashCode + primerApellido.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (primerApellidoModified ? 1 : 0);
		if (segundoApellido != null) {
			_hashCode = 29 * _hashCode + segundoApellido.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (segundoApellidoModified ? 1 : 0);
		if (tipoDocumento != null) {
			_hashCode = 29 * _hashCode + tipoDocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (tipoDocumentoModified ? 1 : 0);
		if (numeroDocumento != null) {
			_hashCode = 29 * _hashCode + numeroDocumento.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (numeroDocumentoModified ? 1 : 0);
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (passwordModified ? 1 : 0);
		if (correoElectronico != null) {
			_hashCode = 29 * _hashCode + correoElectronico.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (correoElectronicoModified ? 1 : 0);
		if (usuario != null) {
			_hashCode = 29 * _hashCode + usuario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (usuarioModified ? 1 : 0);
		if (usuarioIdusuario != null) {
			_hashCode = 29 * _hashCode + usuarioIdusuario.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (usuarioIdusuarioModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CuentaPk
	 */
	public CuentaPk createPk()
	{
		return new CuentaPk(numeroDocumento, tipoDocumento);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "edu.co.sena.onlineshop.integracion.dto.Cuenta: " );
		ret.append( "primerNombre=" + primerNombre );
		ret.append( ", segundoNombre=" + segundoNombre );
		ret.append( ", primerApellido=" + primerApellido );
		ret.append( ", segundoApellido=" + segundoApellido );
		ret.append( ", tipoDocumento=" + tipoDocumento );
		ret.append( ", numeroDocumento=" + numeroDocumento );
		ret.append( ", password=" + password );
		ret.append( ", correoElectronico=" + correoElectronico );
		ret.append( ", usuario=" + usuario );
		ret.append( ", usuarioIdusuario=" + usuarioIdusuario );
		return ret.toString();
	}

}
