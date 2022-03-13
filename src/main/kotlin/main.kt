import java.text.DecimalFormat

const val MINIMUM_COMMISSION = 3500
const val COMMISSION = 0.0075

fun main() {
    print("Введите сумму перевода: ")
    val amount = readLine()?.toDouble() ?: return
    val amountInPennies = amount * 100
    val df = DecimalFormat("#.##")
    var commissionToPay = amountInPennies * COMMISSION
    if ((commissionToPay) < MINIMUM_COMMISSION)
        commissionToPay = MINIMUM_COMMISSION.toDouble()
    print("Коммисия составит: ${df.format(commissionToPay / 100)} рублей")
}