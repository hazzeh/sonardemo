pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh './gradlew build'
      }
    }
    stage('Sonarqube') {
      steps {
         withSonarQubeEnv('Sonarcloud') {
           sh './gradlew sonarqube'
       }
     } 
    }
      }
}
