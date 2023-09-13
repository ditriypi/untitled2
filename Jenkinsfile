pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        } // Закрывающая скобка для блока steps

        stage('Get cod') {
            steps {
                sh 'mvn clean test -Dtestng.suite.xml=testng.xml'
            }
        }
    }
}