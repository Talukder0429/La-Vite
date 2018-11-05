package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queryhelper.Field;

/**
 * Servlet implementation class ClientProfileServlet
 */
@WebServlet("/ClientProfile")
public class ClientProfileServlet extends FormServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientProfileServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.clearFields();
		
		//set table to be used here
		super.setTableName(Field.TABLE_CLIENT_PROFILE);
		
		// TODO
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////        NEW FIELDS GO HERE                                         /////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		this.addField(Field.UNIQUE_IDENTIFIER);
		this.addField(Field.UNIQUE_IDENTIFIER_VALUE);
		this.addField(Field.DATE_OF_BIRTH);
		this.addField(Field.PHONE_NUMBER);
		this.addField(Field.HAS_EMAIL_ADDRESS);
		this.addField(Field.EMAIL_ADDRESS);
		this.addField(Field.STREET_NUMBER);
		this.addField(Field.STREET_NAME);
		this.addField(Field.STREET_TYPE);
		this.addField(Field.STREET_DIRECTION);
		this.addField(Field.UNIT);
		this.addField(Field.CITY);
		this.addField(Field.PROVINCE);
		this.addField(Field.POSTAL_CODE);
		this.addField(Field.OFFICIAL_LANGUAGE_OF_PREFERENCE);
		this.addField(Field.HAS_CONSENT_FOR_FUTURE_RESEARCH_OR_CONSULTATION);
		
		//this does all the work
		super.doPost(request, response);
	}
}
