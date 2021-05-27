import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    println("Podaj pierwszą liczbę:")
    val pierwsza = reader.nextInt()

    println("Podaj drugą liczbę:")
    val druga = reader.nextInt()

    val obiektLiczby = Liczby(pierwsza, druga)
    val nwd = obiektLiczby.getNWD()

    println("Wprowadzone liczby to $pierwsza i $druga")
    println("Największy wspólny dzielnik wynosi: $nwd")

}