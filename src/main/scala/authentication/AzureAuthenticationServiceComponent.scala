package authentication

trait AzureAuthenticationServiceComponent {

  val azureAuthenticationService : AuthenticationService

  class AzureAuthenticationService extends AuthenticationService {
    override def authenticate(userInfo: String): Boolean = userInfo.length > 10
  }
}

