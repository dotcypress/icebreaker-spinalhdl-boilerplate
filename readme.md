# icebreaker-spinalhdl-boilerplate

[SpinalHDL](https://github.com/SpinalHDL/SpinalHDL) project template for [iCEBreaker FPGA](https://github.com/icebreaker-fpga/icebreaker).

## Prerequisites

The following tools need to be installed for building this boilerplate:

Software:
* [Yosys](https://github.com/YosysHQ/yosys#setup)
* [IceStorm](https://github.com/YosysHQ/icestorm)
* [nextpnr](https://github.com/YosysHQ/nextpnr)
* [Java JDK](https://www.oracle.com/au/java/technologies/javase-downloads.html)
* [SBT](https://www.scala-sbt.org/download.html)
* [SpinalHDL](https://spinalhdl.github.io/SpinalDoc-RTD/SpinalHDL/Getting%20Started/getting_started.html)

## Usage

Ellaborate, Synthesis and Place&Route:
`make`

Program IceBreaker FLASH:
`make flash`

Program IceBreaker RAM:
`make prog`

Ellaborate only:
`make ellaborate`

All build artefacts(Verilog code, P&R files) will be stored in `/target/bitstream` directory.

## License

Licensed under either of

- Apache License, Version 2.0 ([LICENSE-APACHE](LICENSE-APACHE) or
  http://www.apache.org/licenses/LICENSE-2.0)
- MIT license ([LICENSE-MIT](LICENSE-MIT) or http://opensource.org/licenses/MIT)

at your option.

## Contribution

Unless you explicitly state otherwise, any contribution intentionally submitted
for inclusion in the work by you, as defined in the Apache-2.0 license, shall be
dual licensed as above, without any additional terms or conditions.s
