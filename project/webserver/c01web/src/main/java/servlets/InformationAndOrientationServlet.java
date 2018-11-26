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
@WebServlet("/InformationAndOrientation")
public class InformationAndOrientationServlet extends FormServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InformationAndOrientationServlet() {
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
		super.setTableName(Field.TABLE_INFORMATION_AND_ORIENTATION);
		

		this.addField(Field.UPDATE_RECORD_ID);
		this.addField(Field.UNIQUE_IDENTIFIER);
		this.addField(Field.UNIQUE_IDENTIFIER_VALUE);
		this.addField(Field.DATE_OF_BIRTH_YYYY_MM_DD);
		this.addField(Field.POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
		this.addField(Field.START_DATE_OF_SERVICE_YYYY_MM_DD);
		this.addField(Field.LANGUAGE_OF_SERVICE);
		this.addField(Field.OFFICIAL_LANGUAGE_OF_PREFERENCE);
		this.addField(Field.TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
		this.addField(Field.REFERRED_BY);
		this.addField(Field.SERVICE_RECEIVED);
		this.addField(Field.TOTAL_LENGTH_OF_ORIENTATION);
		this.addField(Field.TOTAL_LENGTH_OF_ORIENTATION_HOURS);
		this.addField(Field.TOTAL_LENGTH_OF_ORIENTATION_MINUTES);
		this.addField(Field.NUMBER_OF_CLIENTS_IN_GROUP);
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
		this.addField(Field.OVERVIEW_OF_CANADA);
		this.addField(Field.OVERVIEW_OF_CANADA_REFERRALS);
		this.addField(Field.SOURCES_OF_INFORMATION);
		this.addField(Field.SOURCES_OF_INFORMATION_REFERRALS);
		this.addField(Field.RIGHTS_AND_FREEDOMS);
		this.addField(Field.RIGHTS_AND_FREEDOMS_REFERRALS);
		this.addField(Field.CANADIAN_LAW_AND_JUSTICE);
		this.addField(Field.CANADIAN_LAW_AND_JUSTICE_REFERRALS);
		this.addField(Field.IMPORTANT_DOCUMENTS);
		this.addField(Field.IMPORTANT_DOCUMENTS_REFERRALS);
		this.addField(Field.IMPROVING_ENGLISH_OR_FRENCH);
		this.addField(Field.IMPROVING_ENGLISH_OR_FRENCH_REFERRALS);
		this.addField(Field.EMPLOYMENT_AND_INCOME);
		this.addField(Field.EMPLOYMENT_AND_INCOME_REFERRALS);
		this.addField(Field.EDUCATION);
		this.addField(Field.EDUCATION_REFERRALS);
		this.addField(Field.HOUSING);
		this.addField(Field.HOUSING_REFERRALS);
		this.addField(Field.HEALTH);
		this.addField(Field.HEALTH_REFERRALS);
		this.addField(Field.MONEY_AND_FINANCES);
		this.addField(Field.MONEY_AND_FINANCES_REFERRALS);
		this.addField(Field.TRANSPORTATION_ADULT);
		this.addField(Field.TRANSPORTATION_REFERRALS);
		this.addField(Field.COMMUNICATIONS_AND_MEDIA);
		this.addField(Field.COMMUNICATIONS_AND_MEDIA_REFERRALS);
		this.addField(Field.COMMUNITY_ENGAGEMENT);
		this.addField(Field.COMMUNITY_ENGAGEMENT_REFERRALS);
		this.addField(Field.BECOMING_A_CANADIAN_CITIZEN);
		this.addField(Field.BECOMING_A_CANADIAN_CITIZEN_REFERRALS);
		this.addField(Field.INTERPERSONAL_CONFLICT);
		this.addField(Field.INTERPERSONAL_CONFLICT_REFERRALS);
		this.addField(Field.WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE);
		this.addField(Field.COMPUTER_SKILLS);
		this.addField(Field.DOCUMENT_USE);
		this.addField(Field.INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE);
		this.addField(Field.LEADERSHIP_TRAINING);
		this.addField(Field.NUMERACY);
		this.addField(Field.WAS_LIFE_SKILLS_OR_RESPONSIBILITIES_OF_CITIZENSHIP_INFORMATION_RECEIVED_AS_PART_OF_THIS_SERVICE);
		this.addField(Field.LIFE_SKILLS);
		this.addField(Field.RIGHTS_AND_RESPONSIBILITIES_OF_CITIZENSHIP_BASED_ON_DISCOVER_CANADA);
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
		this.addField(Field.END_DATE_OF_SERVICE_YYYY_MM_DD);
		this.addField(Field.REASON_FOR_UPDATE);
		

		super.doPost(request, response);
	}
}
