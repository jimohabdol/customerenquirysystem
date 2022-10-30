pipeline {
    agent any
    stages {
        stage('Verify branch') {
            steps {
                 when {
                     branch 'TundeBranch'
                 }
                 script {
                    if (env.GIT_BRANCH.split("/")[1] == 'master') {
                        echo 'I only execute on the' + env.GIT_BRANCH.split("/")[1] + 'branch'
                    } else {
                        echo 'I only execute on the' + env.GIT_BRANCH.split("/")[1] + 'branch'
                    }
                }
                echo "${GIT_BRANCH.split("/")[1]}"
            }

        }       
    }

}
