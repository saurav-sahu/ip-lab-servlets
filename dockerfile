FROM tomcat:alpine

ENV project ip-lab-servlets

COPY ./target/${project}.war /usr/local/tomcat/webapps/