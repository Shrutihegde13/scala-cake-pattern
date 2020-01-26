package logger

trait Logger {
  def log(info: String): Unit
  def error(info: String): Unit
}
