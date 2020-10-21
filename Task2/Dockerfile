FROM gradle:jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 

FROM openjdk:11-jdk

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/*.jar /app/Task2.jar

ENTRYPOINT ["java","-jar","/app/Task2.jar"]