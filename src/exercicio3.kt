class Atleta(val nome: String, val nivel: Int, val energia: Int) {}

class Prova(val dificuldade: Int, val energiaNecessaria: Int) {
    fun podeRealizar(obj: Atleta): Boolean {
        if(obj.nivel > dificuldade && obj.energia >= energiaNecessaria) {
            return true
        }
        return false
    }
}

class Exercicio3 {
    fun main() {
        val atleta1 = Atleta("Clodoaldo", 3, 60)
        val atleta2 = Atleta("Luiz Antônio", 7, 50)

        val a1Prova1 = Prova(5, 40)
        val a1Prova2 = Prova(7, 80)
        val a1Prova3 = Prova(2, 10)

        val a2Prova1 = Prova(3, 35)
        val a2Prova2 = Prova(9, 100)
        val a2Prova3 = Prova(1, 10)

        if(a1Prova1.podeRealizar(atleta1)) println("${atleta1.nome} pode realizar a prova 1")
        else println("${atleta1.nome} não pode realizar a prova 1")

        if(a1Prova2.podeRealizar(atleta1)) println("${atleta1.nome} pode realizar a prova 2")
        else println("${atleta1.nome} não pode realizar a prova 2")

        if(a1Prova3.podeRealizar(atleta2)) println("${atleta1.nome} pode realizar a prova 3")
        else println("${atleta1.nome} não pode realizar a prova 3")

        if(a2Prova1.podeRealizar(atleta2)) println("${atleta2.nome} pode realizar a prova 1")
        else println("${atleta2.nome} não pode realizar a prova 1")

        if(a2Prova2.podeRealizar(atleta2)) println("${atleta2.nome} pode realizar a prova 2")
        else println("${atleta2.nome} não pode realizar a prova 2")

        if(a2Prova3.podeRealizar(atleta2)) println("${atleta2.nome} pode realizar a prova 3")
        else println("${atleta2.nome} não pode realizar a prova 3")
    }
}