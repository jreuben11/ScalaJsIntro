package tutorial.webapp

/**
 * Created by joshr on 04/12/2015.
 */
import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp{

  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World!</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    val message = "You clicked the button!"
    jQuery("body").append(s"<p>$message</p>")
  }

}
