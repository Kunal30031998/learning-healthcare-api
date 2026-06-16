FROM gitpod/workspace-full

USER gitpod

RUN sudo apt-get update && \
    sudo apt-get install -y openjdk-17-jdk maven && \
    sudo update-alternatives --set java /usr/lib/jvm/java-17-openjdk-amd64/bin/java
