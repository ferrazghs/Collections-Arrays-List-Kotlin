import java.math.BigDecimal

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acc, value -> acc + value }
}

fun Array<BigDecimal>.average(): BigDecimal {
    if (this.isEmpty()) {
        return BigDecimal.ZERO
    } else {
        return this.sum() / this.size.toBigDecimal()
    }
}