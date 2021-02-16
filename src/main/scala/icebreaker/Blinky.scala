package icebreaker

import spinal.lib._
import spinal.core._
import icebreaker.lib._

object Blinky {
  def main(args: Array[String]) = IceBreaker.generate(new Blinky)
}

case class Blinky() extends Component {
  val io = new Bundle {
    val ledRed = out(Bool())
    val ledGreen = out(Bool())
  }

  new SlowArea(4 Hz) {
    val state = RegInit(False)
    state := ~state

    io.ledRed := ~state
    io.ledGreen := state
  }
}
