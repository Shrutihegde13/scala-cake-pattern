package logger


trait ApplicationLogger {

  val applicationLoggerImpl : Logger

  class ApplicationLoggerImpl extends Logger {
    override def log(info: String): Unit = println("INFO : " + info)
  }
}
