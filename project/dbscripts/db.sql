CREATE DATABASE  IF NOT EXISTS `c01web` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `c01web`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: c01web
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `client_profile`
--

DROP TABLE IF EXISTS `client_profile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `client_profile` (
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `phone_number` tinytext NOT NULL,
  `does_the_client_have_an_email_address` tinytext NOT NULL,
  `email_address` tinytext NOT NULL,
  `street_number` tinytext NOT NULL,
  `street_name` tinytext NOT NULL,
  `street_type` tinytext NOT NULL,
  `street_direction` tinytext NOT NULL,
  `unit_suite_apt` tinytext NOT NULL,
  `city` tinytext NOT NULL,
  `province` tinytext NOT NULL,
  `postal_code` tinytext NOT NULL,
  `official_language_of_preference` tinytext NOT NULL,
  `consent_for_future_research_consultation` tinytext NOT NULL,
  PRIMARY KEY (`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client_profile`
--

LOCK TABLES `client_profile` WRITE;
/*!40000 ALTER TABLE `client_profile` DISABLE KEYS */;
/*!40000 ALTER TABLE `client_profile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `community_connections`
--

DROP TABLE IF EXISTS `community_connections`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `community_connections` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `postal_code_where_the_service_was_received` tinytext NOT NULL,
  `language_of_service` tinytext NOT NULL,
  `official_language_of_preference` tinytext NOT NULL,
  `referred_by` tinytext NOT NULL,
  `activity_under_which_client_received_services` tinytext NOT NULL,
  `type_of_institution_organization_where_client_received_services` tinytext NOT NULL,
  `type_of_event_attended` tinytext NOT NULL,
  `type_of_service` tinytext NOT NULL,
  `main_topic_focus_of_the_service_received` tinytext NOT NULL,
  `service_received` tinytext NOT NULL,
  `number_of_unique_participants` tinytext NOT NULL,
  `longfield_5` tinytext NOT NULL,
  `directed_at_a_specific_target_group` tinytext NOT NULL,
  `target_group_children_0_14_yrs` tinytext NOT NULL,
  `target_group_youth_15_24_yrs` tinytext NOT NULL,
  `target_group_senior` tinytext NOT NULL,
  `target_group_gender_specific` tinytext NOT NULL,
  `target_group_refugees` tinytext NOT NULL,
  `target_group_ethnic_cultural_linguistic_group` tinytext NOT NULL,
  `target_group_deaf_or_hard_of_hearing` tinytext NOT NULL,
  `target_group_blind_or_partially_sighted` tinytext NOT NULL,
  `target_group_lesbian_gay_bisexual_transgender_queer_lgbtq` tinytext NOT NULL,
  `target_group_families_parents` tinytext NOT NULL,
  `target_group_other_impairments_physical_mental` tinytext NOT NULL,
  `longfield_6` tinytext NOT NULL,
  `longfield_7` tinytext NOT NULL,
  `target_group_official_language_minorities` tinytext NOT NULL,
  `status_of_service` tinytext NOT NULL,
  `reason_for_leaving_service` tinytext NOT NULL,
  `start_date_yyyy_mm_dd` tinytext NOT NULL,
  `end_date_yyyy_mm_dd` tinytext NOT NULL,
  `projected_end_date_yyyy_mm_dd` tinytext NOT NULL,
  `longfield_8` tinytext NOT NULL,
  `computer_skills` tinytext NOT NULL,
  `document_use` tinytext NOT NULL,
  `interpersonal_skills_and_workplace_culture` tinytext NOT NULL,
  `leadership_training` tinytext NOT NULL,
  `life_skills` tinytext NOT NULL,
  `numeracy` tinytext NOT NULL,
  `support_services_received` tinytext NOT NULL,
  `care_for_newcomer_children_child` tinytext NOT NULL,
  `child_1_age` tinytext NOT NULL,
  `child_1_type_of_care` tinytext NOT NULL,
  `child_2_age` tinytext NOT NULL,
  `child_2_type_of_care` tinytext NOT NULL,
  `child_3_age` tinytext NOT NULL,
  `child_3_type_of_care` tinytext NOT NULL,
  `child_4_age` tinytext NOT NULL,
  `child_4_type_of_care` tinytext NOT NULL,
  `child_5_age` tinytext NOT NULL,
  `child_5_type_of_care` tinytext NOT NULL,
  `transportation_child` tinytext NOT NULL,
  `provisions_for_disabilities_child` tinytext NOT NULL,
  `translation_child` tinytext NOT NULL,
  `between_translation` tinytext NOT NULL,
  `and_translation` tinytext NOT NULL,
  `interpretation_child` tinytext NOT NULL,
  `between_interpretation` tinytext NOT NULL,
  `and_interpretation` tinytext NOT NULL,
  `crisis_counselling_child` tinytext NOT NULL,
  `total_length_of_service_hours` tinytext NOT NULL,
  `total_length_of_service_minutes` tinytext NOT NULL,
  `reason_for_update` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`,`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `community_connections`
