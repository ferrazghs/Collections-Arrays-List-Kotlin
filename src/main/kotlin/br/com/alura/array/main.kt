import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salaryArray = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    val increase = "1.1".toBigDecimal()
    val salaryIncrease: Array<BigDecimal> = salaryArray
        .map { salario -> salaryIncreaseRelative(salario, increase) }
        .toTypedArray()

    val firstMonth = salaryArray.sum()
    val month = 6.toBigDecimal()
    val finalExpense = salaryArray.fold(firstMonth)
    { acc, salary -> acc + (salary * month).setScale(2, RoundingMode.UP) }

    val averageSalary = salaryIncrease
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .average()

    println(averageSalary)
    println(salaryIncrease)
    println(firstMonth)
    println(finalExpense)
}

fun salaryIncreaseRelative(salary: BigDecimal, increase: BigDecimal)
        : BigDecimal {
    return if (salary < "5000".toBigDecimal()) {
        salary + "500".toBigDecimal()
    } else {
        (salary * increase).setScale(2, RoundingMode.UP)
    }
}



