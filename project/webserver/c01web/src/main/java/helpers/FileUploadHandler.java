package helpers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import queryhelper.QueryBuilder;
import queryhelper.Row;
import servlets.FormServlet;

@WebServlet("/FileUploadHandler")
public class FileUploadHandler extends HttpServlet {

	private static final long serialVersionUID = 1;
	private int MERGES = 0;

	// start of col. names
	private String[] cp = { "unique_identifier", "unique_identifier_value", "date_of_birth_yyyy_mm_dd", "phone_number",
			"does_the_client_have_an_email_address", "email_address", "street_number", "street_name", "street_type",
			"street_direction", "unit_suite_apt", "city", "province", "postal_code", "official_language_of_preference",
			"consent_for_future_research_consultation" };
	private String[] nar = { "update_record_id", "unique_identifier", "unique_identifier_value",
			"date_of_birth_yyyy_mm_dd", "postal_code_where_the_service_was_received",
			"start_date_of_assessment_yyyy_mm_dd", "language_of_service", "official_language_of_preference",
			"type_of_institution_organization_where_client_received_services", "referred_by",
			"increase_knowledge_of_life_in_canada", "increase_knowledge_of_life_in_canada_referrals",
			"increase_knowledge_of_community_and_government_services", "longfield_1",
			"increase_knowledge_of_working_in_canada", "increase_knowledge_of_working_in_canada_referrals",
			"increase_knowledge_of_education_in_canada", "increase_knowledge_of_education_in_canada_referrals",
			"increase_the_following_social_networks", "increase_the_following_social_networks_referrals",
			"increase_the_following_professional_networks", "increase_the_following_professional_networks_referrals",
			"increase_the_following_access_to_local_community_services", "longfield_2",
			"increase_the_following_level_of_community_involvement",
			"increase_the_following_level_of_community_involvement_referrals", "improve_language_skills",
			"improve_language_skills_referrals", "improve_language_skills_to", "improve_other_skills",
			"improve_other_skills_referrals", "improve_other_skills_to", "find_employment", "find_employment_referrals",
			"find_employment_timeframe", "find_employment_minimum_one_years_work_experience", "longfield_3",
			"longfield_4", "client_intends_to_become_a_canadian_citizen", "support_services_may_be_required",
			"care_for_newcomer_children_adult", "transportation_adult", "provisions_for_disabilities_adult",
			"translation_adult", "interpretation_adult", "crisis_counselling_adult", "non_ircc_program_services_needed",
			"food_clothing_other_material_needs", "food_clothing_other_material_needs_referrals",
			"housing_accommodation", "housing_accommodation_referrals", "health_mental_health_well_being",
			"health_mental_health_well_being_referrals", "financial", "financial_referrals", "family_support",
			"family_support_referrals", "language_non_ircc", "language_non_ircc_referrals",
			"education_skills_development", "education_skills_development_referrals", "employment_related",
			"employment_related_referrals", "legal_information_and_services",
			"legal_information_and_services_referrals", "community_services", "community_services_referrals",
			"support_services_received", "care_for_newcomer_children_child", "child_1_age", "child_1_type_of_care",
			"child_2_age", "child_2_type_of_care", "child_3_age", "child_3_type_of_care", "child_4_age",
			"child_4_type_of_care", "child_5_age", "child_5_type_of_care", "transportation_child",
			"provisions_for_disabilities_child", "translation_child", "between_translation", "and_translation",
			"interpretation_child", "between_interpretation", "and_interpretation", "crisis_counselling_child",
			"settlement_plan_completed_and_shared_with_client", "end_date_of_assessment_yyyy_mm_dd",
			"reason_for_update" };
	private String[] cc = { "update_record_id", "unique_identifier", "unique_identifier_value",
			"date_of_birth_yyyy_mm_dd", "postal_code_where_the_service_was_received", "language_of_service",
			"official_language_of_preference", "referred_by", "activity_under_which_client_received_services",
			"type_of_institution_organization_where_client_received_services", "type_of_event_attended",
			"type_of_service", "main_topic_focus_of_the_service_received", "service_received",
			"number_of_unique_participants", "longfield_5", "directed_at_a_specific_target_group",
			"target_group_children_0_14_yrs", "target_group_youth_15_24_yrs", "target_group_senior",
			"target_group_gender_specific", "target_group_refugees", "target_group_ethnic_cultural_linguistic_group",
			"target_group_deaf_or_hard_of_hearing", "target_group_blind_or_partially_sighted",
			"target_group_lesbian_gay_bisexual_transgender_queer_lgbtq", "target_group_families_parents",
			"target_group_other_impairments_physical_mental", "longfield_6", "longfield_7",
			"target_group_official_language_minorities", "status_of_service", "reason_for_leaving_service",
			"start_date_yyyy_mm_dd", "end_date_yyyy_mm_dd", "projected_end_date_yyyy_mm_dd", "longfield_8",
			"computer_skills", "document_use", "interpersonal_skills_and_workplace_culture", "leadership_training",
			"life_skills", "numeracy", "support_services_received", "care_for_newcomer_children_child", "child_1_age",
			"child_1_type_of_care", "child_2_age", "child_2_type_of_care", "child_3_age", "child_3_type_of_care",
			"child_4_age", "child_4_type_of_care", "child_5_age", "child_5_type_of_care", "transportation_child",
			"provisions_for_disabilities_child", "translation_child", "between_translation", "and_translation",
			"interpretation_child", "between_interpretation", "and_interpretation", "crisis_counselling_child",
			"total_length_of_service_hours", "total_length_of_service_minutes", "reason_for_update" };
	private String[] io = { "update_record_id", "unique_identifier", "unique_identifier_value",
			"date_of_birth_yyyy_mm_dd", "postal_code_where_the_service_was_received",
			"start_date_of_service_yyyy_mm_dd", "language_of_service", "official_language_of_preference",
			"type_of_institution_organization_where_client_received_services", "referred_by", "service_received",
			"total_length_of_orientation", "total_length_of_orientation_hours", "total_length_of_orientation_minutes",
			"number_of_clients_in_group", "directed_at_a_specific_target_group", "target_group_children_0_14_yrs",
			"target_group_youth_15_24_yrs", "target_group_senior", "target_group_gender_specific",
			"target_group_refugees", "target_group_ethnic_cultural_linguistic_group",
			"target_group_deaf_or_hard_of_hearing", "target_group_blind_or_partially_sighted",
			"target_group_lesbian_gay_bisexual_transgender_queer_lgbtq", "target_group_families_parents",
			"target_group_other_impairments_physical_mental", "longfield_6", "longfield_7",
			"target_group_official_language_minorities", "overview_of_canada", "overview_of_canada_referrals",
			"sources_of_information", "sources_of_information_referrals", "rights_and_freedoms",
			"rights_and_freedoms_referrals", "canadian_law_and_justice", "canadian_law_and_justice_referrals",
			"important_documents", "important_documents_referrals", "improving_english_or_french",
			"improving_english_or_french_referrals", "employment_and_income", "employment_and_income_referrals",
			"education", "education_referrals", "housing", "housing_referrals", "health", "health_referrals",
			"money_and_finances", "money_and_finances_referrals", "transportation_adult", "transportation_referrals",
			"communications_and_media", "communications_and_media_referrals", "community_engagement",
			"community_engagement_referrals", "becoming_a_canadian_citizen", "becoming_a_canadian_citizen_referrals",
			"interpersonal_conflict", "interpersonal_conflict_referrals", "longfield_8", "computer_skills",
			"document_use", "interpersonal_skills_and_workplace_culture", "leadership_training", "numeracy",
			"longfield_9", "life_skills", "longfield_10", "support_services_received",
			"care_for_newcomer_children_child", "child_1_age", "child_1_type_of_care", "child_2_age",
			"child_2_type_of_care", "child_3_age", "child_3_type_of_care", "child_4_age", "child_4_type_of_care",
			"child_5_age", "child_5_type_of_care", "transportation_child", "provisions_for_disabilities_child",
			"translation_child", "between_translation", "and_translation", "interpretation_child",
			"between_interpretation", "and_interpretation", "crisis_counselling_child",
			"end_date_of_service_yyyy_mm_dd", "reason_for_update" };
	private String[] emp = { "UPDATE_RECORD_ID", "UNIQUE_IDENTIFIER", "UNIQUE_IDENTIFIER_VALUE",
			"DATE_OF_BIRTH_YYYY_MM_DD", "POSTAL_CODE_WHERE_THE_SERVICE_WAS_RECEIVED",
			"REGISTRATION_IN_AN_EMPLOYMENT_INTERVENTION", "A_REFERRAL_TO", "LANGUAGE_OF_SERVICE",
			"OFFICIAL_LANGUAGE_OF_PREFERENCE", "TYPE_OF_INSTITUTION_ORGANIZATION_WHERE_CLIENT_RECEIVED_SERVICES",
			"REFERRED_BY", "REFERRAL_DATE_YYYY_MM_DD", "EMPLOYMENT_STATUS", "EDUCATION_STATUS", "OCCUPATION_IN_CANADA",
			"INTENDED_OCCUPATION", "INTERVENTION_TYPE", "LONG_TERM_INTERVENTION_INTERVENTION_RECEIVED",
			"LONG_TERM_INTERVENTION_STATUS_OF_INTERVENTION", "LONG_TERM_INTERVENTION_REASON_FOR_LEAVING_INTERVENTION",
			"LONG_TERM_INTERVENTION_START_DATE_YYYY_MM_DD", "LONG_TERM_INTERVENTION_END_DATE_YYYY_MM_DD",
			"LONG_TERM_INTERVENTION_SIZE_OF_EMPLOYER", "LONG_TERM_INTERVENTION_PLACEMENT_WAS",
			"LONG_TERM_INTERVENTION_HOURS_PER_WEEK", "LONG_TERM_INTERVENTION_CLIENT_MET_MENTOR_REGULARLY_AT",
			"LONG_TERM_INTERVENTION_AVERAGE_HOURS_WEEK_IN_CONTACT_WITH_MENTOR",
			"LONG_TERM_INTERVENTION_PROFESSION_TRADE_FOR_WHICH_SERVICES_WERE_RECEIVED",
			"WAS_ESSENTIAL_SKILLS_AND_APTITUDES_TRAINING_RECEIVED_AS_PART_OF_THE_SERVICE", "COMPUTER_SKILLS",
			"DOCUMENT_USE", "INTERPERSONAL_SKILLS_AND_WORKPLACE_CULTURE", "LEADERSHIP_TRAINING", "NUMERACY",
			"SHORT_TERM_INTERVENTION_SERVICE_RECEIVED", "SHORT_TERM_INTERVENTION_DATE_YYYY_MM_DD",
			"SUPPORT_SERVICES_RECEIVED", "CARE_FOR_NEWCOMER_CHILDREN_CHILD", "CHILD_1_AGE", "CHILD_1_TYPE_OF_CARE",
			"CHILD_2_AGE", "CHILD_2_TYPE_OF_CARE", "CHILD_3_AGE", "CHILD_3_TYPE_OF_CARE", "CHILD_4_AGE",
			"CHILD_4_TYPE_OF_CARE", "CHILD_5_AGE", "CHILD_5_TYPE_OF_CARE", "TRANSPORTATION_ADULT",
			"TRANSPORTATION_CHILD", "PROVISIONS_FOR_DISABILITIES_CHILD", "TRANSLATION_CHILD", "BETWEEN_TRANSLATION",
			"AND_TRANSLATION", "INTERPRETATION_CHILD", "BETWEEN_INTERPRETATION", "AND_INTERPRETATION",
			"CRISIS_COUNSELLING_CHILD", "TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_HOURS",
			"TIME_SPENT_WITH_CLIENT_ADDRESSING_CLIENTS_EMPLOYMENT_NEEDS_MINUTES", "REASON_FOR_UPDATE" };
	private String[] ltcenrol = { "update_record_id", "unique_identifier", "unique_identifier_value",
			"date_of_birth_yyyy_mm_dd", "postal_code_where_the_service_was_received", "course_code",
			"date_of_clients_first_class_yyyy_mm_dd", "official_language_of_preference", "support_services_received",
			"care_for_newcomer_children_child", "child_1_age", "child_1_type_of_care", "child_2_age",
			"child_2_type_of_care", "child_3_age", "child_3_type_of_care", "child_4_age", "child_4_type_of_care",
			"child_5_age", "child_5_type_of_care", "transportation_child", "provisions_for_disabilities_child",
			"translation_child", "between_translation", "and_translation", "interpretation_child",
			"between_interpretation", "and_interpretation", "crisis_counselling_child", "reason_for_update" };
	private String[] ltcsetup = { "update_record_id", "course_code", "notes", "course_held_on_an_ongoing_basis",
			"official_language_of_course", "format_of_training_provided", "classes_held_at",
			"in_person_instruction_percent", "online_distance_instruction_percent", "total_number_of_spots_in_course",
			"number_of_ircc_funded_spots_in_course", "new_students_can_enrol_in_the_course",
			"support_services_available_for_client_in_this_course", "care_for_newcomer_children_adult",
			"transportation_adult", "provisions_for_disabilities_adult", "course_start_date_yyyy_mm_dd",
			"course_end_date_yyyy_mm_dd", "schedule_morning", "schedule_afternoon", "schedule_evening",
			"schedule_anytime", "schedule_weekend", "schedule_online", "instructional_hours_per_class",
			"classes_per_week", "weeks_of_instruction", "weeks_of_instruction_per_year", "dominant_focus_of_the_course",
			"course_directed_at_a_specific_target_group", "children_0_14_yrs", "youth_15_24_yrs", "senior",
			"gender_specific", "refugees", "official_language_minorities", "ethnic_cultural_linguistic_group",
			"deaf_or_hard_of_hearing", "blind_or_partially_sighted", "clients_with_other_impairments_physical_mental",
			"lesbian_gay_bisexual_transgender_queer_lgbtq", "families_parents",
			"clients_with_international_training_in_a_regulated_profession",
			"clients_with_international_training_in_a_regulated_trade", "materials_used_in_course",
			"citizenship_preparation", "pbla_language_companion", "contact_name", "street_number", "street_name",
			"street_type", "street_direction", "unit_suite_apt", "province", "city", "postal_code", "telephone_number",
			"telephone_extension", "email_address", "listening_skill_level_1", "listening_skill_level_2",
			"listening_skill_level_3", "listening_skill_level_4", "listening_skill_level_5", "listening_skill_level_6",
			"listening_skill_level_7", "listening_skill_level_8", "listening_skill_level_9", "listening_skill_level_10",
			"listening_skill_level_11", "listening_skill_level_12", "speaking_skill_level_1", "speaking_skill_level_2",
			"speaking_skill_level_3", "speaking_skill_level_4", "speaking_skill_level_5", "speaking_skill_level_6",
			"speaking_skill_level_7", "speaking_skill_level_8", "speaking_skill_level_9", "speaking_skill_level_10",
			"speaking_skill_level_11", "speaking_skill_level_12", "reading_skill_level_1", "reading_skill_level_2",
			"reading_skill_level_3", "reading_skill_level_4", "reading_skill_level_5", "reading_skill_level_6",
			"reading_skill_level_7", "reading_skill_level_8", "reading_skill_level_9", "reading_skill_level_10",
			"reading_skill_level_11", "reading_skill_level_12", "reading_skill_level_13", "reading_skill_level_14",
			"reading_skill_level_15", "reading_skill_level_16", "reading_skill_level_17", "writing_skill_level_1",
			"writing_skill_level_2", "writing_skill_level_3", "writing_skill_level_4", "writing_skill_level_5",
			"writing_skill_level_6", "writing_skill_level_7", "writing_skill_level_8", "writing_skill_level_9",
			"writing_skill_level_10", "writing_skill_level_11", "writing_skill_level_12", "writing_skill_level_13",
			"writing_skill_level_14", "writing_skill_level_15", "writing_skill_level_16", "writing_skill_level_17" };
	private String[] ltcexit = { "update_record_id", "unique_identifier", "unique_identifier_value",
			"date_of_birth_yyyy_mm_dd", "course_code", "clients_training_status",
			"date_client_exited_course_yyyy_mm_dd", "reason_for_exiting_course", "listening_clb_level",
			"reading_clb_level", "speaking_clb_level", "writing_clb_level", "was_a_certificate_issued_to_the_client",
			"listening_level_indicated_on_certificate", "speaking_level_indicated_on_certificate",
			"support_services_received", "care_for_newcomer_children_child", "child_1_age", "child_1_type_of_care",
			"child_2_age", "child_2_type_of_care", "child_3_age", "child_3_type_of_care", "child_4_age",
			"child_4_type_of_care", "child_5_age", "child_5_type_of_care", "transportation_adult",
			"transportation_child", "provisions_for_disabilities_child", "translation_child", "between_translation",
			"and_translation", "interpretation_child", "between_interpretation", "and_interpretation",
			"crisis_counselling_child", "reason_for_update" };
	// end of col. names

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		response.setContentType("text/html");

