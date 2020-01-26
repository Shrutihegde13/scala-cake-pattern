package service.login

import authentication.AzureAuthenticationService
import logger.ApplicationLogger


trait LoginService {

  this : AzureAuthenticationService with ApplicationLogger =>

  val loginServiceImpl : LoginServiceImpl

  class LoginServiceImpl {

    def login(userInfo : String): Boolean = {
      applicationLoggerImpl.log(userInfo)
      azureAuthenticationServiceImpl.authenticate(userInfo)
    }

  }
}
