package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import queryhelper.Field;

/**
 * Servlet implementation class LanguageTrainingCourseSetupServlet
 */
@WebServlet("/LanguageTrainingCourseSetup")
public class LanguageTrainingCourseSetupServlet extends FormServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LanguageTrainingCourseSetupServlet() {
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
		super.setTableName(Field.TABLE_LANGUAGE_TRAINING_COURSE_SETUP);

		this.addField(Field.UPDATE_RECORD_ID);
		this.addField(Field.COURSE_CODE);
		this.addField(Field.NOTES);
		this.addField(Field.COURSE_HELD_ON_AN_ONGOING_BASIS);
		this.addField(Field.OFFICIAL_LANGUAGE_OF_COURSE);
		this.addField(Field.FORMAT_OF_TRAINING_PROVIDED);
		this.addField(Field.CLASSES_HELD_AT);
		this.addField(Field.IN_PERSON_INSTRUCTION_PERCENT);
		this.addField(Field.ONLINE_DISTANCE_INSTRUCTION_PERCENT);
		this.addField(Field.TOTAL_NUMBER_OF_SPOTS_IN_COURSE);
		this.addField(Field.NUMBER_OF_IRCC_FUNDED_SPOTS_IN_COURSE);
		this.addField(Field.NEW_STUDENTS_CAN_ENROL_IN_THE_COURSE);
		this.addField(Field.SUPPORT_SERVICES_AVAILABLE_FOR_CLIENT_IN_THIS_COURSE);
		this.addField(Field.CARE_FOR_NEWCOMER_CHILDREN_ADULT);
		this.addField(Field.TRANSPORTATION_ADULT);
		this.addField(Field.PROVISIONS_FOR_DISABILITIES_ADULT);
		this.addField(Field.COURSE_START_DATE_YYYY_MM_DD);
		this.addField(Field.COURSE_END_DATE_YYYY_MM_DD);
		this.addField(Field.SCHEDULE_MORNING);
		this.addField(Field.SCHEDULE_AFTERNOON);
		this.addField(Field.SCHEDULE_EVENING);
		this.addField(Field.SCHEDULE_ANYTIME);
		this.addField(Field.SCHEDULE_WEEKEND);
		this.addField(Field.SCHEDULE_ONLINE);
		this.addField(Field.INSTRUCTIONAL_HOURS_PER_CLASS);
		this.addField(Field.CLASSES_PER_WEEK);
		this.addField(Field.WEEKS_OF_INSTRUCTION);
		this.addField(Field.WEEKS_OF_INSTRUCTION_PER_YEAR);
		this.addField(Field.DOMINANT_FOCUS_OF_THE_COURSE);
		this.addField(Field.COURSE_DIRECTED_AT_A_SPECIFIC_TARGET_GROUP);
		this.addField(Field.CHILDREN_0_14_YRS);
		this.addField(Field.YOUTH_15_24_YRS);
		this.addField(Field.SENIOR);
		this.addField(Field.GENDER_SPECIFIC);
		this.addField(Field.REFUGEES);
		this.addField(Field.OFFICIAL_LANGUAGE_MINORITIES);
		this.addField(Field.ETHNIC_CULTURAL_LINGUISTIC_GROUP);
		this.addField(Field.DEAF_OR_HARD_OF_HEARING);
		this.addField(Field.BLIND_OR_PARTIALLY_SIGHTED);
		this.addField(Field.CLIENTS_WITH_OTHER_IMPAIRMENTS_PHYSICAL_MENTAL);
		this.addField(Field.LESBIAN_GAY_BISEXUAL_TRANSGENDER_QUEER_LGBTQ);
		this.addField(Field.FAMILIES_PARENTS);
		this.addField(Field.CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_PROFESSION);
		this.addField(Field.CLIENTS_WITH_INTERNATIONAL_TRAINING_IN_A_REGULATED_TRADE);
		this.addField(Field.MATERIALS_USED_IN_COURSE);
		this.addField(Field.CITIZENSHIP_PREPARATION);
		this.addField(Field.PBLA_LANGUAGE_COMPANION);
		this.addField(Field.CONTACT_NAME);
		this.addField(Field.STREET_NUMBER);
		this.addField(Field.STREET_NAME);
		this.addField(Field.STREET_TYPE);
		this.addField(Field.STREET_DIRECTION);
		this.addField(Field.UNIT_SUITE_APT);
		this.addField(Field.PROVINCE);
		this.addField(Field.CITY);
		this.addField(Field.POSTAL_CODE);
		this.addField(Field.TELEPHONE_NUMBER);
		this.addField(Field.TELEPHONE_EXTENSION);
		this.addField(Field.EMAIL_ADDRESS);
		this.addField(Field.LISTENING_SKILL_LEVEL_1);
		this.addField(Field.LISTENING_SKILL_LEVEL_2);
		this.addField(Field.LISTENING_SKILL_LEVEL_3);
		this.addField(Field.LISTENING_SKILL_LEVEL_4);
		this.addField(Field.LISTENING_SKILL_LEVEL_5);
		this.addField(Field.LISTENING_SKILL_LEVEL_6);
		this.addField(Field.LISTENING_SKILL_LEVEL_7);
		this.addField(Field.LISTENING_SKILL_LEVEL_8);
		this.addField(Field.LISTENING_SKILL_LEVEL_9);
		this.addField(Field.LISTENING_SKILL_LEVEL_10);
		this.addField(Field.LISTENING_SKILL_LEVEL_11);
		this.addField(Field.LISTENING_SKILL_LEVEL_12);
		this.addField(Field.SPEAKING_SKILL_LEVEL_1);
		this.addField(Field.SPEAKING_SKILL_LEVEL_2);
		this.addField(Field.SPEAKING_SKILL_LEVEL_3);
		this.addField(Field.SPEAKING_SKILL_LEVEL_4);
		this.addField(Field.SPEAKING_SKILL_LEVEL_5);
		this.addField(Field.SPEAKING_SKILL_LEVEL_6);
		this.addField(Field.SPEAKING_SKILL_LEVEL_7);
		this.addField(Field.SPEAKING_SKILL_LEVEL_8);
		this.addField(Field.SPEAKING_SKILL_LEVEL_9);
		this.addField(Field.SPEAKING_SKILL_LEVEL_10);
		this.addField(Field.SPEAKING_SKILL_LEVEL_11);
		this.addField(Field.SPEAKING_SKILL_LEVEL_12);
		this.addField(Field.READING_SKILL_LEVEL_1);
		this.addField(Field.READING_SKILL_LEVEL_2);
		this.addField(Field.READING_SKILL_LEVEL_3);
		this.addField(Field.READING_SKILL_LEVEL_4);
		this.addField(Field.READING_SKILL_LEVEL_5);
		this.addField(Field.READING_SKILL_LEVEL_6);
		this.addField(Field.READING_SKILL_LEVEL_7);
		this.addField(Field.READING_SKILL_LEVEL_8);
		this.addField(Field.READING_SKILL_LEVEL_9);
		this.addField(Field.READING_SKILL_LEVEL_10);
		this.addField(Field.READING_SKILL_LEVEL_11);
		this.addField(Field.READING_SKILL_LEVEL_12);
		this.addField(Field.READING_SKILL_LEVEL_13);
		this.addField(Field.READING_SKILL_LEVEL_14);
		this.addField(Field.READING_SKILL_LEVEL_15);
		this.addField(Field.READING_SKILL_LEVEL_16);
		this.addField(Field.READING_SKILL_LEVEL_17);
		this.addField(Field.WRITING_SKILL_LEVEL_1);
		this.addField(Field.WRITING_SKILL_LEVEL_2);
		this.addField(Field.WRITING_SKILL_LEVEL_3);
		this.addField(Field.WRITING_SKILL_LEVEL_4);
		this.addField(Field.WRITING_SKILL_LEVEL_5);
		this.addField(Field.WRITING_SKILL_LEVEL_6);
		this.addField(Field.WRITING_SKILL_LEVEL_7);
		this.addField(Field.WRITING_SKILL_LEVEL_8);
		this.addField(Field.WRITING_SKILL_LEVEL_9);
		this.addField(Field.WRITING_SKILL_LEVEL_10);
		this.addField(Field.WRITING_SKILL_LEVEL_11);
		this.addField(Field.WRITING_SKILL_LEVEL_12);
		this.addField(Field.WRITING_SKILL_LEVEL_13);
		this.addField(Field.WRITING_SKILL_LEVEL_14);
		this.addField(Field.WRITING_SKILL_LEVEL_15);
		this.addField(Field.WRITING_SKILL_LEVEL_16);
		this.addField(Field.WRITING_SKILL_LEVEL_17);
		

		super.doPost(request, response);

	}

}
