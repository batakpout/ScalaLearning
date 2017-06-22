package projecteuler

object PowerBase extends App {

  val res = BigInt(2).pow(1000).toString.map(_.asDigit).sum
  println(res)

  def calcuatePower(power: BigInt) = {
    def recursivePower(base: BigInt, power: BigInt, acc: BigInt): BigInt = {
      if (power == 0) acc else recursivePower(base, power - 1, acc * base)
    }

    recursivePower(2, power, 1)
  }

  println(calcuatePower(1000).toString().map(_.asDigit).sum)
}