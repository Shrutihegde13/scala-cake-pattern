package authentication

trait TestAuthenticationService {

  val testAuthenticationServiceImpl : AuthenticationService

  class TestAuthenticationServiceImpl extends AuthenticationService {
    override def authenticate(userInfo: String): Boolean = true
  }

}

