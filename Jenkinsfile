pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test -Dtestng.suite.xml=testng.xml' // Здесь используется bat для Windows
            }
        }
    }
}