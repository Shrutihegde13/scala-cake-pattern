package authentication

trait TestAuthenticationService {

  val testAuthenticationServiceImpl : TestAuthenticationServiceImpl

  class TestAuthenticationServiceImpl extends AuthenticationService {
    override def authenticate(userInfo: String): Boolean = true
  }

}

