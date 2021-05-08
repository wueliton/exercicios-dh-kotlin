fun main() {
    //Criando primeiro carro e cliente
    val carro = Veiculo(marca = "Audi", modelo = "R8", cor = "Vermelho", anoFabricacao = 2021, quilometragem = 0.0)
    val cliente = Cliente(nome = "Pedro", sobrenome = "Scott", contato = "pedro@gmail.com")
    //Criando segundo carro e cliente
    val carro2 = Veiculo(marca = "BMW", modelo = "X5", anoFabricacao = 2021, cor = "Branco", quilometragem = 0.0)
    val cliente2 = Cliente(nome = "João", sobrenome = "Almeida", contato = "(61) 90000-2222")
    //Criando concessionaria
    val audi = Concessionaria()

    //Registrando vendas
    audi.registrarVenda(carro, cliente, 1000000.0)
    audi.registrarVenda(carro2, cliente2, 500000.0)

    //Mostrando vendas registradas
    audi.vendas.forEach {
        print("Venda Nº ${audi.vendas.indexOf(it)}\n")
        print("Carro: ${it.veiculo.marca} ${it.veiculo.modelo}\n")
        print("Cliente: ${it.cliente.nome} ${it.cliente.sobrenome}\n")
        print("Valor da Venda: R$${it.valorVenda}\n\n")
    }
}