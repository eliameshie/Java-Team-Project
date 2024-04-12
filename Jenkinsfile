

pipeline {
	agent any
    stages {
        stage('Build') {
            steps {
                cmd.exe /c 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                cmd.exe /c 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}



