# ---------- BUILD STAGE ----------
FROM maven:3.9-eclipse-temurin-25 AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests


# ---------- RUN STAGE ----------
FROM tomcat:10.1-jdk25-temurin

# Remove Tomcat's default applications
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy our WAR file into Tomcat
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Render uses port 10000 by default
RUN sed -i 's/port="8080"/port="10000"/' /usr/local/tomcat/conf/server.xml

EXPOSE 10000

# Start Tomcat
CMD ["catalina.sh", "run"]