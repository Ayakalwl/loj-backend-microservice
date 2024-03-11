# 基础镜像
FROM openjdk:8-jdk-alpine

# 指定工作目录
WORKDIR /app

# 设置JVM的初始堆内存和最大堆内存
ENV JAVA_OPTS="-Xms128m -Xmx128m"

# 将 jar 包添加到工作目录，比如 target/yuoj-backend-user-service-0.0.1-SNAPSHOT.jar
ADD target/loj-backend-user-service-0.0.1-SNAPSHOT.jar .

# 暴露端口
EXPOSE 8102

# 启动命令
ENTRYPOINT ["java","-jar","/app/loj-backend-user-service-0.0.1-SNAPSHOT.jar","--spring.profiles.active=prod"]