package com {
  package horstmann {
    object Utils1 {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }
    package impatient {
      class Employee1 {
        def raise(salary: Double, rate: Double) = salary * Utils1.percentOf(salary, rate)
      }
    }
  }
}