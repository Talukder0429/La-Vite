package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queryhelper.Field;

/**
 * Servlet implementation class LanguageTrainingClientExitServlet
 */
@WebServlet("/LanguageTrainingClientExit")
public class LanguageTrainingClientExitServlet extends FormServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LanguageTrainingClientExitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.clearFields();
		//set table to be used here
		super.setTableName(Field.TABLE_LANGUAGE_TRAINING_CLIENT_EXIT);

		this.addField(Field.UNIQUE_IDENTIFIER);
		this.addField(Field.UNIQUE_IDENTIFIER_VALUE);
		this.addField(Field.DATE_OF_BIRTH_YYYY_MM_DD);
		this.addField(Field.COURSE_CODE);
		this.addField(Field.CLIENTS_TRAINING_STATUS);
		this.addField(Field.DATE_CLIENT_EXITED_COURSE_YYYY_MM_DD);
		this.addField(Field.REASON_FOR_EXITING_COURSE);
		this.addField(Field.LISTENING_CLB_LEVEL);
		this.addField(Field.READING_CLB_LEVEL);
		this.addField(Field.SPEAKING_CLB_LEVEL);
		this.addField(Field.WRITING_CLB_LEVEL);
		//was certificate issued to client
		this.addField(Field.LISTENING_LEVEL_INDICATED_ON_CERTIFICATE);
		this.addField(Field.SPEAKING_LEVEL_INDICATED_ON_CERTIFICATE);
		this.addField(Field.SUPPORT_SERVICES_RECEIVED);
		this.addField(Field.CARE_FOR_NEWCOMER_CHILDREN);
		this.addField(Field.CHILD_1_AGE);
		this.addField(Field.CHILD_1_TYPE_OF_CARE);
		this.addField(Field.CHILD_2_AGE);
		this.addField(Field.CHILD_2_TYPE_OF_CARE);
		this.addField(Field.CHILD_3_AGE);
		this.addField(Field.CHILD_3_TYPE_OF_CARE);
		this.addField(Field.CHILD_4_AGE);
		this.addField(Field.CHILD_4_TYPE_OF_CARE);
		this.addField(Field.CHILD_5_AGE);
		this.addField(Field.CHILD_5_TYPE_OF_CARE);
		this.addField(Field.TRANSPORTATION_ADULT);
		this.addField(Field.TRANSPORTATION_CHILD);
		this.addField(Field.PROVISIONS_FOR_DISABILITIES);
		this.addField(Field.TRANSLATION);
		this.addField(Field.BETWEEN_TRANSLATION);
		this.addField(Field.AND_TRANSLATION);
		this.addField(Field.INTERPRETATION);
		this.addField(Field.BETWEEN_INTERPRETATION);
		this.addField(Field.AND_INTERPRETATION);
		this.addField(Field.CRISIS_COUNSELLING);
		this.addField(Field.REASON_FOR_UPDATE);
		
	}

}
