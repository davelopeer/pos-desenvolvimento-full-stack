var n = 30;
console.log(typeof(n));
console.log(typeof(a));
console.log(typeof([]));

var nome = "David";
console.log(nome.length)
console.log(nome.toUpperCase())

var arr = [1,2,3,4]
console.log(arr)


lista = [
  {nome: "David"},
  {nome: "João"},
  {nome: "Maria"},
]

for (const i in lista) {
  console.log(lista[i].nome);
}

for (const elemento of lista) {
  console.log(elemento.nome);
}
