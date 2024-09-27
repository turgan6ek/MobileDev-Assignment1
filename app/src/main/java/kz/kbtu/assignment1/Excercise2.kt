package kz.kbtu.assignment1

class Excercise2 {
}

open class Person(var name: String, var age: Int, var email: String) {

    open fun displayInfo() {
        println("name: " + name)
        println("age: " + age)
        println("email: " + email)
    }
}

class Employee(name: String, age: Int, email: String, val salary: Double): Person(name, age, email) {
    override fun displayInfo() {
        super.displayInfo()
        println("salary: " + salary)
    }
}

class BankAccount(private var balance: Double) {
    fun deposit(toDeposit: Double) {
        if (toDeposit < 0) {
            throw Exception("you can not deposit negative amount!")
        }
        balance += toDeposit
    }

    fun withdraw(toWithdraw: Double) {
        if (balance < toWithdraw) {
            throw  Exception("Amount to withdraw must not be more than your current balance!")
        }
        balance -= toWithdraw
    }
}