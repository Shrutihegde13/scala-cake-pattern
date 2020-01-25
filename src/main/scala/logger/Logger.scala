package logger

trait Logger {
  def log(info: String): Unit
  def error(error: String): Unit
}
