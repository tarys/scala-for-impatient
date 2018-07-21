// #1
class Counter {
  private var value = 0

  def increment() = {
    value += 1
    if (value < 0) {
      value = Int.MaxValue
    }
  }

  def current = value
}

val counterInstance = new Counter

counterInstance.increment()
counterInstance.current

// #2
class BankAccount {
  private var balance = 0.0

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (amount <= balance) balance -= amount
  }
}

// #3
class Time(val hrs: Int, val min: Int) {
  def before(other: Time): Boolean = {
    hrs * 60 + min < other.hrs * 60 + min
  }
}

val t1 = new TimeNew(10, 25)
val t2 = new TimeNew(8, 17)

t1.before(t1)
t1.before(t2)
t2.before(t1)
t1.hrs
t1.min


// #4
class TimeNew(hours: Int, minutes: Int) {
  private val minutesFromMidnight = hours * 60 + minutes

  def min = {
    minutesFromMidnight % 60
  }

  def hrs = {
    (minutesFromMidnight - min) / 60
  }

  def before(other: TimeNew): Boolean = {
    minutesFromMidnight < other.minutesFromMidnight
  }
}

val t41 = new TimeNew(10, 25)
val t42 = new TimeNew(8, 17)

t41.before(t41)
t41.before(t42)
t42.before(t41)
t41.hrs
t41.min

// #5
val st1 = new Student(1, "John")
st1.getName

// #6
class Person(ageParam: Int) {
  val age = if (ageParam > 0) ageParam else 0
}

new Person(3).age

// #7
class Person7(name: String) {
  val firstName = name.split(' ')(0)
  val lastName = name.split(' ')(1)
}

val p7 = new Person7("Chuck Norris")
p7.firstName
p7.lastName

// #8
class Car(val manufacturer: String, val modelName: String, val modelYear: Int = -1, var licensePlate: String = "") {
  override def toString: String = {
    "[" + manufacturer + ", " + modelName + ", " + modelYear + ", " + licensePlate + "]"
  }
}

val car1 = new Car("Volkswagen", "Golf VI")
val car2 = new Car("Volkswagen", "Golf VI", 2008)
val car3 = new Car("Volkswagen", "Golf VI", licensePlate = "AA3210PA")
val car4 = new Car("Volkswagen", "Golf VI", 2008, "AA3210PA")

// #9
// Oh my! Too many lines just for constructors

// #10
class Employee {
  val name: String = "John Q. Public"
  var salary: Double = 0.0
}