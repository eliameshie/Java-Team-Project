

pipeline {
	agent any
    stages {
        stage('Build') {
            steps {
                sh 'javac Group.java'
            }
        }
        stage('Test') {
            steps {
                sh 'java Group'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}


