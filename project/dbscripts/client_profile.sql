CREATE TABLE `client_profile` (
  `unique_identifier` varchar(255) NOT NULL,
  `unique_identifier_value` varchar(255) NOT NULL,
  `date_of_birth` varchar(255) NOT NULL,
  `phone_number` varchar(255) NOT NULL,
  `has_email_address` tinyint(1) NOT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `street_number` varchar(255) NOT NULL,
  `street_name` varchar(255) NOT NULL,
  `street_type` varchar(255) NOT NULL,
  `street_direction` varchar(255) NOT NULL,
  `unit` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `province` varchar(255) NOT NULL,
  `postal_code` varchar(255) NOT NULL,
  `language` varchar(255) NOT NULL,
  `consent` tinyint(1) NOT NULL,
  PRIMARY KEY (`unique_identifier`,`unique_identifier_value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
