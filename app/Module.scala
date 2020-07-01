import java.time.Clock
import com.google.inject.AbstractModule
import javax.inject.Inject
import play.api.{Configuration, Environment, Logging}

class Module @Inject()(environment: Environment,
                       configuration: Configuration) extends AbstractModule with Logging {

  override def configure(): Unit = {
    bind(classOf[Clock]).toInstance(Clock.systemDefaultZone)
    bind(classOf[StartUp]).asEagerSingleton()
  }
}