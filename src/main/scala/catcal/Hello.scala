package catcal

import com.typesafe.config.ConfigFactory

object Hello extends Greeting with App {
  println(greeting)
  val config = ConfigFactory.load("lang-uk.conf")
  println(config.getStringList("months"))
  println(config.getStringList("weekdays"))
}

trait Greeting {
  lazy val greeting: String = "hello"
}
