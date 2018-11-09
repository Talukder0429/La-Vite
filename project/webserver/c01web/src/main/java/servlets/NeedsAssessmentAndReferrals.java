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
@WebServlet("/NeedsAssessmentAndReferrals")
public class NeedsAssessmentAndReferrals extends FormServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NeedsAssessmentAndReferrals() {
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
		super.setTableName(Field.TABLE_NEEDS_ASSESSMENT_AND_REFERRALS);
		
		// TODO
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////        NEW FIELDS GO HERE                                         /////////
		//////////////////////////////////////////////////////////////////////////////////////////////////////////
		this.addField(Field.UPDATE_RECORD_ID);
		this.addField(Field.UNIQUE_IDENTIFIER);
		this.addField(Field.UNIQUE_IDENTIFIER_VALUE);
		this.addField(Field.DATE_OF_BIRTH_YYYY_MM_DD);
		this.addField(Field.POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
		this.addField(Field.START_DATE_OF_ASSESSMENT_YYYY_MM_DD);
		this.addField(Field.LANGUAGE_OF_SERVICE);
		this.addField(Field.OFFICIAL_LANGUAGE_OF_PREFERENCE);
		this.addField(Field.TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
		this.addField(Field.REFERRED_BY);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA);
		this.addField(Field.INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS);
		this.addField(Field.INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS);
		this.addField(Field.INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS);
		this.addField(Field.INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS);
		this.addField(Field.INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS);
		this.addField(Field.INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES);
		this.addField(Field.INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS);
		this.addField(Field.INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT);
		this.addField(Field.INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS);
		this.addField(Field.IMPROVE_LANGUAGE_SKILLS);
		this.addField(Field.IMPROVE_LANGUAGE_SKILLS_REFERRALS);
		this.addField(Field.IMPROVE_LANGUAGE_SKILLS_TO);
		this.addField(Field.IMPROVE_OTHER_SKILLS);
		this.addField(Field.IMPROVE_OTHER_SKILLS_REFERRALS);
		this.addField(Field.IMPROVE_OTHER_SKILLS_TO);
		this.addField(Field.FIND_EMPLOYMENT);
		this.addField(Field.FIND_EMPLOYMENT_REFERRALS);
		this.addField(Field.FIND_EMPLOYMENT_TIMEFRAME);
		this.addField(Field.FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE);
		this.addField(Field.FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL);
		this.addField(Field.FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA);
		this.addField(Field.CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN);
		this.addField(Field.SUPPORT_SERVICES_MAY_BE_REQUIRED);
		this.addField(Field.CARE_FOR_NEWCOMER_CHILDREN_ADULT);
		this.addField(Field.TRANSPORTATION_ADULT);
		this.addField(Field.PROVISIONS_FOR_DISABILITIES_ADULT);
		this.addField(Field.TRANSLATION_ADULT);
		this.addField(Field.INTERPRETATION_ADULT);
		this.addField(Field.CRISIS_COUNSELLING_ADULT);
		this.addField(Field.NON_IRCC_PROGRAM_SERVICES_NEEDED);
		this.addField(Field.FOOD_CLOTHING_OTHER_MATERIAL_NEEDS);
		this.addField(Field.FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS);
		this.addField(Field.HOUSING_ACCOMMODATION);
		this.addField(Field.HOUSING_ACCOMMODATION_REFERRALS);
		this.addField(Field.HEALTH_MENTAL_HEALTH_WELL_BEING);
		this.addField(Field.HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS);
		this.addField(Field.FINANCIAL);
		this.addField(Field.FINANCIAL_REFERRALS);
		this.addField(Field.FAMILY_SUPPORT);
		this.addField(Field.FAMILY_SUPPORT_REFERRALS);
		this.addField(Field.LANGUAGE_NON_IRCC);
		this.addField(Field.LANGUAGE_NON_IRCC_REFERRALS);
		this.addField(Field.EDUCATION_SKILLS_DEVELOPMENT);
		this.addField(Field.EDUCATION_SKILLS_DEVELOPMENT_REFERRALS);
		this.addField(Field.EMPLOYMENT_RELATED);
		this.addField(Field.EMPLOYMENT_RELATED_REFERRALS);
		this.addField(Field.LEGAL_INFORMATION_AND_SERVICES);
		this.addField(Field.LEGAL_INFORMATION_AND_SERVICES_REFERRALS);
		this.addField(Field.COMMUNITY_SERVICES);
		this.addField(Field.COMMUNITY_SERVICES_REFERRALS);
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
		this.addField(Field.SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT);
		this.addField(Field.END_DATE_OF_ASSESSMENT_YYYY_MM_DD);
		this.addField(Field.REASON_FOR_UPDATE);
		
		//this does all the work
		super.doPost(request, response);
	}
}
