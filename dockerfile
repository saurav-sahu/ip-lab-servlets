FROM tomcat:alpine

ENV project ip

COPY ./target/${project}.war /usr/local/tomcat/webapps/