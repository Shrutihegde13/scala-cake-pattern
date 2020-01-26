package service.login

import authentication.AzureAuthenticationServiceComponent
import logger.ApplicationLoggerComponent

trait LoginServiceComponent {

  this : AzureAuthenticationServiceComponent with ApplicationLoggerComponent =>

  val loginService : LoginService

  class LoginService {

    def login(userInfo : String): Boolean = {
      val userAuthenticated = azureAuthenticationService.authenticate(userInfo)
      if (userAuthenticated) applicationLogger.log(userInfo) else applicationLogger.error(userInfo)
      userAuthenticated
    }
  }
}
