package service.login

import authentication.AuthenticationService
import logger.Logger

class LoginService(authenticationService: AuthenticationService, logger: Logger) {

  def login(userInfo : String): Boolean = {
    logger.log(userInfo)
    authenticationService.authenticate(userInfo)
  }
  
}
