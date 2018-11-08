

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CommunityConnectionsServlet
 */
@WebServlet("/CommunityConnections")
public class CommunityConnectionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String dbname;
	private String dbuser;
	private String dbpass;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CommunityConnectionsServlet() {
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
		}    }

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
		// TODO Auto-generated method stub
		try (
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/" + dbname + "?useSSL=false&allowPublicKeyRetrieval=true", dbuser,
						dbpass);
				)
		{
			//Gets params from request
			String update_record_id = GetParam(request, "update_record_id");
			String unique_identifier = GetParam(request, "unique_identifier");
			String unique_identifier_value = GetParam(request, "unique_identifier_value");
			String date_of_birth = GetParam(request, "date_of_birth");
			String postal_code = GetParam(request, "postal_code");
			String language_of_service = GetParam(request, "language_of_service");
			String official_language_of_preference = GetParam(request, "official_language_of_preference");
			String referred_by = GetParam(request, "referred_by");
			String activity_under_which = GetParam(request, "activity_under_which");
			String type_of_institution = GetParam(request, "type_of_institution");
			String type_of_event = GetParam(request, "type_of_event");
			String type_of_service = GetParam(request, "type_of_service");
			String main_topic_of_service = GetParam(request, "main_topic_of_service");
			String service_received = GetParam(request, "service_received");
			String number_of_unique_participants = GetParam(request, "number_of_unique_participants");
			String did_volunteers = GetParam(request, "did_volunteers");
			String directed_at_group = GetParam(request, "directed_at_group");
			String target_group_children = GetParam(request, "target_group_children");
			String target_group_youth = GetParam(request, "target_group_youth");
			String target_group_senior = GetParam(request, "target_group_senior");
			String target_group_gender_specific = GetParam(request, "target_group_gender_specific");
			String target_group_refugees = GetParam(request, "target_group_refugees");
			String target_group_ethnic = GetParam(request, "target_group_ethnic");
			String target_group_deaf = GetParam(request, "target_group_deaf");
			String target_group_blind = GetParam(request, "target_group_blind");
			String target_group_lgbtq = GetParam(request, "target_group_lgbtq");
			String target_group_families = GetParam(request, "target_group_families");
			String target_group_other_impairments = GetParam(request, "target_group_other_impairments");
			String target_group_profession = GetParam(request, "target_group_profession");
			String target_group_trade = GetParam(request, "target_group_trade");
			String target_group_minority = GetParam(request, "target_group_minority");
			String status_of_service = GetParam(request, "status_of_service");
			String reason_for_leaving = GetParam(request, "reason_for_leaving");
			String start_date = GetParam(request, "start_date");
			String end_date = GetParam(request, "end_date");
			String projected_end_date = GetParam(request, "projected_end_date");
			String essential_skills = GetParam(request, "essential_skills");
			String computer_skills = GetParam(request, "computer_skills");
			String document_use = GetParam(request, "document_use");
			String interpersonal_skills = GetParam(request, "interpersonal_skills");
			String leadership_training = GetParam(request, "leadership_training");
			String life_skills = GetParam(request, "life_skills");
			String numeracy = GetParam(request, "numeracy");
			String support_services_received = GetParam(request, "support_services_received");
			String care_for_newcomer_children = GetParam(request, "care_for_newcomer_children");
			String child_1_age = GetParam(request, "child_1_age");
			String child_1_care = GetParam(request, "child_1_care");
			String child_2_age = GetParam(request, "child_2_age");
			String child_2_care = GetParam(request, "child_2_care");
			String child_3_age = GetParam(request, "child_3_age");
			String child_3_care = GetParam(request, "child_3_care");
			String child_4_age = GetParam(request, "child_4_age");
			String child_4_care = GetParam(request, "child_4_care");
			String child_5_age = GetParam(request, "child_5_age");
			String child_5_care = GetParam(request, "child_5_care");
			String transportation = GetParam(request, "transportation");
			String provisions_for_disabilities = GetParam(request, "provisions_for_disabilities");
			String translation = GetParam(request, "translation");
			String between_1 = GetParam(request, "between_1");
			String and_1 = GetParam(request, "and_1");
			String interpretation = GetParam(request, "interpretation");
			String between_2 = GetParam(request, "between_2");
			String and_2 = GetParam(request, "and_2");
			String crisis_counselling = GetParam(request, "crisis_counselling");
			String length_of_service_hours = GetParam(request, "length_of_service_hours");
			String length_of_service_minutes = GetParam(request, "length_of_service_minutes");
			String reason_for_update = GetParam(request, "reason_for_update");
			//Query string
			String query = "INSERT INTO ";
			query += "community_connections"; //TODO table name
			query += "(update_record_id,"
					+ " unique_identifier,"
					+ " unique_identifier_value,"
					+ " date_of_birth,"
					+ " postal_code,"
					+ " language_of_service,"
					+ " official_language_of_preference,"
					+ " referred_by,"
					+ " activity_under_which,"
					+ " type_of_institution,"
					+ " type_of_event,"
					+ " type_of_service,"
					+ " main_topic_of_service,"
					+ " service_received,"
					+ " number_of_unique_participants,"
					+ " did_volunteers,"
					+ " directed_at_group,"
					+ " target_group_children,"
					+ " target_group_youth,"
					+ " target_group_senior,"
					+ " target_group_gender_specific,"
					+ " target_group_refugees,"
					+ " target_group_ethnic,"
					+ " target_group_deaf,"
					+ " target_group_blind,"
					+ " target_group_lgbtq,"
					+ " target_group_families,"
					+ " target_group_other_impairments,"
					+ " target_group_profession,"
					+ " target_group_trade,"
					+ " target_group_minority,"
					+ " status_of_service,"
					+ " reason_for_leaving,"
					+ " start_date,"
					+ " end_date,"
					+ " projected_end_date,"
					+ " essential_skills,"
					+ " computer_skills,"
					+ " document_use,"
					+ " interpersonal_skills,"
					+ " leadership_training,"
					+ " life_skills,"
					+ " numeracy,"
					+ " support_services_received,"
					+ " care_for_newcomer_children,"
					+ " child_1_age,"
					+ " child_1_care,"
					+ " child_2_age,"
					+ " child_2_care,"
					+ " child_3_age,"
					+ " child_3_care,"
					+ " child_4_age,"
					+ " child_4_care,"
					+ " child_5_age,"
					+ " child_5_care,"
					+ " transportation,"
					+ " provisions_for_disabilities,"
					+ " translation,"
					+ " between_1,"
					+ " and_1,"
					+ " interpretation,"
					+ " between_2,"
					+ " and_2,"
					+ " crisis_counselling,"
					+ " length_of_service_hours,"
					+ " length_of_service_minutes,"
					+ " reason_for_update)";
			query += "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
					+ "?,?,?,?,?,?)"; //Add extra question mark for each attribute

			//Sets values into query
			PreparedStatement querySql = conn.prepareStatement(query);
			querySql.setString(1, update_record_id);
			querySql.setString(2, unique_identifier);
			querySql.setString(3, unique_identifier_value);
			querySql.setString(4, date_of_birth);
			querySql.setString(5, postal_code);
			querySql.setString(6, language_of_service);
			querySql.setString(7, official_language_of_preference);
			querySql.setString(8, referred_by);
			querySql.setString(9, activity_under_which);
			querySql.setString(10, type_of_institution);
			querySql.setString(11, type_of_event);
			querySql.setString(12, type_of_service);
			querySql.setString(13, main_topic_of_service);
			querySql.setString(14, service_received);
			querySql.setString(15, number_of_unique_participants);
			querySql.setString(16, did_volunteers);
			querySql.setString(17, directed_at_group);
			querySql.setString(18, target_group_children);
			querySql.setString(19, target_group_youth);
			querySql.setString(20, target_group_senior);
			querySql.setString(21, target_group_gender_specific);
			querySql.setString(22, target_group_refugees);
			querySql.setString(23, target_group_ethnic);
			querySql.setString(24, target_group_deaf);
			querySql.setString(25, target_group_blind);
			querySql.setString(26, target_group_lgbtq);
			querySql.setString(27, target_group_families);
			querySql.setString(28, target_group_other_impairments);
			querySql.setString(29, target_group_profession);
			querySql.setString(30, target_group_trade);
			querySql.setString(31, target_group_minority);
			querySql.setString(32, status_of_service);
			querySql.setString(33, reason_for_leaving);
			querySql.setString(34, start_date);
			querySql.setString(35, end_date);
			querySql.setString(36, projected_end_date);
			querySql.setString(37, essential_skills);
			querySql.setString(38, computer_skills);
			querySql.setString(39, document_use);
			querySql.setString(40, interpersonal_skills);
			querySql.setString(41, leadership_training);
			querySql.setString(42, life_skills);
			querySql.setString(43, numeracy);
			querySql.setString(44, support_services_received);
			querySql.setString(45, care_for_newcomer_children);
			querySql.setString(46, child_1_age);
			querySql.setString(47, child_1_care);
			querySql.setString(48, child_2_age);
			querySql.setString(49, child_2_care);
			querySql.setString(50, child_3_age);
			querySql.setString(51, child_3_care);
			querySql.setString(52, child_4_age);
			querySql.setString(53, child_4_care);
			querySql.setString(54, child_5_age);
			querySql.setString(55, child_5_care);
			querySql.setString(56, transportation);
			querySql.setString(57, provisions_for_disabilities);
			querySql.setString(58, translation);
			querySql.setString(59, between_1);
			querySql.setString(60, and_1);
			querySql.setString(61, interpretation);
			querySql.setString(62, between_2);
			querySql.setString(63, and_2);
			querySql.setString(64, crisis_counselling);
			querySql.setString(65, length_of_service_hours);
			querySql.setString(66, length_of_service_minutes);
			querySql.setString(67, reason_for_update);
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
