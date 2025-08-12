def call(){
  echo "pushing Stage"
  withCredentials([usernamePassword(
  credentialsId : 'dockerHubCred',
  usernameVariable: "username", 
  passwordVariable: "password"
  )]){
  sh '''
  docker login -u $username -p $password
  docker push $username/frontend:latest
  '''
  }
}
