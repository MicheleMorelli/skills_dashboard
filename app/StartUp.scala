import javax.inject.{Inject, Singleton}
import play.api.inject.ApplicationLifecycle

import scala.concurrent.Future

@Singleton
class StartUp @Inject()(lifecycle: ApplicationLifecycle) {

  println(s"Initialising app...")
  // grab the data from the data store

  lifecycle.addStopHook { () =>
    Future.successful(())
  }

}