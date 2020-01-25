package authentication

class TestAuthenticationService extends AuthenticationService {
  override def authenticate(userInfo: String): Boolean = true
}
