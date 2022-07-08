def call(Map configValues){
     // expose env variable
  env.sonarloginKey = configValues.sonarloginKey
  env.userName = configValues.name
  env.emailName = configValues.email
}
