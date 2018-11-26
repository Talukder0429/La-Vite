package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.DbConnectionHelper;
import helpers.DbSelectHelper;
import helpers.HttpServletRequestHelper;
import queryhelper.Field;
import queryhelper.Row;

/**
 * Servlet implementation class Reports
 */
@WebServlet("/Reports")
public class Reports extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DbConnectionHelper dbHelper;
	
	private List<String> clientFields = new ArrayList<String>();
	private List<String> needsFields = new ArrayList<String>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reports() {
        super();
        
        try
		{
			dbHelper = new DbConnectionHelper();
			dbHelper.findDatabaseInfo();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
        this.buildTableFields();
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
		try (
				Connection conn = this.dbHelper.connect();
			)
		{
			HttpServletRequestHelper helper = new HttpServletRequestHelper(request);
			Row row = new Row();
			
			this.addFieldFromRequest(row, Field.PHONE_NUMBER, helper);
			this.addFieldFromRequest(row, Field.DOES_THE_CLIENT_HAVE_AN_EMAIL_ADDRESS, helper);
			this.addFieldFromRequest(row, Field.EMAIL_ADDRESS, helper);
			this.addFieldFromRequest(row, Field.STREET_NUMBER, helper);
			this.addFieldFromRequest(row, Field.STREET_NAME, helper);
			this.addFieldFromRequest(row, Field.STREET_TYPE, helper);
			this.addFieldFromRequest(row, Field.STREET_DIRECTION, helper);
			this.addFieldFromRequest(row, Field.UNIT_SUITE_APT, helper);
			this.addFieldFromRequest(row, Field.CITY, helper);
			this.addFieldFromRequest(row, Field.PROVINCE, helper);
			this.addFieldFromRequest(row, Field.POSTAL_CODE, helper);
			this.addFieldFromRequest(row, Field.CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION, helper);
			
			this.addFieldFromRequest(row, Field.POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED, helper);
			this.addFieldFromRequest(row, Field.START_DATE_OF_ASSESSMENT_YYYY_MM_DD, helper);
			this.addFieldFromRequest(row, Field.LANGUAGE_OF_SERVICE, helper);
			this.addFieldFromRequest(row, Field.TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES, helper);
			this.addFieldFromRequest(row, Field.REFERRED_BY, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA, helper);
			this.addFieldFromRequest(row, Field.INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT, helper);
			this.addFieldFromRequest(row, Field.INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.IMPROVE_LANGUAGE_SKILLS, helper);
			this.addFieldFromRequest(row, Field.IMPROVE_LANGUAGE_SKILLS_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.IMPROVE_LANGUAGE_SKILLS_TO, helper);
			this.addFieldFromRequest(row, Field.IMPROVE_OTHER_SKILLS, helper);
			this.addFieldFromRequest(row, Field.IMPROVE_OTHER_SKILLS_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.IMPROVE_OTHER_SKILLS_TO, helper);
			this.addFieldFromRequest(row, Field.FIND_EMPLOYMENT, helper);
			this.addFieldFromRequest(row, Field.FIND_EMPLOYMENT_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.FIND_EMPLOYMENT_TIMEFRAME, helper);
			this.addFieldFromRequest(row, Field.FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE, helper);
			this.addFieldFromRequest(row, Field.FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL, helper);
			this.addFieldFromRequest(row, Field.FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA, helper);
			this.addFieldFromRequest(row, Field.CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN, helper);
			this.addFieldFromRequest(row, Field.SUPPORT_SERVICES_MAY_BE_REQUIRED, helper);
			this.addFieldFromRequest(row, Field.CARE_FOR_NEWCOMER_CHILDREN_ADULT, helper);
			this.addFieldFromRequest(row, Field.TRANSPORTATION_ADULT, helper);
			this.addFieldFromRequest(row, Field.PROVISIONS_FOR_DISABILITIES_ADULT, helper);
			this.addFieldFromRequest(row, Field.TRANSLATION_ADULT, helper);
			this.addFieldFromRequest(row, Field.INTERPRETATION_ADULT, helper);
			this.addFieldFromRequest(row, Field.CRISIS_COUNSELLING_ADULT, helper);
			this.addFieldFromRequest(row, Field.NON_IRCC_PROGRAM_SERVICES_NEEDED, helper);
			this.addFieldFromRequest(row, Field.FOOD_CLOTHING_OTHER_MATERIAL_NEEDS, helper);
			this.addFieldFromRequest(row, Field.FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.HOUSING_ACCOMMODATION, helper);
			this.addFieldFromRequest(row, Field.HOUSING_ACCOMMODATION_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.HEALTH_MENTAL_HEALTH_WELL_BEING, helper);
			this.addFieldFromRequest(row, Field.HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.FINANCIAL, helper);
			this.addFieldFromRequest(row, Field.FINANCIAL_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.FAMILY_SUPPORT, helper);
			this.addFieldFromRequest(row, Field.FAMILY_SUPPORT_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.LANGUAGE_NON_IRCC, helper);
			this.addFieldFromRequest(row, Field.LANGUAGE_NON_IRCC_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.EDUCATION_SKILLS_DEVELOPMENT, helper);
			this.addFieldFromRequest(row, Field.EDUCATION_SKILLS_DEVELOPMENT_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.EMPLOYMENT_RELATED, helper);
			this.addFieldFromRequest(row, Field.EMPLOYMENT_RELATED_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.LEGAL_INFORMATION_AND_SERVICES, helper);
			this.addFieldFromRequest(row, Field.LEGAL_INFORMATION_AND_SERVICES_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.COMMUNITY_SERVICES, helper);
			this.addFieldFromRequest(row, Field.COMMUNITY_SERVICES_REFERRALS, helper);
			this.addFieldFromRequest(row, Field.SUPPORT_SERVICES_RECEIVED, helper);
			this.addFieldFromRequest(row, Field.CARE_FOR_NEWCOMER_CHILDREN_CHILD, helper);
			this.addFieldFromRequest(row, Field.CHILD_1_AGE, helper);
			this.addFieldFromRequest(row, Field.CHILD_1_TYPE_OF_CARE, helper);
			this.addFieldFromRequest(row, Field.CHILD_2_AGE, helper);
			this.addFieldFromRequest(row, Field.CHILD_2_TYPE_OF_CARE, helper);
			this.addFieldFromRequest(row, Field.CHILD_3_AGE, helper);
			this.addFieldFromRequest(row, Field.CHILD_3_TYPE_OF_CARE, helper);
			this.addFieldFromRequest(row, Field.CHILD_4_AGE, helper);
			this.addFieldFromRequest(row, Field.CHILD_4_TYPE_OF_CARE, helper);
			this.addFieldFromRequest(row, Field.CHILD_5_AGE, helper);
			this.addFieldFromRequest(row, Field.CHILD_5_TYPE_OF_CARE, helper);
			this.addFieldFromRequest(row, Field.TRANSPORTATION_CHILD, helper);
			this.addFieldFromRequest(row, Field.PROVISIONS_FOR_DISABILITIES_CHILD, helper);
			this.addFieldFromRequest(row, Field.TRANSLATION_CHILD, helper);
			this.addFieldFromRequest(row, Field.BETWEEN_TRANSLATION, helper);
			this.addFieldFromRequest(row, Field.AND_TRANSLATION, helper);
			this.addFieldFromRequest(row, Field.INTERPRETATION_CHILD, helper);
			this.addFieldFromRequest(row, Field.BETWEEN_INTERPRETATION, helper);
			this.addFieldFromRequest(row, Field.AND_INTERPRETATION, helper);
			this.addFieldFromRequest(row, Field.CRISIS_COUNSELLING_CHILD, helper);
			this.addFieldFromRequest(row, Field.SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT, helper);
			this.addFieldFromRequest(row, Field.END_DATE_OF_ASSESSMENT_YYYY_MM_DD, helper);
			this.addFieldFromRequest(row, Field.REASON_FOR_UPDATE, helper);
			
			DbSelectHelper client = new DbSelectHelper(conn, Field.TABLE_CLIENT_PROFILE);
			DbSelectHelper needs = new DbSelectHelper(conn, Field.TABLE_NEEDS_ASSESSMENT_AND_REFERRALS);
			String countString = "COUNT(*)";
			client.addResultField(countString);
			needs.addResultField(countString);
			boolean isClient = false;
			boolean isNeeds = false;
			
			for (String field : row.getFields().keySet())
			{
				String value = row.getValue(field);
				if (value != null && value != "")
				{
					if (this.clientFields.contains(field)) //in client profile
					{
						isClient = true;
						client.addConditionField(field, value);
					}
					else if (this.needsFields.contains(field)) //in needs assessment and referrals
					{
						isNeeds = true;
						needs.addConditionField(field, value);
					}
				}
			}
			
			List<Row> rows = null;;
			if (isClient)
			{
				client.retrieveRows();
				rows = client.getRows();
			}
			if (isNeeds)
			{
				needs.retrieveRows();
				rows = needs.getRows();
			}
			
			if (!isClient && !isNeeds)
			{
				response.setStatus(HttpServletResponse.SC_CONFLICT);
				response.getOutputStream().println("no fields selected");
			}
			else
			{
				if (rows.size() == 0)
				{
					response.setStatus(HttpServletResponse.SC_CONFLICT);
					response.getOutputStream().println("an unknown error occured");
				}
				else
				{
					Row r = rows.get(0);
					String countStr = r.getValue(countString);
					if (countStr == null || countStr == "")
					{
						response.setStatus(HttpServletResponse.SC_CONFLICT);
						response.getOutputStream().println("an unknown error occured");
					}
					else
					{
						response.setStatus(HttpServletResponse.SC_OK);
						response.getOutputStream().println(String.format("Results: %s", countStr));
					}
				}
			}
		}
		catch (SQLException e)
		{
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			response.getOutputStream().println(e.getMessage());
		}
		this.dbHelper.close();
	}
	
	private void addFieldFromRequest(Row row, String field, HttpServletRequestHelper h)
	{
		String value = h.getParam(field);
		row.setField(field, value);
	}
	
	private void buildTableFields()
	{
		this.clientFields.clear();
		this.needsFields.clear();
		
		this.clientFields.add(Field.PHONE_NUMBER);
		this.clientFields.add(Field.DOES_THE_CLIENT_HAVE_AN_EMAIL_ADDRESS);
		this.clientFields.add(Field.EMAIL_ADDRESS);
		this.clientFields.add(Field.STREET_NUMBER);
		this.clientFields.add(Field.STREET_NAME);
		this.clientFields.add(Field.STREET_TYPE);
		this.clientFields.add(Field.STREET_DIRECTION);
		this.clientFields.add(Field.UNIT_SUITE_APT);
		this.clientFields.add(Field.CITY);
		this.clientFields.add(Field.PROVINCE);
		this.clientFields.add(Field.POSTAL_CODE);
		this.clientFields.add(Field.CONSENT_FOR_FUTURE_RESEARCH_CONSULTATION);

		this.needsFields.add(Field.POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED);
		this.needsFields.add(Field.START_DATE_OF_ASSESSMENT_YYYY_MM_DD);
		this.needsFields.add(Field.LANGUAGE_OF_SERVICE);
		this.needsFields.add(Field.TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES);
		this.needsFields.add(Field.REFERRED_BY);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_LIFE_IN_CANADA_REFERRALS);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_COMMUNITY_AND_GOVERNMENT_SERVICES_REFERRALS);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_WORKING_IN_CANADA_REFERRALS);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA);
		this.needsFields.add(Field.INCREASE_KNOWLEDGE_OF_EDUCATION_IN_CANADA_REFERRALS);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_SOCIAL_NETWORKS_REFERRALS);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_PROFESSIONAL_NETWORKS_REFERRALS);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_ACCESS_TO_LOCAL_COMMUNITY_SERVICES_REFERRALS);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT);
		this.needsFields.add(Field.INCREASE_THE_FOLLOWING_LEVEL_OF_COMMUNITY_INVOLVEMENT_REFERRALS);
		this.needsFields.add(Field.IMPROVE_LANGUAGE_SKILLS);
		this.needsFields.add(Field.IMPROVE_LANGUAGE_SKILLS_REFERRALS);
		this.needsFields.add(Field.IMPROVE_LANGUAGE_SKILLS_TO);
		this.needsFields.add(Field.IMPROVE_OTHER_SKILLS);
		this.needsFields.add(Field.IMPROVE_OTHER_SKILLS_REFERRALS);
		this.needsFields.add(Field.IMPROVE_OTHER_SKILLS_TO);
		this.needsFields.add(Field.FIND_EMPLOYMENT);
		this.needsFields.add(Field.FIND_EMPLOYMENT_REFERRALS);
		this.needsFields.add(Field.FIND_EMPLOYMENT_TIMEFRAME);
		this.needsFields.add(Field.FIND_EMPLOYMENT_MINIMUM_ONE_YEARS_WORK_EXPERIENCE);
		this.needsFields.add(Field.FIND_EMPLOYMENT_INTENDS_TO_WORK_IN_AN_OCCUPATION_CORRESPONDING_TO_WHICH_NATIONAL_OCCUPATION_CLASSIFICATION_SKILL_LEVEL);
		this.needsFields.add(Field.FIND_EMPLOYMENT_INTENDS_TO_OBTAIN_CREDENTIAL_RECOGNITION_OR_OBTAIN_LICENSE_TO_WORK_IN_CANADA);
		this.needsFields.add(Field.CLIENT_INTENDS_TO_BECOME_A_CANADIAN_CITIZEN);
		this.needsFields.add(Field.SUPPORT_SERVICES_MAY_BE_REQUIRED);
		this.needsFields.add(Field.CARE_FOR_NEWCOMER_CHILDREN_ADULT);
		this.needsFields.add(Field.TRANSPORTATION_ADULT);
		this.needsFields.add(Field.PROVISIONS_FOR_DISABILITIES_ADULT);
		this.needsFields.add(Field.TRANSLATION_ADULT);
		this.needsFields.add(Field.INTERPRETATION_ADULT);
		this.needsFields.add(Field.CRISIS_COUNSELLING_ADULT);
		this.needsFields.add(Field.NON_IRCC_PROGRAM_SERVICES_NEEDED);
		this.needsFields.add(Field.FOOD_CLOTHING_OTHER_MATERIAL_NEEDS);
		this.needsFields.add(Field.FOOD_CLOTHING_OTHER_MATERIAL_NEEDS_REFERRALS);
		this.needsFields.add(Field.HOUSING_ACCOMMODATION);
		this.needsFields.add(Field.HOUSING_ACCOMMODATION_REFERRALS);
		this.needsFields.add(Field.HEALTH_MENTAL_HEALTH_WELL_BEING);
		this.needsFields.add(Field.HEALTH_MENTAL_HEALTH_WELL_BEING_REFERRALS);
		this.needsFields.add(Field.FINANCIAL);
		this.needsFields.add(Field.FINANCIAL_REFERRALS);
		this.needsFields.add(Field.FAMILY_SUPPORT);
		this.needsFields.add(Field.FAMILY_SUPPORT_REFERRALS);
		this.needsFields.add(Field.LANGUAGE_NON_IRCC);
		this.needsFields.add(Field.LANGUAGE_NON_IRCC_REFERRALS);
		this.needsFields.add(Field.EDUCATION_SKILLS_DEVELOPMENT);
		this.needsFields.add(Field.EDUCATION_SKILLS_DEVELOPMENT_REFERRALS);
		this.needsFields.add(Field.EMPLOYMENT_RELATED);
		this.needsFields.add(Field.EMPLOYMENT_RELATED_REFERRALS);
		this.needsFields.add(Field.LEGAL_INFORMATION_AND_SERVICES);
		this.needsFields.add(Field.LEGAL_INFORMATION_AND_SERVICES_REFERRALS);
		this.needsFields.add(Field.COMMUNITY_SERVICES);
		this.needsFields.add(Field.COMMUNITY_SERVICES_REFERRALS);
		this.needsFields.add(Field.SUPPORT_SERVICES_RECEIVED);
		this.needsFields.add(Field.CARE_FOR_NEWCOMER_CHILDREN_CHILD);
		this.needsFields.add(Field.CHILD_1_AGE);
		this.needsFields.add(Field.CHILD_1_TYPE_OF_CARE);
		this.needsFields.add(Field.CHILD_2_AGE);
		this.needsFields.add(Field.CHILD_2_TYPE_OF_CARE);
		this.needsFields.add(Field.CHILD_3_AGE);
		this.needsFields.add(Field.CHILD_3_TYPE_OF_CARE);
		this.needsFields.add(Field.CHILD_4_AGE);
		this.needsFields.add(Field.CHILD_4_TYPE_OF_CARE);
		this.needsFields.add(Field.CHILD_5_AGE);
		this.needsFields.add(Field.CHILD_5_TYPE_OF_CARE);
		this.needsFields.add(Field.TRANSPORTATION_CHILD);
		this.needsFields.add(Field.PROVISIONS_FOR_DISABILITIES_CHILD);
		this.needsFields.add(Field.TRANSLATION_CHILD);
		this.needsFields.add(Field.BETWEEN_TRANSLATION);
		this.needsFields.add(Field.AND_TRANSLATION);
		this.needsFields.add(Field.INTERPRETATION_CHILD);
		this.needsFields.add(Field.BETWEEN_INTERPRETATION);
		this.needsFields.add(Field.AND_INTERPRETATION);
		this.needsFields.add(Field.CRISIS_COUNSELLING_CHILD);
		this.needsFields.add(Field.SETTLEMENT_PLAN_COMPLETED_AND_SHARED_WITH_CLIENT);
		this.needsFields.add(Field.END_DATE_OF_ASSESSMENT_YYYY_MM_DD);
		this.needsFields.add(Field.REASON_FOR_UPDATE);
	}

}
