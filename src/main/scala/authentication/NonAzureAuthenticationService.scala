package authentication

class NonAzureAuthenticationService extends AuthenticationService {
  override def authenticate(userInfo: String): Boolean = userInfo.length < 10
}
