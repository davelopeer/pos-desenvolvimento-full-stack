
# Introdução à Programação Orientada a Objetos 

Este paradigma de programação tenta ser o mais óbvio, natural e exato possível. É usada para projetar um programa usando classes e objetos.


Princípios essenciais:

- Abstração;
- Classes e objetos;
- Atributos, métodos e mensagens;
- Herança e associação;
- Encapsulamento;
- Polimorfismo;
- Interfaces.


### Progamação estruturada

Dados globais -> orientada a procedimentos


### Programação orientada a objetos

Dados objetos -> atributos e métodos



## Classes

Abstração de um objeto. Funciona como uma planta de uma casa. A **classe** define o formato do **objeto** (instância de uma classe).


### UML

Desenhar uma classe sem escrever.

![uml-diagram](images/image.png)

**- sinal de privado*

**+ sinal de público*


### Construtores

Método especial que é carregado quando o objeto é criado. Possui o mesmo nome da classe e não retorna valores.


### Modificadores de acesso

- *public*: pode ser usado por qualquer outra classe
- *private*: só pode ser utilizado pela própria classe
- *Protected*: pode ser utilizado dentro do mesmo pacote apenas



## Encapsulamento

Ocultar, escoder ou restringir partes do objeto para manter a integridade dos dados. 
Separar o programa em partes, cápsulas autocontidas, tornando-o mais flexível.

Desta forma:
 - promove-se a reutilização de código e a segurança;
 - o programa se torna mais facil de modificar e de dar manutenção.

Métodos para trabalharmos com encapsulamento de dados:

- **setAtributo(parametro)** -> métodos modificadores
- **getAtributo** -> métodos de acesso
