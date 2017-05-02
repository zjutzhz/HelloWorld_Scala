import org.slf4j.{Logger, LoggerFactory}

/**
  * Created by zjutz on 2017/5/3.
  */
object Hello extends App {

  override def main(args: Array[String]) {
    val  log:Logger = LoggerFactory.getLogger("Hello")
    log.info("Im here")
    println("hello")
  }
}
