package webpage

import org.scalajs.dom
import dom.html
import org.scalajs.dom.raw.Node

import scalajs.js.annotation.JSExport
import scalatags.JsDom.all._

@JSExport
object HelloWorld1 extends{
  @JSExport
  def main(target: html.Div): Node = {
    val (animalA, animalB) = ("fox", "dog")
    target.appendChild(
      div(
        h1("Hello World!"),
        p(
          "The quick brown ", b(animalA),
          " jumps over the lazy ",
          i(animalB), "."
        )
      ).render
    )
  }
}