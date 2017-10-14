FROM tomcat:alpine

ENV project ip-lab-servlets

COPY ${project}.war /usr/local/tomcat/webapps/