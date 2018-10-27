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
import java.util.Scanner;

import java.net.URLDecoder;

/**
 * Servlet implementation class InformationOrientationServlet
 */
@WebServlet("/InformationOrientation")
public class InformationOrientationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String dbname;
	private String dbuser;
	private String dbpass;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InformationOrientationServlet() {
		super();
		try {
			String s = getClass().getName();
			int i = s.lastIndexOf(".");
			if (i > -1)
				s = s.substring(i + 1);
			s = s + ".class";
			System.out.println("name " + s);
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
		} catch (Exception e) {
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
		try (Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/" + dbname + "?useSSL=false&allowPublicKeyRetrieval=true", dbuser,
				dbpass);) {
			// Gets params from request
			String update_record_id = GetParam(request, "update_record_id");
			String unique_identifier = GetParam(request, "unique_identifier");
			String unique_identifier_value = GetParam(request, "unique_identifier_value");
			String date_of_birth = GetParam(request, "date_of_birth");
			String postal_code_service = GetParam(request, "postal_code_service");
			String date_of_service = GetParam(request, "date_of_service");
			String service_language = GetParam(request, "service_language");
			String language_preference = GetParam(request, "language_preference");
			String provider_type = GetParam(request, "provider_type");
			String referred_by = GetParam(request, "referred_by");
			String services_recived = GetParam(request, "services_recived");
			String length_of_orientation = GetParam(request, "length_of_orientation");
			String length_of_orientation_hour = GetParam(request, "length_of_orientation_hour");
			String length_of_orientation_mim = GetParam(request, "length_of_orientation_mim");
			String num_clients_in_group = GetParam(request, "num_clients_in_group");
			String directed_at_target = GetParam(request, "directed_at_target");
			String target_children = GetParam(request, "target_children");
			String target_youth = GetParam(request, "target_youth");
			String target_senior = GetParam(request, "target_senior");
			String target_gender = GetParam(request, "target_gender");
			String target_refugee = GetParam(request, "target_refugee");
			String target_ECL = GetParam(request, "target_ECL");
			String target_poor_hearing = GetParam(request, "target_poor_hearing");
			String target_poor_sight = GetParam(request, "target_poor_sight");
			String target_lgbtq = GetParam(request, "target_lgbtq");
			String target_families_parents = GetParam(request, "target_families_parents");
			String target_other_impairments = GetParam(request, "target_other_impairments");
			String target_profession = GetParam(request, "target_profession");
			String target_trade = GetParam(request, "target_trade");
			String target_language_minorities = GetParam(request, "target_language_minorities");
			String overview_canada = GetParam(request, "overview_canada");
			String overview_canada_referral = GetParam(request, "overview_canada_referral");
			String info_src = GetParam(request, "info_src");
			String referral_src = GetParam(request, "referral_src");
			String right_freedom = GetParam(request, "right_freedom");
			String right_freedom_referral = GetParam(request, "right_freedom_referral");
			String law = GetParam(request, "law");
			String law_ref = GetParam(request, "law_ref");
			String docs = GetParam(request, "docs");
			String docs_ref = GetParam(request, "docs_ref");
			String eng_fr = GetParam(request, "eng_fr");
			String eng_fr_ref = GetParam(request, "eng_fr_ref");
			String employment = GetParam(request, "employment");
			String employment_ref = GetParam(request, "employment_ref");
			String education = GetParam(request, "education");
			String education_ref = GetParam(request, "education_ref");
			String housing = GetParam(request, "housing");
			String housing_ref = GetParam(request, "housing_ref");
			String health = GetParam(request, "health");
			String health_ref = GetParam(request, "health_ref");
			String money = GetParam(request, "money");
			String money_ref = GetParam(request, "money_ref");
			String transportation = GetParam(request, "transportation");
			String transportation_ref = GetParam(request, "transportation_ref");
			String comm_media = GetParam(request, "comm_media");
			String comm_media_ref = GetParam(request, "comm_media_ref");
			String community_engagment = GetParam(request, "community_engagment");
			String community_engagment_ref = GetParam(request, "community_engagment_ref");
			String becoming_cad = GetParam(request, "becoming_cad");
			String becoming_cad_ref = GetParam(request, "becoming_cad_ref");
			String interpersonal_conflict = GetParam(request, "interpersonal_conflict");
			String interpersonal_conflict_ref = GetParam(request, "interpersonal_conflict_ref");
			String training_recived = GetParam(request, "training");
			String computer_skill = GetParam(request, "computer_skill");
			String document_use = GetParam(request, "document_use");
			String interpersonal_skill = GetParam(request, "interpersonal_skill");
			String leadership_training = GetParam(request, "leadership_training");
			String numeracy = GetParam(request, "numeracy");
			String LS_RoC_info_recived = GetParam(request, "LS_RoC_info_recived");
			String life_skills = GetParam(request, "life_skills");
			String rights_responsibillities_citizenship = GetParam(request, "rights_responsibillities_citizenship");
			String support_services_recived = GetParam(request, "support_services_recived");
			String care_children = GetParam(request, "care_children");
			String child1_age = GetParam(request, "child1_age");
			String child1_care = GetParam(request, "child1_care");
			String child2_age = GetParam(request, "child2_age");
			String child2_care = GetParam(request, "child2_care");
			String child3_age = GetParam(request, "child3_age");
			String child3_care = GetParam(request, "child3_care");
			String child4_age = GetParam(request, "child4_age");
			String child4_care = GetParam(request, "child4_care");
			String child5_age = GetParam(request, "child5_age");
			String child5_care = GetParam(request, "child5_care");
			String transportation_child = GetParam(request, "transportation_child");
			String disability_provision = GetParam(request, "disability_provision");
			String translation = GetParam(request, "translation");
			String translation_1 = GetParam(request, "translation_1");
			String translation_2 = GetParam(request, "translation_2");
			String interpretation = GetParam(request, "interpretation");
			String interpretation_1 = GetParam(request, "interpretation_1");
			String interpretation_2 = GetParam(request, "interpretation_2");
			String crisis_counselling = GetParam(request, "crisis_counselling");
			String date_of_termination = GetParam(request, "date_of_termination");
			String update_reason = GetParam(request, "update_reason");

			// Query string
			String query = "INSERT INTO ";
			query += "information_orientation"; // TODO table name
			query += "(update_record_id, unique_identifier, unique_identifier_value, date_of_birth, postal_code_service, date_of_service, service_language, language_preference, provider_type, referred_by, services_recived, length_of_orientation, length_of_orientation_hour, length_of_orientation_mim, num_clients_in_group, directed_at_target, target_children, target_youth, target_senior, target_gender, target_refugee, target_ECL, target_poor_hearing, target_poor_sight, target_lgbtq, target_families_parents, target_other_impairments, target_profession, target_trade, target_language_minorities, overview_canada, overview_canada_referral, info_src, referral_src, right_freedom, right_freedom_referral, law, law_ref, docs, docs_ref, eng_fr, eng_fr_ref, employment, employment_ref, education, education_ref, housing, housing_ref, health, health_ref, money, money_ref, transportation, transportation_ref, comm_media, comm_media_ref, community_engagment, community_engagment_ref, becoming_cad, becoming_cad_ref, interpersonal_conflict, interpersonal_conflict_ref, training_recived, computer_skill, document_use, interpersonal_skill, leadership_training, numeracy, LS_RoC_info_recived, life_skills, rights_responsibillities_citizenship, support_services_recived, care_children, child1_age, child1_care, child2_age, child2_care, child3_age, child3_care, child4_age, child4_care, child5_age, child5_care, transportation_child, disability_provision, translation, translation_1, translation_2, interpretation, interpretation_1, interpretation_2, crisis_counselling, date_of_termination, update_reason) ";
			query += "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			// Sets values into query
			PreparedStatement querySql = conn.prepareStatement(query);
			querySql.setString(1, update_record_id);
			querySql.setString(2, unique_identifier);
			querySql.setString(3, unique_identifier_value);
			querySql.setString(4, date_of_birth);
			querySql.setString(5, postal_code_service);
			querySql.setString(6, date_of_service);
			querySql.setString(7, service_language);
			querySql.setString(8, language_preference);
			querySql.setString(9, provider_type);
			querySql.setString(10, referred_by);
			querySql.setString(11, services_recived);
			querySql.setString(12, length_of_orientation);
			querySql.setString(13, length_of_orientation_hour);
			querySql.setString(14, length_of_orientation_mim);
			querySql.setString(15, num_clients_in_group);
			querySql.setString(16, directed_at_target);
			querySql.setString(17, target_children);
			querySql.setString(18, target_youth);
			querySql.setString(19, target_senior);
			querySql.setString(20, target_gender);
			querySql.setString(21, target_refugee);
			querySql.setString(22, target_ECL);
			querySql.setString(23, target_poor_hearing);
			querySql.setString(24, target_poor_sight);
			querySql.setString(25, target_lgbtq);
			querySql.setString(26, target_families_parents);
			querySql.setString(27, target_other_impairments);
			querySql.setString(28, target_profession);
			querySql.setString(29, target_trade);
			querySql.setString(30, target_language_minorities);
			querySql.setString(31, overview_canada);
			querySql.setString(32, overview_canada_referral);
			querySql.setString(33, info_src);
			querySql.setString(34, referral_src);
			querySql.setString(35, right_freedom);
			querySql.setString(36, right_freedom_referral);
			querySql.setString(37, law);
			querySql.setString(38, law_ref);
			querySql.setString(39, docs);
			querySql.setString(40, docs_ref);
			querySql.setString(41, eng_fr);
			querySql.setString(42, eng_fr_ref);
			querySql.setString(43, employment);
			querySql.setString(44, employment_ref);
			querySql.setString(45, education);
			querySql.setString(46, education_ref);
			querySql.setString(47, housing);
			querySql.setString(48, housing_ref);
			querySql.setString(49, health);
			querySql.setString(50, health_ref);
			querySql.setString(51, money);
			querySql.setString(52, money_ref);
			querySql.setString(53, transportation);
			querySql.setString(54, transportation_ref);
			querySql.setString(55, comm_media);
			querySql.setString(56, comm_media_ref);
			querySql.setString(57, community_engagment);
			querySql.setString(58, community_engagment_ref);
			querySql.setString(59, becoming_cad);
			querySql.setString(60, becoming_cad_ref);
			querySql.setString(61, interpersonal_conflict);
			querySql.setString(62, interpersonal_conflict_ref);
			querySql.setString(63, training_recived);
			querySql.setString(64, computer_skill);
			querySql.setString(65, document_use);
			querySql.setString(66, interpersonal_skill);
			querySql.setString(67, leadership_training);
			querySql.setString(68, numeracy);
			querySql.setString(69, LS_RoC_info_recived);
			querySql.setString(70, life_skills);
			querySql.setString(71, rights_responsibillities_citizenship);
			querySql.setString(72, support_services_recived);
			querySql.setString(73, care_children);
			querySql.setString(74, child1_age);
			querySql.setString(75, child1_care);
			querySql.setString(76, child2_age);
			querySql.setString(77, child2_care);
			querySql.setString(78, child3_age);
			querySql.setString(79, child3_care);
			querySql.setString(80, child4_age);
			querySql.setString(81, child4_care);
			querySql.setString(82, child5_age);
			querySql.setString(83, child5_care);
			querySql.setString(84, transportation_child);
			querySql.setString(85, disability_provision);
			querySql.setString(86, translation);
			querySql.setString(87, translation_1);
			querySql.setString(88, translation_2);
			querySql.setString(89, interpretation);
			querySql.setString(90, interpretation_1);
			querySql.setString(91, interpretation_2);
			querySql.setString(92, crisis_counselling);
			querySql.setString(93, date_of_termination);
			querySql.setString(94, update_reason);
			querySql.executeUpdate();

			response.setStatus(HttpServletResponse.SC_OK);
		} catch (SQLException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			response.getOutputStream().println(e.getMessage());
		}
	}

	private String GetParam(HttpServletRequest request, String param) {
		return request.getParameter(param);
	}

}
