TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` TRIGGER rental_date BEFORE INSERT ON rental\n	FOR EACH ROW SET NEW.rental_date = NOW()'
sql_modes=1342177280
definers='root@localhost'
client_cs_names='utf8'
connection_cl_names='utf8_general_ci'
db_cl_names='latin1_swedish_ci'
