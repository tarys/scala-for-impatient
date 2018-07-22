package com.horstmann.impatient

class Manager1 {
  def raise(salary: Double, rate: Double): Double =
    salary * com.horstmann.Utils1.percentOf(salary, rate)	// Can't refer to Utils directly
}