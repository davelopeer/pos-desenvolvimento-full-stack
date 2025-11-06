
# Herança

**Subclasse** é a classe que herda da classe pai, e **Superclasse** a classe que gera uma classe filha.

Relacionamento do tipo "é um":

- Caminhão é um tipo de Veículo.
- Vendedor é um tipo de Funcionário. Funcionário é um tipo de Pessoa.


## Composição

Uma instancia da classe existente é usada como componente de outra classe. 

Relacionamento do tipo "tem um":

- Bicicleta tem uma Roda.
- Caminhão tem um Motorista;
- Pedido tem um Item;

## Classes abstratas

Não podem ser instanciadas. Uma classe Animal possui subclasses (cachorro, cavalo).

Indicam quais atributos e métodos uma subclasse precisa ter.


## Interface

Estrutura de programação que permite ao computador impor certas propriedades em um objeto (classe).

Uma classe chamada veículo pode ter subclasses como Carro, Moto e Caminhão.

- Cada uma subclasse pode ter quantos métodos forem necessários;
- Todas devem ter uma ação de ligar o Motor;
- O "como" cada motor é iniciado será implementado em cada subclasse.


## Tratando exceções

Erros podem acontecer no código durante a execução. Podemos tratar esses erros e personalizar os retornos.