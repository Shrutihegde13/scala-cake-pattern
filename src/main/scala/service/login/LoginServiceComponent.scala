package service.login

import authentication.AzureAuthenticationServiceComponent
import logger.ApplicationLoggerComponent


trait LoginServiceComponent {

  this : AzureAuthenticationServiceComponent with ApplicationLoggerComponent =>

  val loginServiceImpl : LoginService

  class LoginService {

    def login(userInfo : String): Boolean = {
      applicationLogger.log(userInfo)
      azureAuthenticationService.authenticate(userInfo)
    }

  }
}
