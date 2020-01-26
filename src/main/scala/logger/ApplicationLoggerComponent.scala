package logger


trait ApplicationLoggerComponent {

  val applicationLogger : Logger

  class ApplicationLogger extends Logger {
    override def log(info: String): Unit = println("INFO : " + info)

    override def error(info: String): Unit = println("ERROR : " + info)
  }
}
