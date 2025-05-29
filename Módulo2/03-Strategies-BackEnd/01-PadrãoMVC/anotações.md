# Modelo MVC e API RESTful

Para esse módulo iremos utilizar:

- [IDE Spring Tools](https://spring.io/tools)
- [Lombok (Java library)](https://projectlombok.org)
- [Postman](https://www.postman.com/)


## MVC

É o acrônimo de _Model-View-Controller_, um padrão de projeto de software desenvolvido no final da década de 70 por Trygve Reenskaug.

Padrão arquitetural que rege toda arquitetura da aplicação. Divido em camadas com responsabilidades específicas. Separa a interface do usuáiro da lógica de negócios e também de dados, facilitando a manutenção e a escalabilidade.


<img src="images/mvc.png" alt="drawing" width="300"/>

Foi introduzido pela primeira vez em 1987 na linguagem de programação Smalltalk e aceito como um padrão em 1988.

O objetivo era resolver o problema de usuários controlando um conjunto de dados grande e complexo. Como foi criado antes dos navegadores Web, foi projetado inicialmente para interfaces gráficas de usuário (GUI). Atualmente é um padrão na maioria dos Frameworks de desenvolvimento.

<img src="images/mvc-cozinha.png" alt="drawing" width="450"/>



### Model

A camada Model do padrão MVC é responsável por conter as regras de negócio da nossa aplicação, assim como as funções e comportamento dos dados. É ela também responsável pelo gerenciamento dos dados, seu armazenamento, modelagem, manipulação e geração. Podemos ver que nossa camada Model ainda possui muita responsabilidade, por isso, iremos dividi-la em 3 partes:


- **Service**: responsável por conter a lógica da nossa aplicação. É nela que toda a nossa regra de negócio irá ficar.
- **Entity**: modelar os dados.
- **Repository**: armazenar, manipular e gerar os dados.


### Controller

Essa é a camada que é responsável por gerenciar o fluxo das requisições que chegam em nossa API. É nela onde iremos configurar os nossos endpoints. Podemos dizer que ela é a porta de entrada para a nossa aplicação. Toda e qualquer requisição deverá passar por essa camada, que por sua vez também é responsável por retornar a resposta apropriada para todas as requisições.



## API RESTful


### API

_Application Programmin Interface_ é um conjunto de instruções e padrões que possam ser consumidos por sua aplicação, sem conhecer os detalhes da implementação. Permite a **comunicação entre aplicações**.


### REST

_Representational State Transfer_ é um estilo de arquitetura que consiste em princípios/regras/restrições que permitem a criação de um projeto com interfaces bem definidas. Usa HTTP para solicitar dados.


**API RESTful**: API que segue os princípios REST


Princípios:

- **Uniform Interface**: os dados que trafegam seguem um padrão uniforme.
- **Stateless**: toda requisição deve ser completada, independente de todas as solicitações anteriores. O cliente pode solicitar recursos em qualquer ordem e o resultado de uma solicitação não interfere na outra.
- **Cachable**: essa arquitetura possibilita o armazenamento de determinadas informações em cache, melhorando o tempo de resposta do servidor.
- **Client-Server**: cliente se comunicando com servidor
- **Layered system**: um serviço pode ser usado para se conectar a outros serviços, ou até mesmo como um serviço intermediário, gerando assim um sistema com muitas camadas, onde um serviço A faz uso do serviço B que faz uso do serviço C e assim por diante.aplicações
- **Code on Demand**: a interface do usuário pode mudar de acordo com o retorno da API, o servidor pode modificar ou personalizar a interface do usuário, como por exemplo um usuário administrador ter acesso a uma tela que os demais não têm. Essa informação se o usuário é administrador ou não vem do servidor.

Toda solicitação a API RESTful deve conter pelo menos dois componentes principais:

- **Identificador de recurso exclusivo**: este componente nada mais é que a url do recurso. É mais conhecido como endpoint, ou seja, o caminho que devemos fazer a requisição para acessar determinado recurso.
- **Método**: API RESTful geralmente são implementadas usando métodos HTTP (Protocolo de Transferência de Hipertexto).


## 

