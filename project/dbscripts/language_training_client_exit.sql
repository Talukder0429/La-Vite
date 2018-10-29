CREATE TABLE `language_training_client_exit` (
  `update_record_id` varchar(255) NOT NULL,
  `unique_identifier_type` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `client_date_of_birth` varchar(255) NOT NULL,
  `course_code` varchar(255) NOT NULL,
  `clients_training_status` varchar(255) NOT NULL,
  `date_client_exited_course` varchar(255) NOT NULL,
  `reason_for_exiting_course` varchar(255) NOT NULL,
  `listening_CLB_level` varchar(255) NOT NULL,
  `speaking_CLB_level` varchar(255) NOT NULL,
  `reading_CLB_level` varchar(255) NOT NULL,
  `writing_CLB_level` varchar(255) NOT NULL,
  `was_a_certificate_issued_to_the_client` varchar(255) NOT NULL,
  `listening_level_indicated_on_certificate` varchar(255) NOT NULL,
  `speaking_level_indicated_on_certificate` varchar(255) NOT NULL,
  `support_services_received` varchar(255) NOT NULL,
  `care_for_newcomer_children` varchar(255) NOT NULL,
  `child1_age` varchar(255) NOT NULL,
  `child5_age` varchar(255) NOT NULL,
  `child1_type_of_care` varchar(255) NOT NULL,
  `child2_age` varchar(255) NOT NULL,
  `child2_type_of_care` varchar(255) NOT NULL,
  `child3_age` varchar(255) NOT NULL,
  `child3_type_of_care` varchar(255) NOT NULL,
  `child4_age` varchar(255) NOT NULL,
  `child4_type_of_care` varchar(255) NOT NULL,
  `child5_type_of_care` varchar(255) NOT NULL,
  `transportation` varchar(255) NOT NULL,
  `provisions_for_disabilities` varchar(255) NOT NULL,
  `translation` varchar(255) NOT NULL,
  `translation_language_between` varchar(255) NOT NULL,
  `translation_language_and` varchar(255) NOT NULL,
  `interpretation` varchar(255) NOT NULL,
  `interpretation_between` varchar(255) NOT NULL,
  `interpretation_and` varchar(255) NOT NULL,
  `crisis_counselling` varchar(255) NOT NULL,
  `reason_for_update` varchar(255) NOT NULL,
  PRIMARY KEY (`unique_identifier_type`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;