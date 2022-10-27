pipeline {
    agent any

    stages {
        stage('Verify branch') {
            steps {
                 echo 'Hiiii'
                 script {
                    if (env.BRANCH_NAME == 'test-A') {
                        echo 'I only execute on the test A branch'
                    } else {
                        echo env.BRANCH_NAME
                    }
                }
                echo "$GIT_BRANCH"
            }

        }       
    }

}
