// If there's a call method, you can just load the file, say, as "foo", and then invoke that call method with foo(...) 
def buildAndPush(String username) {
    sh "docker login -u ${username} -p \$DOCKER_PASSWORD"
}

return this;