def call(Map configValues){
     // expose env variable
  env.sonarloginKey = configValues.sonarloginKey
  env.userName = configValues.name
  env.emailName = configValues.email
     
     echo "Hello, ${ env.sonarloginKey}."
     echo "user name value is ${env.userName}"
     echo "email value is ${env.emailName}"
}
