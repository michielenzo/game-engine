pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout Repository') {
            steps {
                git url: 'https://github.com/michielenzo/game-engine', branch: 'master'
            }
        }

        stage('Run Maven Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }
}