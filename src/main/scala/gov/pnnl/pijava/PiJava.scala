package gov.pnnl.pijava

object PiJava {

	def main(args: Array[String]): Unit = {
		val start = System.currentTimeMillis()
		val mypi = pi()
		val end = System.currentTimeMillis()
		println(s"Pi = $mypi in ${end-start} ms.")
	}

	def pi(): Double = {
		var sum = 0.0
		(0 until 10000000).foreach { k =>
			sum += Math.pow(-3.0,-k.toDouble) / (2.0*k.toDouble + 1.0)
		}
		Math.sqrt(12.0) * sum

	}
}