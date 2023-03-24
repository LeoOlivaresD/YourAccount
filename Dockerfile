# Define the base image to use for the container
FROM tomcat:9.0-jre8-alpine

# Copy the application files to the container
COPY target/ProyectoWeb-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war

# Set the command to run when the container starts
CMD ["catalina.sh", "run"]
