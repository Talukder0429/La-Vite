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
@WebServlet("/CommunityConnections")
public class CommunityConnectionsServlet extends FormServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CommunityConnectionsServlet() {
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
		super.setTableName(Field.TABLE_COMMUNITY_CONNECTIONS);
		
		// TODO
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////        NEW FIELDS GO HERE                                         /////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		this.addField(Field.UNIQUE_IDENTIFIER);
		this.addField(Field.UNIQUE_IDENTIFIER_VALUE);
		this.addField(Field.DATE_OF_BIRTH_YYYY_MM_DD);
		this.addField(Field.POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
		this.addField(Field.LANGUAGE_OF_SERVICE);
		this.addField(Field.OFFICIAL_LANGUAGE_OF_PREFERENCE);
		this.addField(Field.REFERRED_BY);
		this.addField(Field.ACTIVITY_UNDER_WHICH_CLIENT_RECEIVED_SERVICES);
		this.addField(Field.TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
		this.addField(Field.TYPE_OF_EVENT_ATTENDED);
		this.addField(Field.TYPE_OF_SERVICE);
		this.addField(Field.MAIN_TOPIC_FOCUS_OF_THE_SERVICE_RECEIVED);
		this.addField(Field.SERVICE_RECEIVED);
		this.addField(Field.NUMBER_OF_UNIQUE_PARTICIPANTS);
		this.addField(Field.DID_VOLUNTEERS_FROM_THE_HOST_COMMUNITY_PARTICIPATE_IN_THE_ACTIVITY);
		this.addField(Field.DIRECTED_AT_A_SPECIFIC_TARGET_GROUP);
		this.addField(Field.TARGET_GROUP_CHILDREN_0_14_YRS);
		this.addField(Field.TARGET_GROUP_YOUTH_15_24_YRS);
		this.addField(Field.TARGET_GROUP_SENIOR);
		this.addField(Field.TARGET_GROUP_GENDER_SPECIFIC);
		this.addField(Field.TARGET_GROUP_REFUGEES);
		this.addField(Field.TARGET_GROUP_ETHNIC_CULTURAL_LINGUISTIC_GROUP);
		this.addField(Field.TARGET_GROUP_DEAF_OR_HARD_OF_HEARING);
		this.addField(Field.TARGET_GROUP_BLIND_OR_PARTIALLY_SIGHTED);
		this.addField(Field.TARGET_GROUP_LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ);
		this.addField(Field.TARGET_GROUP_FAMILIES_PARENTS);
		this.addField(Field.TARGET_GROUP_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL);
		this.addField(Field.TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION);
		this.addField(Field.TARGET_GROUP_CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE);
		this.addField(Field.TARGET_GROUP_OFFICIAL_LANGUAGE_MINORITIES);
		this.addField(Field.STATUS_OF_SERVICE);
		this.addField(Field.REASON_FOR_LEAVING_SERVICE);
		this.addField(Field.START_DATE_YYYY_MM_DD);
		this.addField(Field.END_DATE_YYYY_MM_DD);
		this.addField(Field.PROJECTED_END_DATE_YYYY_MM_DD);
		this.addField(Field.WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE);
		this.addField(Field.COMPUTER_SKILLS);
		this.addField(Field.DOCUMENT_USE);
		this.addField(Field.INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE);
		this.addField(Field.LEADERSHIP_TRAINING);
		this.addField(Field.LIFE_SKILLS);
		this.addField(Field.NUMERACY);
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
		this.addField(Field.TRANSPORTATION_CHILD);
		this.addField(Field.PROVISIONS_FOR_DISABILITIES_CHILD);
		this.addField(Field.TRANSLATION_CHILD);
		this.addField(Field.BETWEEN_TRANSLATION);
		this.addField(Field.AND_TRANSLATION);
		this.addField(Field.INTERPRETATION_CHILD);
		this.addField(Field.BETWEEN_INTERPRETATION);
		this.addField(Field.AND_INTERPRETATION);
		this.addField(Field.CRISIS_COUNSELLING_CHILD);
		this.addField(Field.TOTAL_LENGTH_OF_SERVICE_HOURS);
		this.addField(Field.TOTAL_LENGTH_OF_SERVICE_MINUTES);
		this.addField(Field.REASON_FOR_UPDATE);
		
		//this does all the work
		super.doPost(request, response);
	}
}
