def buildAndPush(String username) {
    sh "docker login -u ${username} -p \$DOCKER_PASSWORD"
    def customImage = docker.build("username/zuul:latest")
    customImage.push()
    return customImage.name()
}

return this;
