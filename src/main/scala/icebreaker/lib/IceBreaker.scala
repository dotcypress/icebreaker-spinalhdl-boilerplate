package icebreaker.lib

import java.nio.file._
import spinal.core._
import spinal.lib._

object IceBreaker {
  def generate[T <: Component](
      gen: => T,
      defaultClockDomainFrequency: IClockDomainFrequency = FixedFrequency(
        12 MHz
      )
  ) {
    val targetDirectory = Paths.get("target/bitstream")
    new SpinalConfig(
      defaultClockDomainFrequency = defaultClockDomainFrequency,
      defaultConfigForClockDomains = ClockDomainConfig(
        resetKind = ASYNC,
        resetActiveLevel = LOW
      ),
      targetDirectory = targetDirectory.toString()
    ).generateVerilog(gen)
  }
}
