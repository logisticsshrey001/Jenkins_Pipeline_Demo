def call(){
stages {
        stage ('Compile Stage') {
            steps {
                 
                echo 'mvn clean compile'
                
            }
        }
        stage ('Testing Stage') {

            steps {
                 
                    echo 'mvn test'
                
            }
        }
        stage ('Install Stage') {
            steps {
                 
                    echo 'mvn install'
                
            }
        }
    }
