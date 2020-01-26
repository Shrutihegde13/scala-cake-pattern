package logger

class ApplicationLogger extends Logger {
  override def log(info: String): Unit = println("INFO : " + info)
}
