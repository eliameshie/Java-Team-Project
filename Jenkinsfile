

pipeline {
	agent any
    stages {
        stage('Build') {
            steps {
                sh 'javac group.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java group'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}


