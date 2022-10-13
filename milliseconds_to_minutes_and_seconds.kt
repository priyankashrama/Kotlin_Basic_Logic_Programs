import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {

    val milliseconds: Long = 1000000

    // long minutes = (milliseconds / 1000) / 60;
    val minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds)

    // long seconds = (milliseconds / 1000);
    val seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds)

    println("$milliseconds Milliseconds = $minutes minutes")
    println("Or")
    println("$milliseconds Milliseconds = $seconds seconds")
}
