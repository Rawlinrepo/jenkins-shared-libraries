def call(){
  echo "Building stage"
  sh '''
  cd frontend
  docker build -t rawlin08/frontend .
  '''
}
