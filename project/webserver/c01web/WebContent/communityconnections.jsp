<html>
	<head>
		<script type="text/javascript" src="communityconnections.js"></script>
		<!--other script and also external css included over here-->
	</head>
	<body onload="FindFields()">
		<span>Update Record ID: </span><textarea id="update_record_id" rows="1" cols="35"></textarea><br />
		<span>Unique Identifier: </span><textarea id="unique_identifier" rows="1" cols="35"></textarea><br />
		<span>Unique Identifier Value: </span><textarea id="unique_identifier_value" rows="1" cols="35"></textarea><br />
		<span>Date of Birth: </span><textarea id="date_of_birth" rows="1" cols="35"></textarea><br />
		<span>Postal Code: </span><textarea id="postal_code" rows="1" cols="35"></textarea><br />
		<span>Language of Service: </span><textarea id="language_of_service" rows="1" cols="35"></textarea><br />
		<span>Official Language of Preference: </span><textarea id="official_language_of_preference" rows="1" cols="35"></textarea><br />
		<span>Referred By: </span><textarea id="referred_by" rows="1" cols="35"></textarea><br />
		<span>Activity Under Which the Client Received Services: </span><textarea id="activity_under_which" rows="1" cols="35"></textarea><br />
		<span>Type of Institution/Organization Where Client Received Services: </span><textarea id="type_of_institution" rows="1" cols="35"></textarea><br />
		<span>Type of Event Attended: </span><textarea id="type_of_event" rows="1" cols="35"></textarea><br />
		<span>Type of Service: </span><textarea id="type_of_service" rows="1" cols="35"></textarea><br />
		<span>Main Topic/Focus of the Service Received: </span><textarea id="main_topic_of_service" rows="1" cols="35"></textarea><br />
		<span>Service Received: </span><textarea id="service_received" rows="1" cols="35"></textarea><br />
		<span>Number of Unique Participants: </span><textarea id="number_of_unique_participants" rows="1" cols="35"></textarea><br />
		<span>Did Volunteers from the Host Community Participate in the Activity: </span> <br />
		<div id="did_volunteers">
			<input type="radio" name="did_volunteers" value="False"> No<br>
			<input type="radio" name="did_volunteers" value="True"> Yes<br>
		</div>
		<span>Directed at a Specific Target Group: </span> <br />
		<div id="directed_at_group">
			<input type="radio" name="directed_at_group" value="False"> No<br>
			<input type="radio" name="directed_at_group" value="True"> Yes<br>
		</div>
		<span>Target Group: Children (0-14 yrs): </span> <br />
		<div id="target_group_children">
			<input type="radio" name="target_group_children" value="False"> No<br>
			<input type="radio" name="target_group_children" value="True"> Yes<br>
		</div>
		<span>Target Group: Youth (15-24 yrs): </span> <br />
		<div id="target_group_youth">
			<input type="radio" name="target_group_youth" value="False"> No<br>
			<input type="radio" name="target_group_youth" value="True"> Yes<br>
		</div>
		<span>Target Group: Senior: </span> <br />
		<div id="target_group_senior">
			<input type="radio" name="target_group_senior" value="False"> No<br>
			<input type="radio" name="target_group_senior" value="True"> Yes<br>
		</div>
		<span>Target Group: Gender-Specific: </span> <br />
		<div id="target_group_gender_specific">
			<input type="radio" name="target_group_gender_specific" value="False"> No<br>
			<input type="radio" name="target_group_gender_specific" value="True"> Yes<br>
		</div>
		<span>Target Group: Refugees: </span> <br />
		<div id="target_group_refugees">
			<input type="radio" name="target_group_refugees" value="False"> No<br>
			<input type="radio" name="target_group_refugees" value="True"> Yes<br>
		</div>
		<span>Target Group: Ethnic/cultural/linguistic group: </span> <br />
		<div id="target_group_ethnic">
			<input type="radio" name="target_group_ethnic" value="False"> No<br>
			<input type="radio" name="target_group_ethnic" value="True"> Yes<br>
		</div>
		<span>Target Group: Deaf or Hard of Hearing: </span> <br />
		<div id="target_group_deaf">
			<input type="radio" name="target_group_deaf" value="False"> No<br>
			<input type="radio" name="target_group_deaf" value="True"> Yes<br>
		</div>
		<span>Target Group: Blind or Partially Sighted: </span> <br />
		<div id="target_group_blind">
			<input type="radio" name="target_group_blind" value="False"> No<br>
			<input type="radio" name="target_group_blind" value="True"> Yes<br>
		</div>
		<span>Target Group: Lesbian, Gay, Bisexual, Transgender, Queer (LGBTQ): </span> <br />
		<div id="target_group_lgbtq">
			<input type="radio" name="target_group_lgbtq" value="False"> No<br>
			<input type="radio" name="target_group_lgbtq" value="True"> Yes<br>
		</div>
		<span>Target Group: Families/Parents: </span> <br />
		<div id="target_group_families">
			<input type="radio" name="target_group_families" value="False"> No<br>
			<input type="radio" name="target_group_families" value="True"> Yes<br>
		</div>
		<span>Target Group: Other Impairments (physical, mental): </span> <br />
		<div id="target_group_other_impairments">
			<input type="radio" name="target_group_other_impairments" value="False"> No<br>
			<input type="radio" name="target_group_other_impairments" value="True"> Yes<br>
		</div>
		<span>Target Group: Clients with international training in a regulated profession: </span> <br />
		<div id="target_group_profession">
			<input type="radio" name="target_group_profession" value="False"> No<br>
			<input type="radio" name="target_group_profession" value="True"> Yes<br>
		</div>
		<span>Target Group: Clients with international training in a regulated trade: </span> <br />
		<div id="target_group_trade">
			<input type="radio" name="target_group_trade" value="False"> No<br>
			<input type="radio" name="target_group_trade" value="True"> Yes<br>
		</div>
		<span>Target Group: Official language minorities: </span> <br />
		<div id="target_group_minority">
			<input type="radio" name="target_group_minority" value="False"> No<br>
			<input type="radio" name="target_group_minority" value="True"> Yes<br>
		</div>
		<span>Status of Service: </span><textarea id="status_of_service" rows="1" cols="35"></textarea><br />
		<span>Reason for Leaving Service: </span><textarea id="reason_for_leaving" rows="1" cols="35"></textarea><br />
		<span>Start Date (YYYY-MM-DD): </span><textarea id="start_date" rows="1" cols="35"></textarea><br />
		<span>End Date (YYYY-MM-DD): </span><textarea id="end_date" rows="1" cols="35"></textarea><br />
		<span>Projected End Date (YYYY-MM-DD): </span><textarea id="projected_end_date" rows="1" cols="35"></textarea><br />
		<span>Was Essential Skills and Aptitudes Training Received as Part of the Service?: </span> <br />
		<div id="essential_skills">
			<input type="radio" name="essential_skills" value="False"> No<br>
			<input type="radio" name="essential_skills" value="True"> Yes<br>
		</div>
		<span>Computer Skills: </span> <br />
		<div id="computer_skills">
			<input type="radio" name="computer_skills" value="False"> No<br>
			<input type="radio" name="computer_skills" value="True"> Yes<br>
		</div>
		<span>Document Use: </span> <br />
		<div id="document_use">
			<input type="radio" name="document_use" value="False"> No<br>
			<input type="radio" name="document_use" value="True"> Yes<br>
		</div>
		<span>Interpersonal Skills and Workplace Culture: </span> <br />
		<div id="interpersonal_skills">
			<input type="radio" name="interpersonal_skills" value="False"> No<br>
			<input type="radio" name="interpersonal_skills" value="True"> Yes<br>
		</div>
		<span>Leadership Training: </span> <br />
		<div id="leadership_training">
			<input type="radio" name="leadership_training" value="False"> No<br>
			<input type="radio" name="leadership_training" value="True"> Yes<br>
		</div>
		<span>Life Skills: </span> <br />
		<div id="life_skills">
			<input type="radio" name="life_skills" value="False"> No<br>
			<input type="radio" name="life_skills" value="True"> Yes<br>
		</div>
		<span>Numeracy: </span> <br />
		<div id="numeracy">
			<input type="radio" name="numeracy" value="False"> No<br>
			<input type="radio" name="numeracy" value="True"> Yes<br>
		</div>
		<span>Support Services Received: </span> <br />
		<div id="support_services_received">
			<input type="radio" name="support_services_received" value="False"> No<br>
			<input type="radio" name="support_services_received" value="True"> Yes<br>
		</div>
		<span>Care for Newcomer Children: </span> <br />
		<div id="care_for_newcomer_children">
			<input type="radio" name="care_for_newcomer_children" value="False"> No<br>
			<input type="radio" name="care_for_newcomer_children" value="True"> Yes<br>
		</div>
		<input type="submit" onclick="SubmitData()">
	</body>
</html>
