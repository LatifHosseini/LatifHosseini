pipeline {
    agent {
    node {
        label 'SWSVW_AUTOSCRIPT'
        }
}
    stages {
        stage('Print_Hello') {
            steps {
                echo 'Hello World_TEST' 
            }
        }
     stage('Wait_10s') {
            steps {
                sleep(time: 10, unit: "SECONDS") 
            }
        }
  
}

post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}