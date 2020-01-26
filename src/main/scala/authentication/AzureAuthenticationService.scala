package authentication

trait AzureAuthenticationService {

  val azureAuthenticationServiceImpl : AuthenticationService

  class AzureAuthenticationServiceImpl extends AuthenticationService {
    override def authenticate(userInfo: String): Boolean = userInfo.length > 10
  }
}

