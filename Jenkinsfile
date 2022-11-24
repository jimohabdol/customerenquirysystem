pipeline {
    agent any
    environment {
        APP_NAME = ''
        build_env = envBuild(env.GIT_BRANCH.split("/")[1])
    }
    stages {
        stage('Verify branch') {
            when {
                expression {
                env.GIT_BRANCH.split("/")[1] == 'feature' || env.GIT_BRANCH.split("/")[1] == 'TundeBranch'
                }
            }
            steps {
                //  script {
                    // if (env.GIT_BRANCH.split("/")[1] == 'master') {
                        // echo 'I only execute on the' + env.GIT_BRANCH.split("/")[1] + 'branch'
                    // } else {
                        // echo 'I only execute on the' + env.GIT_BRANCH.split("/")[1] + 'branch'
                    // }
                // }
                echo "${GIT_BRANCH.split("/")[1]}"
                echo 'I only execute on the' + env.GIT_BRANCH.split("/")[1] + 'branch and' + "${build_env}"
                
            }
        }   
        stage('deploy') {
            steps {
                echo 'I only deployed on the' + env.GIT_BRANCH.split("/")[1] + 'branch and' + "${build_env}"
            }
        } 
        stage('build') {
            steps {
                echo 'I only build from ' + env.GIT_BRANCH.split("/")[1] + 'branch and' + "${build_env}"
            }
        }   
    }
}

def envBuild(branch) {

    def buildEnv = ''
    if (branch == 'master') {
        println "Branch == master"
        buildEnv = 'dev'
    }
    if (branch == 'TundeBranch') {
        buildEnv = 'stg'
    }

    return buildEnv
}
