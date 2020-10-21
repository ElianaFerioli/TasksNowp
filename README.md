# TasksNowp

####Task3

I would chain this three tools using Jenkins pipelines (Find a simple example of Jenkinsfile on the Task1 and Task2 project).
With Jenkins pipelines we can, for example, set a multibranch job that triggers a pipeline every time a commit is being done on some branches. Doing so, we can checkout the desired branch to the last commit and build the code doing, for example:
```
stage('build') {
            steps {
                sh 'gradle build'
            }
        }
```
If the build is successfull then we can move to the next step and run unit/integration tests for de source code:
```
        stage('Unit & Integration Tests') {
            steps {
                script {
                    try {
                        sh './gradlew clean test --no-daemon'
                    } finally {
                        junit '**/build/test-results/test/*.xml' 
                    }
                }
            }
        }
 ```
Once tests are successfully passed, then we can publish the artifact to Nexus (for example) or some other repository management tool. For deployng the artifact we can add a new step to generate a docker image for it (that we can also publish later to Nexus). Once the image is generated, we would have our portable and containerized image to deploy it wherever we want. With Jenkins we would have the perfect tool to manage and audit all our deployments.

####Task4

For Code Quality I would use a tool like SonarQube or Kiuwan. Preferably, under my experience I would prefer to work with SonarQube. With such tool we can have a lot of metrics about code quality and also we can configure Quality Gates. So, if some code does not pass the defined quality gate, we can stop our pipelines and do not generate a build for that code and do not deploy it.
Also, SonarQube can give us information about Coverage metrics. So if we integrate SonarQube with a coverage library like Jacoco (for java code), we can also get the metrics of coverage.

####Task5
Ansible, one of the tools that I'm learning to use right now.  Usually I use Ansible to deploy the same stack of services on different EC2 instances. Once that i have the inventory of host is really simple to execute Ansible playbooks and let all the tasks to be executed on the inventory of host, saving a lot of time and manual work.
