import java.util.Base64

fun main() {
    val input = "49276d206b696c6c696e6720796f757220627261696e206c696b65206120706f69736f6e6f7573206d757368726f6f6d"
    val hex = input.chunked(2).map { it.toInt(16).toByte() }.toByteArray()
    val output = Base64.getEncoder().encodeToString(hex)
    println(output)
}