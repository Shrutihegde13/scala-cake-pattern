package service.login

import authentication.AzureAuthenticationService
import logger.ApplicationLogger

class LoginService {

  this : AzureAuthenticationService with ApplicationLogger =>

  def login(userInfo : String): Boolean = {
    applicationLoggerImpl.log(userInfo)
    azureAuthenticationServiceImpl.authenticate(userInfo)
  }
  
}
