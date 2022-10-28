pipeline {
    agent any

    stages {
        stage('Verify branch') {
            steps {
                
                 script {
                    if (env.GIT_BRANCH.split("/")[1] == 'master') {
                        echo 'I only execute on the test A branch'
                    } else {
                        echo env.BRANCH_NAME
                    }
                }
                echo "${GIT_BRANCH.split("/")[1]}"
            }

        }       
    }

}
