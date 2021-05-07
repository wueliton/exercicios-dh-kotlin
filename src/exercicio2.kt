class JogadorDeFutebol(var nome: String, var energia: Int) {
    var alegria = 100
    var gols = 0
    var experiencia = 0

    fun fazerGol() {
        energia -= 10
        alegria += 10
        gols += 1
        println("GOOOOL!")
    }

    fun correr() {
        energia -= 10
        println("Cansei")
    }
}

class SessaoDeTreinamento() {
    fun treinarA(jogadorDeFutebol: JogadorDeFutebol) {
        println("Experiência inicial: ${jogadorDeFutebol.experiencia}")

        jogadorDeFutebol.correr()
        jogadorDeFutebol.fazerGol()
        jogadorDeFutebol.correr()

        jogadorDeFutebol.experiencia += 1

        println("Experiência final: ${jogadorDeFutebol.experiencia}")
    }
}

fun main() {
    var jogador1 = JogadorDeFutebol("Cristiano Ronaldo", 100)
    SessaoDeTreinamento().treinarA(jogador1)

    var jogador2 = JogadorDeFutebol("Messi", 100)
    SessaoDeTreinamento().treinarA(jogador2)
}