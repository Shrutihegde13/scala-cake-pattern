package config

import authentication.{AuthenticationService, AzureAuthenticationServiceComponent}
import logger.{ApplicationLoggerComponent, Logger}
import service.login.LoginServiceComponent

object ComponentRegistry extends LoginServiceComponent
  with AzureAuthenticationServiceComponent
  with ApplicationLoggerComponent {

  override val applicationLogger: Logger = new ApplicationLogger
  override val azureAuthenticationService: AuthenticationService = new AzureAuthenticationService
  override val loginService: LoginService = new LoginService

}
