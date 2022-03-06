import java.text.DecimalFormat

const val MINIMUMCOMMISSION = 3500
const val COMMISSION = 0.0075

fun main() {
    print("Введите сумму перевода: ")
    val amount = readLine()?.toDouble() ?: return
    val amountInpennies = amount * 100
    val df = DecimalFormat("#.##")
    if ((amountInpennies * COMMISSION) < MINIMUMCOMMISSION)
        print("Коммисия составит: ${MINIMUMCOMMISSION / 100} рублей")
    else print("Коммисия составит: ${df.format(amountInpennies * COMMISSION / 100)} рублей")

}