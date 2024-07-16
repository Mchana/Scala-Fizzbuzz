object FizzBuzz {
  def generate(number: Int): String = {
    (1 to number).map (x => fb_check(x)).mkString(", ")
  }
  private def fb_check(number: Integer): String = {
    if (number % 15 == 0) {
    "fizzbuzz"}
    else if (number % 3 == 0) {
    "fizz"
  }
    else if (number % 5 == 0) {
    "buzz"}
    else {
    number.toString
  }
}}
