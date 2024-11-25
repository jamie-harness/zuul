def gradletest() {
    sh "echo 'starting unit test with gradle'"
    sh "./gradlew clean test --continue"
    junit "**/test/TEST*.xml"
}

def gradlebuild() {
    sh "echo 'starting build with gradle'"
    sh "./gradlew build"
}

return this;