		boolean isMultipartContent = ServletFileUpload.isMultipartContent(request);
		if (!isMultipartContent) {
			return;
		}

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);

		try {
			DbConnectionHelper dbHelper = new DbConnectionHelper();
			dbHelper.findDatabaseInfo();
			Connection conn = dbHelper.connect();

			List<FileItem> fields = upload.parseRequest(request);
			Iterator<FileItem> it = fields.iterator();
			String tableName = getTableName(fields);

			if (!it.hasNext()) {
				return;
			} else {
				FileItem fileItem = it.next();
				// fileItem.getString() returns file content
				HttpServletRequestHelper helper = new HttpServletRequestHelper(request);

				String[] allLines = fileItem.getString().split("[\\r\\n]+");
				for (String row : allLines) {
					insertData(response, conn, helper, tableName, row);
				}

				response.getOutputStream().println("Upload Successful!" + MERGES + " Row(s) were merged with existing row(s)");
				response.setStatus(HttpServletResponse.SC_OK);
				MERGES = 0;
				conn.close();
			}
		} catch (SQLException | FileUploadException | ParseException e) {
			e.printStackTrace();
			response.setStatus(HttpServletResponse.SC_CONFLICT);
			if (e instanceof SQLException) {
				response.getOutputStream().println(e.getMessage());
			}
		}
	}

	private String getTableName(List<FileItem> fields) {
		Iterator<FileItem> it = fields.iterator();
		String ret = null;
		while (it.hasNext()) {
			ret = it.next().getString();
		}
		return ret;
	}

	private void insertData(HttpServletResponse response, Connection conn, HttpServletRequestHelper helper,
			String tableName, String row) throws SQLException, IOException, ParseException {

		String[] colNames;
		switch (tableName) {
		case "client_profile":
			colNames = this.cp;
			break;
		case "needs_assessment_and_referrals":
			colNames = this.nar;
			break;
		case "community_connections":
			colNames = this.cc;
			break;
		case "information_and_orientation":
			colNames = this.io;
			break;
		case "employment":
			colNames = this.emp;
			break;
		case "language_training_client_enrollment":
			colNames = this.ltcenrol;
			break;
		case "language_training_course_setup":
			colNames = this.ltcsetup;
			break;
		case "language_training_client_exit":
			colNames = this.ltcexit;
			break;
		default:
			colNames = null;
			break;
		}

		if (colNames == null) {
			return;
		} else {
			DbConflictResolver dbcr = new DbConflictResolver(conn, tableName);
			Row rowObj = new Row();
			String[] data = row.split(",\\s*(?=([^\\\"]*\\\"[^\\\"]*\\\")*[^\\\"]*$)");
			QueryBuilder qb = new QueryBuilder(tableName);

			int i;
			for (i = 0; i < Math.min(colNames.length, data.length); i++) {
				rowObj.setField(colNames[i], data[i]);
				qb.addParam(colNames[i], data[i]);
			}

			Row conflict1 = dbcr.checkIdentifierAlreadyExist(rowObj);
			Row conflict2 = dbcr.checkUserMonthAlreadyExist(rowObj);
			if (conflict1 != null) // best to have this throw exception but oh well
			{
				FormServlet.mergeDbRow(conflict1, rowObj, conn, tableName);
				MERGES++;
				return; // instead of stopping should instead merge
			}
			if (conflict2 != null) {
				FormServlet.mergeDbRow(conflict2, rowObj, conn, tableName);
				MERGES++;
				return; // instead of stopping should instead merge
			}

			qb.setRequestHelper(helper);
			String query = qb.generateQueryString();
			PreparedStatement ps = conn.prepareStatement(query);
			qb.fillPreparedStatement(ps);
			ps.executeUpdate();
		}
	}
}
