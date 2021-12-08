ARG APP_INSIGHTS_AGENT_VERSION=2.6.3

# Application image

FROM hmctspublic.azurecr.io/base/java:openjdk-11-distroless-1.4

COPY lib/AI-Agent.xml /opt/app/
COPY build/libs/labs-msl8r.jar /opt/app/

EXPOSE 9000
CMD [ "labs-msl8r.jar" ]
