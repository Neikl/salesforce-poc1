pipeline{

 agent any

stages{
	
 stage('Check out ANT scripts'){

 steps{

 checkout scm

 }

 }

 stage('Retrieving Metadata'){

 steps{

 sh "source /etc/profile && ant retrieveUnpackaged"

 }

 }
	
 stage('Depoying to devorg'){

 steps{

 sh "source /etc/profile && ant deployUnpackaged"

 }

 }	
 
 stage('Running Provar test cases'){

 steps{

 echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
 sh "source /etc/profile && xvfb-run ant -f Provar-testing/ANT/build.xml -v"

 }

 }

 stage('Artifacts to S3'){

 steps{

 sh "ansible-playbook /var/lib/jenkins/workspace/provar-testing/pushtos3.yml -vvv"

 }

 } 
	
 stage('Chatter Notifier'){

 steps{

 chatterPost body: "This is a Chatter post from a pipeline! ${env.JOB_NAME} ${env.BUILD_DISPLAY_NAME}", credentialsId: 'team.sfdc.user'

 }

 } 
 
 }

 post {

     always {

         junit allowEmptyResults: true, testResults: 'Provar-testing/ANT/Results/*.xml'

         //cleanWs notFailBuild: true /* cleans up the workspace */

     }

     success {

         echo "Success: Good job!"

     }        

     failure {            

         echo 'Failure: Something went wrong with the Provar ANT build. Printing environment for debugging'            

         sh 'printenv'

         echo 'Printing hosts'

         sh 'sudo cat /etc/hosts'

         echo 'Searching for provar directories/files in the system...'

         sh 'sudo find / -name "provar*"'

         echo 'Finding chrome drivers'

         sh "sudo find / -name '*chromedriver*'"

     }        

 } 
 }
