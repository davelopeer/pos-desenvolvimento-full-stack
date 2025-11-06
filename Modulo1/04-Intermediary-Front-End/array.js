// Filter
const numbers = [1,2,3,4,5,6,7]
const evens = numbers.filter(item => item % 2 === 0)
console.log(evens) // [2,4,6]

var produtos = [
    {id: 1, nome:"SmartPhone", categoria:"Eletronico"},
    {id: 1, nome:"Notebook", categoria:"Eletronico"},
    {id: 1, nome:"Geladeira", categoria:"Eletrodomestico"},
]

var eletronicos = produtos.filter(item => item.categoria === "Eletronico")
console.log(eletronicos)


// Map
var numeros = [0,1,2,3,4,5,6,7,8,9]

var quadrados = numeros.map((n) => {
    return n *n
})

console.log(quadrados)

var funcionarios = [
    {nome:"David", idade:35},
    {nome:"Maria", idade:30},
    {nome:"Carlos", idade:24},
    {nome:"Pablo", idade:39},
    {nome:"Valentina", idade:32},
    {nome:"Carol", idade:45},
]

var nomes = funcionarios.map(funcionario => funcionario.nome)
console.log(nomes)


// Reduce

var mediaIdade = funcionarios.reduce((total, funcionario) => {
    return total + funcionario.idade
}, 0) / funcionarios.length

console.log(mediaIdade)

// ForEach

funcionarios.forEach(funcionario => console.log(funcionario.nome))