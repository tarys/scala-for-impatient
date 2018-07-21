val n: Int = 4

def power(x: Double, n: Int): Double = {
  if ((n > 0) && (n % 2 == 0)) {
    power(x, n / 2) * power(x, n / 2)
  } else if ((n > 0) && (n % 2 == 1)) {
    x * power(x, n - 1)
  } else if (n < 0) {
    1 / power(x, -n)
  } else 1 // n == 0
}
println(power(2, 5))