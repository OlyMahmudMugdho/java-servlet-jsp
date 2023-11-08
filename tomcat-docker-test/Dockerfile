# Use an official Tomcat runtime as the base image
FROM tomcat:9.0-jre11

# Copy the WAR file from your local machine to the container's webapps directory
COPY test3.war /usr/local/tomcat/webapps/

# Optionally, you can configure Tomcat by copying context.xml or other configurations

# Expose the default Tomcat port (8080) if you want to access the application externally
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
