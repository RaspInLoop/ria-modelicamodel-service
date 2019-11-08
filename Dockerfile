FROM raspinloop/openmodelicabase
MAINTAINER admin@raspinloop.org

ARG JAR_FILE
ADD ${JAR_FILE} app.jar
RUN sh -c 'touch /app.jar'

ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
ENV OPENMODELICAHOME /usr/

RUN useradd -ms /bin/bash openmodelica

EXPOSE 8080
USER openmodelica
ENV USER openmodelica

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