--

LOCK TABLES `community_connections` WRITE;
/*!40000 ALTER TABLE `community_connections` DISABLE KEYS */;
/*!40000 ALTER TABLE `community_connections` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employment`
--

DROP TABLE IF EXISTS `employment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employment` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `postal_code_where_the_service_was_received` tinytext NOT NULL,
  `registration_in_an_employment_intervention` tinytext NOT NULL,
  `a_referral_to` tinytext NOT NULL,
  `language_of_service` tinytext NOT NULL,
  `official_language_of_preference` tinytext NOT NULL,
  `type_of_institution_organization_where_client_received_services` tinytext NOT NULL,
  `referred_by` tinytext NOT NULL,
  `referral_date_yyyy_mm_dd` tinytext NOT NULL,
  `employment_status` tinytext NOT NULL,
  `education_status` tinytext NOT NULL,
  `occupation_in_canada` tinytext NOT NULL,
  `intended_occupation` tinytext NOT NULL,
  `intervention_type` tinytext NOT NULL,
  `long_term_intervention_intervention_received` tinytext NOT NULL,
  `long_term_intervention_status_of_intervention` tinytext NOT NULL,
  `long_term_intervention_reason_for_leaving_intervention` tinytext NOT NULL,
  `long_term_intervention_start_date_yyyy_mm_dd` tinytext NOT NULL,
  `long_term_intervention_end_date_yyyy_mm_dd` tinytext NOT NULL,
  `long_term_intervention_size_of_employer` tinytext NOT NULL,
  `long_term_intervention_placement_was` tinytext NOT NULL,
  `long_term_intervention_hours_per_week` tinytext NOT NULL,
  `long_term_intervention_client_met_mentor_regularly_at` tinytext NOT NULL,
  `long_term_intervention_average_hours_week_in_contact_with_mentor` tinytext NOT NULL,
  `longfield_11` tinytext NOT NULL,
  `longfield_8` tinytext NOT NULL,
  `computer_skills` tinytext NOT NULL,
  `document_use` tinytext NOT NULL,
  `interpersonal_skills_and_workplace_culture` tinytext NOT NULL,
  `leadership_training` tinytext NOT NULL,
  `numeracy` tinytext NOT NULL,
  `short_term_intervention_service_received` tinytext NOT NULL,
  `short_term_intervention_date_yyyy_mm_dd` tinytext NOT NULL,
  `support_services_received` tinytext NOT NULL,
  `care_for_newcomer_children_child` tinytext NOT NULL,
  `child_1_age` tinytext NOT NULL,
  `child_1_type_of_care` tinytext NOT NULL,
  `child_2_age` tinytext NOT NULL,
  `child_2_type_of_care` tinytext NOT NULL,
  `child_3_age` tinytext NOT NULL,
  `child_3_type_of_care` tinytext NOT NULL,
  `child_4_age` tinytext NOT NULL,
  `child_4_type_of_care` tinytext NOT NULL,
  `child_5_age` tinytext NOT NULL,
  `child_5_type_of_care` tinytext NOT NULL,
  `transportation_adult` tinytext NOT NULL,
  `transportation_child` tinytext NOT NULL,
  `provisions_for_disabilities_child` tinytext NOT NULL,
  `translation_child` tinytext NOT NULL,
  `between_translation` tinytext NOT NULL,
  `and_translation` tinytext NOT NULL,
  `interpretation_child` tinytext NOT NULL,
  `between_interpretation` tinytext NOT NULL,
  `and_interpretation` tinytext NOT NULL,
  `crisis_counselling_child` tinytext NOT NULL,
  `time_spent_with_client_addressing_clients_employment_needs_hours` tinytext NOT NULL,
  `longfield_12` tinytext NOT NULL,
  `reason_for_update` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`,`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employment`
--

LOCK TABLES `employment` WRITE;
/*!40000 ALTER TABLE `employment` DISABLE KEYS */;
/*!40000 ALTER TABLE `employment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `information_and_orientation`
--

DROP TABLE IF EXISTS `information_and_orientation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `information_and_orientation` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `postal_code_where_the_service_was_received` tinytext NOT NULL,
  `start_date_of_service_yyyy_mm_dd` tinytext NOT NULL,
  `language_of_service` tinytext NOT NULL,
  `official_language_of_preference` tinytext NOT NULL,
  `type_of_institution_organization_where_client_received_services` tinytext NOT NULL,
  `referred_by` tinytext NOT NULL,
  `service_received` tinytext NOT NULL,
  `total_length_of_orientation` tinytext NOT NULL,
  `total_length_of_orientation_hours` tinytext NOT NULL,
  `total_length_of_orientation_minutes` tinytext NOT NULL,
  `number_of_clients_in_group` tinytext NOT NULL,
  `directed_at_a_specific_target_group` tinytext NOT NULL,
  `target_group_children_0_14_yrs` tinytext NOT NULL,
  `target_group_youth_15_24_yrs` tinytext NOT NULL,
  `target_group_senior` tinytext NOT NULL,
  `target_group_gender_specific` tinytext NOT NULL,
  `target_group_refugees` tinytext NOT NULL,
  `target_group_ethnic_cultural_linguistic_group` tinytext NOT NULL,
  `target_group_deaf_or_hard_of_hearing` tinytext NOT NULL,
  `target_group_blind_or_partially_sighted` tinytext NOT NULL,
  `target_group_lesbian_gay_bisexual_transgender_queer_lgbtq` tinytext NOT NULL,
  `target_group_families_parents` tinytext NOT NULL,
  `target_group_other_impairments_physical_mental` tinytext NOT NULL,
  `longfield_6` tinytext NOT NULL,
  `longfield_7` tinytext NOT NULL,
  `target_group_official_language_minorities` tinytext NOT NULL,
  `overview_of_canada` tinytext NOT NULL,
  `overview_of_canada_referrals` tinytext NOT NULL,
  `sources_of_information` tinytext NOT NULL,
  `sources_of_information_referrals` tinytext NOT NULL,
  `rights_and_freedoms` tinytext NOT NULL,
  `rights_and_freedoms_referrals` tinytext NOT NULL,
  `canadian_law_and_justice` tinytext NOT NULL,
  `canadian_law_and_justice_referrals` tinytext NOT NULL,
  `important_documents` tinytext NOT NULL,
  `important_documents_referrals` tinytext NOT NULL,
  `improving_english_or_french` tinytext NOT NULL,
  `improving_english_or_french_referrals` tinytext NOT NULL,
  `employment_and_income` tinytext NOT NULL,
  `employment_and_income_referrals` tinytext NOT NULL,
  `education` tinytext NOT NULL,
  `education_referrals` tinytext NOT NULL,
  `housing` tinytext NOT NULL,
  `housing_referrals` tinytext NOT NULL,
  `health` tinytext NOT NULL,
  `health_referrals` tinytext NOT NULL,
  `money_and_finances` tinytext NOT NULL,
  `money_and_finances_referrals` tinytext NOT NULL,
  `transportation_adult` tinytext NOT NULL,
  `transportation_referrals` tinytext NOT NULL,
  `communications_and_media` tinytext NOT NULL,
  `communications_and_media_referrals` tinytext NOT NULL,
  `community_engagement` tinytext NOT NULL,
  `community_engagement_referrals` tinytext NOT NULL,
  `becoming_a_canadian_citizen` tinytext NOT NULL,
  `becoming_a_canadian_citizen_referrals` tinytext NOT NULL,
  `interpersonal_conflict` tinytext NOT NULL,
  `interpersonal_conflict_referrals` tinytext NOT NULL,
  `longfield_8` tinytext NOT NULL,
  `computer_skills` tinytext NOT NULL,
  `document_use` tinytext NOT NULL,
  `interpersonal_skills_and_workplace_culture` tinytext NOT NULL,
  `leadership_training` tinytext NOT NULL,
  `numeracy` tinytext NOT NULL,
  `longfield_9` tinytext NOT NULL,
  `life_skills` tinytext NOT NULL,
  `longfield_10` tinytext NOT NULL,
  `support_services_received` tinytext NOT NULL,
  `care_for_newcomer_children_child` tinytext NOT NULL,
  `child_1_age` tinytext NOT NULL,
  `child_1_type_of_care` tinytext NOT NULL,
  `child_2_age` tinytext NOT NULL,
  `child_2_type_of_care` tinytext NOT NULL,
  `child_3_age` tinytext NOT NULL,
  `child_3_type_of_care` tinytext NOT NULL,
  `child_4_age` tinytext NOT NULL,
  `child_4_type_of_care` tinytext NOT NULL,
  `child_5_age` tinytext NOT NULL,
  `child_5_type_of_care` tinytext NOT NULL,
  `transportation_child` tinytext NOT NULL,
  `provisions_for_disabilities_child` tinytext NOT NULL,
  `translation_child` tinytext NOT NULL,
  `between_translation` tinytext NOT NULL,
  `and_translation` tinytext NOT NULL,
  `interpretation_child` tinytext NOT NULL,
  `between_interpretation` tinytext NOT NULL,
  `and_interpretation` tinytext NOT NULL,
  `crisis_counselling_child` tinytext NOT NULL,
  `end_date_of_service_yyyy_mm_dd` tinytext NOT NULL,
  `reason_for_update` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`,`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `information_and_orientation`
--

LOCK TABLES `information_and_orientation` WRITE;
/*!40000 ALTER TABLE `information_and_orientation` DISABLE KEYS */;
/*!40000 ALTER TABLE `information_and_orientation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language_training_client_enrollment`
--

DROP TABLE IF EXISTS `language_training_client_enrollment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `language_training_client_enrollment` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `postal_code_where_the_service_was_received` tinytext NOT NULL,
  `course_code` tinytext NOT NULL,
  `date_of_clients_first_class_yyyy_mm_dd` tinytext NOT NULL,
  `official_language_of_preference` tinytext NOT NULL,
  `support_services_received` tinytext NOT NULL,
  `care_for_newcomer_children_child` tinytext NOT NULL,
  `child_1_age` tinytext NOT NULL,
  `child_1_type_of_care` tinytext NOT NULL,
  `child_2_age` tinytext NOT NULL,
  `child_2_type_of_care` tinytext NOT NULL,
  `child_3_age` tinytext NOT NULL,
  `child_3_type_of_care` tinytext NOT NULL,
  `child_4_age` tinytext NOT NULL,
  `child_4_type_of_care` tinytext NOT NULL,
  `child_5_age` tinytext NOT NULL,
  `child_5_type_of_care` tinytext NOT NULL,
  `transportation_child` tinytext NOT NULL,
  `provisions_for_disabilities_child` tinytext NOT NULL,
  `translation_child` tinytext NOT NULL,
  `between_translation` tinytext NOT NULL,
  `and_translation` tinytext NOT NULL,
  `interpretation_child` tinytext NOT NULL,
  `between_interpretation` tinytext NOT NULL,
  `and_interpretation` tinytext NOT NULL,
  `crisis_counselling_child` tinytext NOT NULL,
  `reason_for_update` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`,`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language_training_client_enrollment`
--

LOCK TABLES `language_training_client_enrollment` WRITE;
/*!40000 ALTER TABLE `language_training_client_enrollment` DISABLE KEYS */;
/*!40000 ALTER TABLE `language_training_client_enrollment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language_training_client_exit`
--

DROP TABLE IF EXISTS `language_training_client_exit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `language_training_client_exit` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `course_code` tinytext NOT NULL,
  `clients_training_status` tinytext NOT NULL,
  `date_client_exited_course_yyyy_mm_dd` tinytext NOT NULL,
  `reason_for_exiting_course` tinytext NOT NULL,
  `listening_clb_level` tinytext NOT NULL,
  `reading_clb_level` tinytext NOT NULL,
  `speaking_clb_level` tinytext NOT NULL,
  `writing_clb_level` tinytext NOT NULL,
  `was_a_certificate_issued_to_the_client` tinytext NOT NULL,
  `listening_level_indicated_on_certificate` tinytext NOT NULL,
  `speaking_level_indicated_on_certificate` tinytext NOT NULL,
  `support_services_received` tinytext NOT NULL,
  `care_for_newcomer_children_child` tinytext NOT NULL,
  `child_1_age` tinytext NOT NULL,
  `child_1_type_of_care` tinytext NOT NULL,
  `child_2_age` tinytext NOT NULL,
  `child_2_type_of_care` tinytext NOT NULL,
  `child_3_age` tinytext NOT NULL,
  `child_3_type_of_care` tinytext NOT NULL,
  `child_4_age` tinytext NOT NULL,
  `child_4_type_of_care` tinytext NOT NULL,
  `child_5_age` tinytext NOT NULL,
  `child_5_type_of_care` tinytext NOT NULL,
  `transportation_adult` tinytext NOT NULL,
  `transportation_child` tinytext NOT NULL,
  `provisions_for_disabilities_child` tinytext NOT NULL,
  `translation_child` tinytext NOT NULL,
  `between_translation` tinytext NOT NULL,
  `and_translation` tinytext NOT NULL,
  `interpretation_child` tinytext NOT NULL,
  `between_interpretation` tinytext NOT NULL,
  `and_interpretation` tinytext NOT NULL,
  `crisis_counselling_child` tinytext NOT NULL,
  `reason_for_update` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`,`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language_training_client_exit`
--

LOCK TABLES `language_training_client_exit` WRITE;
/*!40000 ALTER TABLE `language_training_client_exit` DISABLE KEYS */;
/*!40000 ALTER TABLE `language_training_client_exit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language_training_course_setup`
--

DROP TABLE IF EXISTS `language_training_course_setup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `language_training_course_setup` (
  `update_record_id` varchar(255) NOT NULL,
  `course_code` tinytext NOT NULL,
  `notes` tinytext NOT NULL,
  `course_held_on_an_ongoing_basis` tinytext NOT NULL,
  `official_language_of_course` tinytext NOT NULL,
  `format_of_training_provided` tinytext NOT NULL,
  `classes_held_at` tinytext NOT NULL,
  `in_person_instruction_percent` tinytext NOT NULL,
  `online_distance_instruction_percent` tinytext NOT NULL,
  `total_number_of_spots_in_course` tinytext NOT NULL,
  `number_of_ircc_funded_spots_in_course` tinytext NOT NULL,
  `new_students_can_enrol_in_the_course` tinytext NOT NULL,
  `support_services_available_for_client_in_this_course` tinytext NOT NULL,
  `care_for_newcomer_children_adult` tinytext NOT NULL,
  `transportation_adult` tinytext NOT NULL,
  `provisions_for_disabilities_adult` tinytext NOT NULL,
  `course_start_date_yyyy_mm_dd` tinytext NOT NULL,
  `course_end_date_yyyy_mm_dd` tinytext NOT NULL,
  `schedule_morning` tinytext NOT NULL,
  `schedule_afternoon` tinytext NOT NULL,
  `schedule_evening` tinytext NOT NULL,
  `schedule_anytime` tinytext NOT NULL,
  `schedule_weekend` tinytext NOT NULL,
  `schedule_online` tinytext NOT NULL,
  `instructional_hours_per_class` tinytext NOT NULL,
  `classes_per_week` tinytext NOT NULL,
  `weeks_of_instruction` tinytext NOT NULL,
  `weeks_of_instruction_per_year` tinytext NOT NULL,
  `dominant_focus_of_the_course` tinytext NOT NULL,
  `course_directed_at_a_specific_target_group` tinytext NOT NULL,
  `children_0_14_yrs` tinytext NOT NULL,
  `youth_15_24_yrs` tinytext NOT NULL,
  `senior` tinytext NOT NULL,
  `gender_specific` tinytext NOT NULL,
  `refugees` tinytext NOT NULL,
  `official_language_minorities` tinytext NOT NULL,
  `ethnic_cultural_linguistic_group` tinytext NOT NULL,
  `deaf_or_hard_of_hearing` tinytext NOT NULL,
  `blind_or_partially_sighted` tinytext NOT NULL,
  `clients_with_other_impairments_physical_mental` tinytext NOT NULL,
  `lesbian_gay_bisexual_transgender_queer_lgbtq` tinytext NOT NULL,
  `families_parents` tinytext NOT NULL,
  `clients_with_international_training_in_a_regulated_profession` tinytext NOT NULL,
  `clients_with_international_training_in_a_regulated_trade` tinytext NOT NULL,
  `materials_used_in_course` tinytext NOT NULL,
  `citizenship_preparation` tinytext NOT NULL,
  `pbla_language_companion` tinytext NOT NULL,
  `contact_name` tinytext NOT NULL,
  `street_number` tinytext NOT NULL,
  `street_name` tinytext NOT NULL,
  `street_type` tinytext NOT NULL,
  `street_direction` tinytext NOT NULL,
  `unit_suite_apt` tinytext NOT NULL,
  `province` tinytext NOT NULL,
  `city` tinytext NOT NULL,
  `postal_code` tinytext NOT NULL,
  `telephone_number` tinytext NOT NULL,
  `telephone_extension` tinytext NOT NULL,
  `email_address` tinytext NOT NULL,
  `listening_skill_level_1` tinytext NOT NULL,
  `listening_skill_level_2` tinytext NOT NULL,
  `listening_skill_level_3` tinytext NOT NULL,
  `listening_skill_level_4` tinytext NOT NULL,
  `listening_skill_level_5` tinytext NOT NULL,
  `listening_skill_level_6` tinytext NOT NULL,
  `listening_skill_level_7` tinytext NOT NULL,
  `listening_skill_level_8` tinytext NOT NULL,
  `listening_skill_level_9` tinytext NOT NULL,
  `listening_skill_level_10` tinytext NOT NULL,
  `listening_skill_level_11` tinytext NOT NULL,
  `listening_skill_level_12` tinytext NOT NULL,
  `speaking_skill_level_1` tinytext NOT NULL,
  `speaking_skill_level_2` tinytext NOT NULL,
  `speaking_skill_level_3` tinytext NOT NULL,
  `speaking_skill_level_4` tinytext NOT NULL,
  `speaking_skill_level_5` tinytext NOT NULL,
  `speaking_skill_level_6` tinytext NOT NULL,
  `speaking_skill_level_7` tinytext NOT NULL,
  `speaking_skill_level_8` tinytext NOT NULL,
  `speaking_skill_level_9` tinytext NOT NULL,
  `speaking_skill_level_10` tinytext NOT NULL,
  `speaking_skill_level_11` tinytext NOT NULL,
  `speaking_skill_level_12` tinytext NOT NULL,
  `reading_skill_level_1` tinytext NOT NULL,
  `reading_skill_level_2` tinytext NOT NULL,
  `reading_skill_level_3` tinytext NOT NULL,
  `reading_skill_level_4` tinytext NOT NULL,
  `reading_skill_level_5` tinytext NOT NULL,
  `reading_skill_level_6` tinytext NOT NULL,
  `reading_skill_level_7` tinytext NOT NULL,
  `reading_skill_level_8` tinytext NOT NULL,
  `reading_skill_level_9` tinytext NOT NULL,
  `reading_skill_level_10` tinytext NOT NULL,
  `reading_skill_level_11` tinytext NOT NULL,
  `reading_skill_level_12` tinytext NOT NULL,
  `reading_skill_level_13` tinytext NOT NULL,
  `reading_skill_level_14` tinytext NOT NULL,
  `reading_skill_level_15` tinytext NOT NULL,
  `reading_skill_level_16` tinytext NOT NULL,
  `reading_skill_level_17` tinytext NOT NULL,
  `writing_skill_level_1` tinytext NOT NULL,
  `writing_skill_level_2` tinytext NOT NULL,
  `writing_skill_level_3` tinytext NOT NULL,
  `writing_skill_level_4` tinytext NOT NULL,
  `writing_skill_level_5` tinytext NOT NULL,
  `writing_skill_level_6` tinytext NOT NULL,
  `writing_skill_level_7` tinytext NOT NULL,
  `writing_skill_level_8` tinytext NOT NULL,
  `writing_skill_level_9` tinytext NOT NULL,
  `writing_skill_level_10` tinytext NOT NULL,
  `writing_skill_level_11` tinytext NOT NULL,
  `writing_skill_level_12` tinytext NOT NULL,
  `writing_skill_level_13` tinytext NOT NULL,
  `writing_skill_level_14` tinytext NOT NULL,
  `writing_skill_level_15` tinytext NOT NULL,
  `writing_skill_level_16` tinytext NOT NULL,
  `writing_skill_level_17` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language_training_course_setup`
--

LOCK TABLES `language_training_course_setup` WRITE;
/*!40000 ALTER TABLE `language_training_course_setup` DISABLE KEYS */;
/*!40000 ALTER TABLE `language_training_course_setup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `needs_assessment_and_referrals`
--

DROP TABLE IF EXISTS `needs_assessment_and_referrals`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `needs_assessment_and_referrals` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth_yyyy_mm_dd` tinytext NOT NULL,
  `postal_code_where_the_service_was_received` tinytext NOT NULL,
  `start_date_of_assessment_yyyy_mm_dd` tinytext NOT NULL,
  `language_of_service` tinytext NOT NULL,
  `official_language_of_preference` tinytext NOT NULL,
  `type_of_institution_organization_where_client_received_services` tinytext NOT NULL,
  `referred_by` tinytext NOT NULL,
  `increase_knowledge_of_life_in_canada` tinytext NOT NULL,
  `increase_knowledge_of_life_in_canada_referrals` tinytext NOT NULL,
  `increase_knowledge_of_community_and_government_services` tinytext NOT NULL,
  `longfield_1` tinytext NOT NULL,
  `increase_knowledge_of_working_in_canada` tinytext NOT NULL,
  `increase_knowledge_of_working_in_canada_referrals` tinytext NOT NULL,
  `increase_knowledge_of_education_in_canada` tinytext NOT NULL,
  `increase_knowledge_of_education_in_canada_referrals` tinytext NOT NULL,
  `increase_the_following_social_networks` tinytext NOT NULL,
  `increase_the_following_social_networks_referrals` tinytext NOT NULL,
  `increase_the_following_professional_networks` tinytext NOT NULL,
  `increase_the_following_professional_networks_referrals` tinytext NOT NULL,
  `increase_the_following_access_to_local_community_services` tinytext NOT NULL,
  `longfield_2` tinytext NOT NULL,
  `increase_the_following_level_of_community_involvement` tinytext NOT NULL,
  `increase_the_following_level_of_community_involvement_referrals` tinytext NOT NULL,
  `improve_language_skills` tinytext NOT NULL,
  `improve_language_skills_referrals` tinytext NOT NULL,
  `improve_language_skills_to` tinytext NOT NULL,
  `improve_other_skills` tinytext NOT NULL,
  `improve_other_skills_referrals` tinytext NOT NULL,
  `improve_other_skills_to` tinytext NOT NULL,
  `find_employment` tinytext NOT NULL,
  `find_employment_referrals` tinytext NOT NULL,
  `find_employment_timeframe` tinytext NOT NULL,
  `find_employment_minimum_one_years_work_experience` tinytext NOT NULL,
  `longfield_3` tinytext NOT NULL,
  `longfield_4` tinytext NOT NULL,
  `client_intends_to_become_a_canadian_citizen` tinytext NOT NULL,
  `support_services_may_be_required` tinytext NOT NULL,
  `care_for_newcomer_children_adult` tinytext NOT NULL,
  `transportation_adult` tinytext NOT NULL,
  `provisions_for_disabilities_adult` tinytext NOT NULL,
  `translation_adult` tinytext NOT NULL,
  `interpretation_adult` tinytext NOT NULL,
  `crisis_counselling_adult` tinytext NOT NULL,
  `non_ircc_program_services_needed` tinytext NOT NULL,
  `food_clothing_other_material_needs` tinytext NOT NULL,
  `food_clothing_other_material_needs_referrals` tinytext NOT NULL,
  `housing_accommodation` tinytext NOT NULL,
  `housing_accommodation_referrals` tinytext NOT NULL,
  `health_mental_health_well_being` tinytext NOT NULL,
  `health_mental_health_well_being_referrals` tinytext NOT NULL,
  `financial` tinytext NOT NULL,
  `financial_referrals` tinytext NOT NULL,
  `family_support` tinytext NOT NULL,
  `family_support_referrals` tinytext NOT NULL,
  `language_non_ircc` tinytext NOT NULL,
  `language_non_ircc_referrals` tinytext NOT NULL,
  `education_skills_development` tinytext NOT NULL,
  `education_skills_development_referrals` tinytext NOT NULL,
  `employment_related` tinytext NOT NULL,
  `employment_related_referrals` tinytext NOT NULL,
  `legal_information_and_services` tinytext NOT NULL,
  `legal_information_and_services_referrals` tinytext NOT NULL,
  `community_services` tinytext NOT NULL,
  `community_services_referrals` tinytext NOT NULL,
  `support_services_received` tinytext NOT NULL,
  `care_for_newcomer_children_child` tinytext NOT NULL,
  `child_1_age` tinytext NOT NULL,
  `child_1_type_of_care` tinytext NOT NULL,
  `child_2_age` tinytext NOT NULL,
  `child_2_type_of_care` tinytext NOT NULL,
  `child_3_age` tinytext NOT NULL,
  `child_3_type_of_care` tinytext NOT NULL,
  `child_4_age` tinytext NOT NULL,
  `child_4_type_of_care` tinytext NOT NULL,
  `child_5_age` tinytext NOT NULL,
  `child_5_type_of_care` tinytext NOT NULL,
  `transportation_child` tinytext NOT NULL,
  `provisions_for_disabilities_child` tinytext NOT NULL,
  `translation_child` tinytext NOT NULL,
  `between_translation` tinytext NOT NULL,
  `and_translation` tinytext NOT NULL,
  `interpretation_child` tinytext NOT NULL,
  `between_interpretation` tinytext NOT NULL,
  `and_interpretation` tinytext NOT NULL,
  `crisis_counselling_child` tinytext NOT NULL,
  `settlement_plan_completed_and_shared_with_client` tinytext NOT NULL,
  `end_date_of_assessment_yyyy_mm_dd` tinytext NOT NULL,
  `reason_for_update` tinytext NOT NULL,
  PRIMARY KEY (`update_record_id`,`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `needs_assessment_and_referrals`
--

LOCK TABLES `needs_assessment_and_referrals` WRITE;
/*!40000 ALTER TABLE `needs_assessment_and_referrals` DISABLE KEYS */;
/*!40000 ALTER TABLE `needs_assessment_and_referrals` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-09 18:40:57
