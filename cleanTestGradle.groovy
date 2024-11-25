// Methods in this file will end up as object methods on the object that load returns.
def gradlecleantest() {
    sh "echo 'starting unit test with gradle'"
    sh "./gradlew clean test --continue"
    junit "**/test/TEST*.xml"
}

return this;