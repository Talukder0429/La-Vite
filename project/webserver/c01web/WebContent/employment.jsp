<html>
	<head>
		<script type="text/javascript" src="clientprofile.js"></script>
		<!--other script and also external css included over here-->
	</head>
	<body onload="FindFields()">
		<span>Record Id</span><textarea id="updateRecordID" rows="1" cols="35"></textarea><br />
		<span>Unique Identifier Value: </span><textarea id="uniqueId" rows="1" cols="35"></textarea><br />
		<span>Date of Birth: </span><textarea id="DOB" rows="1" cols="35"></textarea><br />
		<span>Postal Code: </span><textarea id="postalCode" rows="1" cols="35"></textarea><br />
		<span>Registration in Employment Intervention: </span><br />
		<div id="employmentIntervention">
			<input type="radio" name="employmentIntervention" value="False"> No<br>
			<input type="radio" name="employmentIntervention" value="True"> Yes<br>
		</div>
		<span>Referral To: </span><textarea id="referralTo" rows="1" cols="35"></textarea><br />
		<span>Language of Service: </span><textarea id="languageOfService" rows="1" cols="35"></textarea><br />
		<span>Official Language: </span><textarea id="officalLanguage" rows="1" cols="35"></textarea><br />
		<span>Type of Institution: </span><textarea id="typeOfInstitution" rows="1" cols="35"></textarea><br />
		<span>Referred By: </span><textarea id="referredBy" rows="1" cols="35"></textarea><br />
		<span>Referral Date: </span><textarea id="referralDate" rows="1" cols="35"></textarea><br />
		<span>Employment Status: </span><textarea id="employmentStatus" rows="1" cols="35"></textarea><br />
		<span>Education Status: </span><textarea id="educationStatus" rows="1" cols="35"></textarea><br />
		<span>Occupation in Canada: </span><textarea id="occupationCanada" rows="1" cols="35"></textarea><br />
		<span>Intended Occupation: </span><textarea id="intendedOccupation" rows="1" cols="35"></textarea><br />
		<span>Type of Intervention: </span><textarea id="interventionType" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention Received: </span><textarea id="interventionRecieved" rows="1" cols="35"></textarea><br />
		<span>Status of Long Term Intervention: </span><textarea id="lti_statusOfIntervention" rows="1" cols="35"></textarea><br />
		<span>Reason for Leaving Long Term Intervention: </span><textarea id="lti_leaveIntervention" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention Start Date: </span><textarea id="lti_startDate" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention End Date: </span><textarea id="lti_endDate" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention Placement: </span><textarea id="lti_placement" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention Employer Size: </span><textarea id="lti_EmployerSize" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention Mentor Hours Per Week: </span><textarea id="lti_mentorHoursPerWeek" rows="1" cols="35"></textarea><br />
		<span>Long Term Intervention Client Mentor Met Regularly At: </span><textarea id="lti_clientMentor" rows="1" cols="35"></textarea><br />
		<span>Essential Skills: </span><br />
		<div id="essentialSkills">
			<input type="radio" name="essentialSkills" value="False"> No<br>
			<input type="radio" name="essentialSkills" value="True"> Yes<br>
		</div>
		<span>Computer Skills: </span><br />
		<div id="computerSkills">
			<input type="radio" name="computerSkills" value="False"> No<br>
			<input type="radio" name="computerSkills" value="True"> Yes<br>
		</div>
		<span>Document Use: </span><br />
		<div id="documentUse">
			<input type="radio" name="documentUse" value="False"> No<br>
			<input type="radio" name="documentUse" value="True"> Yes<br>
		</div>
		<span>Interpersonal Skills: </span><br />
		<div id="interpersonalSkills">
			<input type="radio" name="interpersonalSkills" value="False"> No<br>
			<input type="radio" name="interpersonalSkills" value="True"> Yes<br>
		</div>	
		<span>Leadership Training: </span><br />
		<div id="leadershipTraining">
			<input type="radio" name="leadershipTraining" value="False"> No<br>
			<input type="radio" name="leadershipTraining" value="True"> Yes<br>
		</div>		
		<span>Numeracy: </span><br />
		<div id="numeracy">
			<input type="radio" name="numeracy" value="False"> No<br>
			<input type="radio" name="numeracy" value="True"> Yes<br>
		</div>		
		<span>Short Term Intervention Service Received </span><textarea id="shortTermIntervention" rows="1" cols="35"></textarea><br />
		<span>Short Term Intervention date </span><textarea id="sti_date" rows="1" cols="35"></textarea><br />
		<span>Support Service Received: </span><br />
		<div id="supportService">
			<input type="radio" name="supportService" value="False"> No<br>
			<input type="radio" name="supportService" value="True"> Yes<br>
		</div>		
		<span>Newcomer Children Care: </span><br />
		<div id="careNewcomerChildren">
			<input type="radio" name="careNewcomerChildren" value="False"> No<br>
			<input type="radio" name="careNewcomerChildren" value="True"> Yes<br>
		</div>		
		<span>Child One Age: </span><textarea id="childOneAge" rows="1" cols="35"></textarea><br />
		<span>Child One Type of Care: </span><textarea id="childOne_TOC" rows="1" cols="35"></textarea><br />
		<span>Child Two Age: </span><textarea id="childTwoAge" rows="1" cols="35"></textarea><br />
		<span>Child Two Type of Care: </span><textarea id="childTwo_TOC" rows="1" cols="35"></textarea><br />
		<span>Child Three Age: </span><textarea id="childThreeAge" rows="1" cols="35"></textarea><br />
		<span>Child Three Type of Care: </span><textarea id="childThree_TOC" rows="1" cols="35"></textarea><br />
		<span>Child Four Age: </span><textarea id="childFourAge" rows="1" cols="35"></textarea><br />
		<span>Child Four Type of Care: </span><textarea id="childFour_TOC" rows="1" cols="35"></textarea><br />
		<span>Child Five Age: </span><textarea id="childFiveAge" rows="1" cols="35"></textarea><br />
		<span>Child Five Type of Care: </span><textarea id="childFive_TOC" rows="1" cols="35"></textarea><br />
		<span>Transportation: </span><br />
		<div id="transportation">
			<input type="radio" name="transportation" value="False"> No<br>
			<input type="radio" name="transportation" value="True"> Yes<br>
		</div>		
		<span>Provisional Disabilities: </span><br />
		<div id="provisionDisabilities">
			<input type="radio" name="provisionDisabilities" value="False"> No<br>
			<input type="radio" name="provisionDisabilities" value="True"> Yes<br>
		</div>
		<span>Translation: </span><br />
		<div id="translation">
			<input type="radio" name="translation" value="False"> No<br>
			<input type="radio" name="translation" value="True"> Yes<br>
		</div>		
		<span>Translation From Language: </span><textarea id="translationFrom" rows="1" cols="35"></textarea><br />
		<span>Translation To Language: </span><textarea id="translationTo" rows="1" cols="35"></textarea><br />
		<span>Interpretation: </span><br />
		<div id="interpretation">
			<input type="radio" name="interpretation" value="False"> No<br>
			<input type="radio" name="interpretation" value="True"> Yes<br>
		</div>		
		<span>Interpretation From: </span><textarea id="interpretationFrom" rows="1" cols="35"></textarea><br />
		<span>Interpretation To: </span><textarea id="interpretationTo" rows="1" cols="35"></textarea><br />
		<span>Crisis Counselling </span><br />
		<div id="crisisCounselling">
			<input type="radio" name="crisisCounselling" value="False"> No<br>
			<input type="radio" name="crisisCounselling" value="True"> Yes<br>
		</div>		
		<span>Hours Spent With Client: </span><textarea id="timeWithClient_HR" rows="1" cols="35"></textarea><br />
		<span>Minutes Spent With Client: </span><textarea id="timeWithClient_Min" rows="1" cols="35"></textarea><br />
		<span>Reason For Update: </span><textarea id="reasonForUpdate" rows="1" cols="35"></textarea><br />
		<input type="submit" onclick="SubmitData()">
	</body>
</html>