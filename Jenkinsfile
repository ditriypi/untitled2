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
                bat 'mvn clean test' // Здесь используется bat для Windows
            }
        }

    }
    post{
     always {
     testNG(reportFilenamePattern: '**/testng-results.xml')
          testNG(reportFilenamePattern: '**/ScreenShoots')
     }
    }
}