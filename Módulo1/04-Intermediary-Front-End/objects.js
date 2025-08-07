var pessoa1 = {
    nome: "David",
    sobrenome: "Barenco"
}

console.log(pessoa1)

// ---------------------------------
var pessoa2 = new Object()
pessoa2.nome = "David"
pessoa2.sobrenome = "Barenco"
pessoa2.falarNome = function() {
    console.log("Olá, meu nome é: " + this.nome)
}

console.log(pessoa2)
pessoa2.falarNome

// ---------------------------------
function criarPessoa(nome, sobrenome) {
    return {nome, sobrenome}
}

var pessoa3 = criarPessoa("David", "Barenco")
console.log(pessoa3)


