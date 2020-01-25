package authentication

trait AuthenticationService {
  def authenticate(userInfo : String) : Boolean
}
