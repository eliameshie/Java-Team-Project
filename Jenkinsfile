stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
                sh 'javac group.java'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
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
