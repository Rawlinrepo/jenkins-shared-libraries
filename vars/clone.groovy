def call(String url, String branch){
  echo "cloning the repositry"
  git url:"https://github.com/Rawlinrepo/add-2-no.git", 
  branch : "main"
}
