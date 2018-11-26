package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queryhelper.Field;

/**
 * Servlet implementation class Employment
 */
@WebServlet("/Employment")
public class EmploymentServlet extends FormServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmploymentServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		super.clearFields();
		
		//set table to be used here
		super.setTableName(Field.TABLE_EMPLOYMENT);
		
		this.addField(Field.UPDATE_RECORD_ID);
		this.addField(Field.UNIQUE_IDENTIFIER);
		this.addField(Field.UNIQUE_IDENTIFIER_VALUE);
		this.addField(Field.DATE_OF_BIRTH_YYYY_MM_DD);
		this.addField(Field.POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
		this.addField(Field.REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION);
		this.addField(Field.A_REFERRAL_TO);
		this.addField(Field.LANGUAGE_OF_SERVICE);
		this.addField(Field.OFFICIAL_LANGUAGE_OF_PREFERENCE);
		this.addField(Field.TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
		this.addField(Field.REFERRED_BY);
		this.addField(Field.REFERRAL_DATE_YYYY_MM_DD);
		this.addField(Field.EMPLOYMENT_STATUS);
		this.addField(Field.EDUCATION_STATUS);
		this.addField(Field.OCCUPATION_IN_CANADA);
		this.addField(Field.INTENDED_OCCUPATION);
		this.addField(Field.INTERVENTION_TYPE);
		this.addField(Field.LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED);
		this.addField(Field.LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION);
		this.addField(Field.LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION);
		this.addField(Field.LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD);
		this.addField(Field.LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD);
		this.addField(Field.LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER);
		this.addField(Field.LONG_TERM_INTERVENTION_PLACEMENT_WAS);
		this.addField(Field.LONG_TERM_INTERVENTION_HOURS_PER_WEEK);
		this.addField(Field.LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT);
		this.addField(Field.LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR);
		this.addField(Field.LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED);
		this.addField(Field.WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE);
		this.addField(Field.COMPUTER_SKILLS);
		this.addField(Field.DOCUMENT_USE);
		this.addField(Field.INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE);
		this.addField(Field.LEADERSHIP_TRAINING);
		this.addField(Field.NUMERACY);
		this.addField(Field.SHORT_TERM_INTERVENTION_SERVICE_RECEIVED);
		this.addField(Field.SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD);
		this.addField(Field.SUPPORT_SERVICES_RECEIVED);
		this.addField(Field.CARE_FOR_NEWCOMER_CHILDREN_CHILD);
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
		this.addField(Field.PROVISIONS_FOR_DISABILITIES_CHILD);
		this.addField(Field.TRANSLATION_CHILD);
		this.addField(Field.BETWEEN_TRANSLATION);
		this.addField(Field.AND_TRANSLATION);
		this.addField(Field.INTERPRETATION_CHILD);
		this.addField(Field.BETWEEN_INTERPRETATION);
		this.addField(Field.AND_INTERPRETATION);
		this.addField(Field.CRISIS_COUNSELLING_CHILD);
		this.addField(Field.TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS);
		this.addField(Field.TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES);
		this.addField(Field.REASON_FOR_UPDATE);

		super.doPost(request, response);
	}

}
