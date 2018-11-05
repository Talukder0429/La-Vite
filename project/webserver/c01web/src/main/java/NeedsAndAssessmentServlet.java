
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import java.net.URLDecoder;

/**
 * Servlet implementation class needsAndAssessmentServlet
 */
@WebServlet("/needsAndAssessment")
public class NeedsAndAssessmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String dbname;
	private String dbuser;
	private String dbpass;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public NeedsAndAssessmentServlet() {
		super();
		try
		{
			String s = getClass().getName();
			int i = s.lastIndexOf(".");
			if(i > -1) s = s.substring(i + 1);
			s = s + ".class";
			System.out.println("name " +s);
			String testPath = this.getClass().getResource(s).toString();
			System.out.println(testPath);
			String realpath = URLDecoder.decode(testPath.substring(6), "UTF-8");
			System.out.println(realpath);
			
			Path p = Paths.get(realpath);
			Path folder = p.getParent();
			System.out.println(folder.toString());
			File config = new File(folder.toString() + "\\" + "dbconfig.txt");

			Scanner sc = new Scanner(config);
			dbname = sc.nextLine();
			dbuser = sc.nextLine();
			dbpass = sc.nextLine();
			sc.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try (
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/" + dbname + "?useSSL=false&allowPublicKeyRetrieval=true", dbuser,
						dbpass);
				)
		{
			
			//Gets params from request
			ArrayList<String> fields = new ArrayList<String>();
			fields.add("unique_identifier");
			fields.add("unique_identifier_value");
			fields.add("date_of_birth");
			fields.add("postal_code_where_the_service_was_recieved");
			fields.add("start_date_of_assessment");
			fields.add("language_of_service");
			fields.add("official_language_of_preference");
			fields.add("type_of_institution");
			fields.add("referred_by");
			fields.add("increase_knowledge_of_life_in_canada");
			fields.add("increase_knowledge_of_life_in_canada_referrals");
			fields.add("increase_knowledge_of_com_and_gov_services");
			fields.add("increase_knowledge_of_com_and_gov_services_referrals");
			fields.add("increase_knowledge_of_working_in_canada");
			fields.add("increase_knowledge_of_working_in_canada_referrals");
			fields.add("increase_knowledge_of_education_in_canada");
			fields.add("increase_knowledge_of_education_in_canada_referrals");
			fields.add("increase_following_social_networks");
			fields.add("increase_following_social_networks_referrals");
			fields.add("increase_following_professional_networks");
			fields.add("increase_following_professional_networks_referrals");
			fields.add("increase_following_access_to_local_community_services");
			fields.add("increase_following_access_to_local_community_services_referrals");
			fields.add("increase_following_level_of_community_involvement");
			fields.add("increase_following_level_of_community_involvement_referrals");
			fields.add("improve_language_skills");
			fields.add("improve_language_skills_referrals");
			fields.add("improve_language_skill_to");
			fields.add("improve_other_skills");
			fields.add("improve_other_skills_referrals");
			fields.add("improve_other_skills_to");
			fields.add("find_employment");
			fields.add("find_employment_referrals");
			fields.add("find_employment_timeframe");
			fields.add("find_employment_mimimum_one_year_experience");
			fields.add("find_employment_intends_occupation_NOC_skill_level");
			fields.add("find_employment_intends_credential_regonition_and_license");
			fields.add("client_intends_to_become_citizen");
			fields.add("support_services_may_be_required");
			fields.add("care_fore_newcomer_children");
			fields.add("transportation");
			fields.add("provisions_for_disabilities");
			fields.add("translation");
			fields.add("interpretation");
			fields.add("crisis_counselling");
			fields.add("non_IRRC_program_services_needed");
			fields.add("food_clothing_other_material_needs");
			fields.add("food_clothing_other_material_needs_referrals");
			fields.add("housing_accommodation");
			fields.add("housing_accommodation_referrals");
			fields.add("health_mental_health_wellbeing");
			fields.add("health_mental_health_wellbeing_referrals");
			fields.add("financial");
			fields.add("financial_referrals");
			fields.add("family_support");
			fields.add("family_support_referrals");
			fields.add("language_nonIRCC");
			fields.add("language_nonIRCC_referrals");
			fields.add("education_skills_development");
			fields.add("education_skills_development_referrals");
			fields.add("employment_related");
			fields.add("employment_related_referrals");
			fields.add("legal_information_and_services");
			fields.add("legal_information_and_services_referrals");
			fields.add("community_services");
			fields.add("community_services_referrals");
			fields.add("support_services_received");
			fields.add("care_for_newcomer_children2");
			fields.add("child1_age");
			fields.add("child1_type_of_care");
			fields.add("child2_age");
			fields.add("child2_type_of_care");
			fields.add("child3_age");
			fields.add("child3_type_of_care");
			fields.add("child4_age");
			fields.add("child4_type_of_care");
			fields.add("child5_age");
			fields.add("child5_type_of_care");
			fields.add("child_transportation");
			fields.add("child_provisions_for_disabilities");
			fields.add("child_translation");
			fields.add("child_translation_between");
			fields.add("child_translation_and");
			fields.add("child_interpretation");
			fields.add("child_interpretation_between");
			fields.add("child_interpretation_and");
			fields.add("child_crisis_counselling");
			fields.add("settlement_plan_compeleted_and_shared_with_client");
			fields.add("end_date_of_assessment_YYYY_MM_DD");
			fields.add("reason_for_update");

			
			
			//Query string
			String query = "INSERT INTO ";
			query += "needsandassessment"; //TODO table name
			query += "(";
			for(int i = 0; i < fields.size(); i++) {
				query += fields.get(i) + ", ";
			}
			//query += "(unique_identifier, unique_identifier_value, date_of_birth, postal_code_where_the_service_was_recieved, start_date_of_assessment, language_of_service,";
			//query += "official_language_of_preference, type_of_institution, referred_by, increase_knowledge_of_life_in_canada, increase_knowledge_of_life_in_canada_referrals) ";
			query = query.substring(0, query.length() - 2);
			query += ")";
			query += "VALUES(";
			for (int i = 0; i < fields.size() - 1; i++) {
				query += "?,";
			}
			query += "?)";


			for(int i = 0; i < fields.size(); i++) {
				String field_data = GetParam(request, fields.get(i));
				fields.set(i, field_data);
			}
			
			//Sets values into query
			PreparedStatement querySql = conn.prepareStatement(query);
			for(int i = 0; i < fields.size(); i++) {
				querySql.setString(i + 1, fields.get(i));
			}
//			querySql.setString(1, unique_identifier);
//			querySql.setString(2, unique_identifier_value);
//			querySql.setString(3, date_of_birth);
//			querySql.setString(4, postal_code_where_the_service_was_recieved);
//			querySql.setString(5, start_date_of_assessment);
//			querySql.setString(6, language_of_service);
//			querySql.setString(7, official_language_of_preference);
//			querySql.setString(8, type_of_institution);
//			querySql.setString(9, referred_by);
//			querySql.setString(10, increase_knowledge_of_life_in_canada);
//			querySql.setString(11, increase_knowledge_of_life_in_canada_referrals);
			querySql.executeUpdate();

			response.setStatus(HttpServletResponse.SC_OK);
		} catch (SQLException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			response.getOutputStream().println(e.getMessage());
		}
	}
	
	private String GetParam(HttpServletRequest request, String param)
	{
		return request.getParameter(param);
	}

}
