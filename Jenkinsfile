pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }

        stage('Get cod')   {
        steps {
        sh 'mvn clean test -Dtestng.suite.xml=testng.xml'
        }
        }
        }
    }
}