# SpringBoot-AWS
SpringBoot+React+Docker+AWS



//other than code changes
#S13.V163 - installed docker engine and created image for sql with below command

	docker run --name mysql-container -e MYSQL_ROOT_PASSWORD=rootpassword -e MYSQL_DATABASE=todos -e MYSQL_USER=admin -e MYSQL_PASSWORD=admin -p 3306:3306 -d mysql:8
	
	
	>>to verify container is running
	
	docker ps
	
	>>to access the MySQL inside container
	docker exec -it mysql-container mysql -u root -p