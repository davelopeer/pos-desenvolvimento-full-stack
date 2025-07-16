# Intermediary FrontEnd

## NodeJS

Instalar o node no computador e a extensão _nodejs exec_ no VSCode.

## Javascript

- Orientada a Objetos. Sem distinção entre tipos e objetos. A herança é feita através do protótipo e as propriedades e métodos podem ser adicionadas a qualquer objeto dinamicamente.

- Os tipos de dados das variáveis não precisam ser declarados (tipagem dinâmica).

- Não pode escrever autoqmaticamente no disco rígido.

- Linguagem não compilada

Padronizado pela ECMA International. 


### Tipos primitivos

- bool
- null
- undefined
- number
- string
- objeto

### Operadores

- Binário: operanod1 **operador** operando2 (Ex: 2+3, 4*4)
- Unário: operando **operador** ou **operador** operando (EX: x++, ++z)
- Atribução: atribui um valor a uma variável (Ex: var a = "oi")
- Aritméticos (Ex: x += y, x = y)
- Incremento/Decremento: ++ ou --
- Comparação:
  - ==
  - !=
  - === (iguais e do mesmo tipo)
  - !==
  - >
  - >=
  - <
  - <=
- Lógicos
  - && (AND)
  - || (OR)
  - ! (NOT)
- Condicional Ternário: operador "?" e ":" (Ex: condição ? valorCasoVerdade : valorCasoFalso )

### For

```
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


```

### Array

var arr = new Array(1, 2, 3, ...);
var arr = Array(1, 2, 3, ...);
var arr = [1, 2, 3, ...];

**Se usar o Array e passar um elemento único, ele será entendido como o length do Array*