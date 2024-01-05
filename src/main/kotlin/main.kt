fun main() {
    var likes  = 11
    var ending = ""

    ending = if (likes % 10 == 1 && likes != 11) "человеку" else "людям"

    println("Понравилось $likes $ending")
}