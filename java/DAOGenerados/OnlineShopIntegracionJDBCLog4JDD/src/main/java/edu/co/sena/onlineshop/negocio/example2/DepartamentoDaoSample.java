/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.negocio.example2;

import edu.co.sena.onlineshop.negocio.example.*;
import java.math.*;
import java.util.Date;
import java.util.Collection;
import edu.co.sena.onlineshop.integracion.dao.DepartamentoDao;
import edu.co.sena.onlineshop.integracion.dto.Departamento;
import edu.co.sena.onlineshop.integracion.exceptions.DepartamentoDaoException;
import edu.co.sena.onlineshop.integracion.factory.DepartamentoDaoFactory;

public class DepartamentoDaoSample
{
	/**
	 * Method 'main'
	 * 
	 * @param arg
	 * @throws Exception
	 */
	public static void main(String[] arg) throws Exception
	{
		// Uncomment one of the lines below to test the generated code
		
		// findAll();
		// findWhereIdDEPARTAMENTOEquals(0);
		// findWhereNombreDepartamentoEquals("");
	}

	/**
	 * Method 'findAll'
	 * 
	 */
	public static void findAll()
	{
		try {
			DepartamentoDao _dao = getDepartamentoDao();
			Departamento _result[] = _dao.findAll();
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereIdDEPARTAMENTOEquals'
	 * 
	 * @param idDEPARTAMENTO
	 */
	public static void findWhereIdDEPARTAMENTOEquals(int idDEPARTAMENTO)
	{
		try {
			DepartamentoDao _dao = getDepartamentoDao();
			Departamento _result[] = _dao.findWhereIdDEPARTAMENTOEquals(idDEPARTAMENTO);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'findWhereNombreDepartamentoEquals'
	 * 
	 * @param nombreDepartamento
	 */
	public static void findWhereNombreDepartamentoEquals(String nombreDepartamento)
	{
		try {
			DepartamentoDao _dao = getDepartamentoDao();
			Departamento _result[] = _dao.findWhereNombreDepartamentoEquals(nombreDepartamento);
			for (int i=0; i<_result.length; i++ ) {
				display( _result[i] );
			}
		
		}
		catch (Exception _e) {
			_e.printStackTrace();
		}
		
	}

	/**
	 * Method 'getDepartamentoDao'
	 * 
	 * @return DepartamentoDao
	 */
	public static DepartamentoDao getDepartamentoDao()
	{
		return DepartamentoDaoFactory.create();
	}

	/**
	 * Method 'display'
	 * 
	 * @param dto
	 */
	public static void display(Departamento dto)
	{
		StringBuffer buf = new StringBuffer();
		buf.append( dto.getIdDEPARTAMENTO() );
		buf.append( ", " );
		buf.append( dto.getNombreDepartamento() );
		System.out.println( buf.toString() );
	}

}
