## Padrão Lazy vs Eager

Lazy: Padrão de projeto que adia a inicialização de um objeto o máximo possível. Usado para melhor performance, por exemplo, quando se utiliza o banco de dados. Trazemos o que precisamos para não sobrecarregar o banco de dados.

Eager: Padrão que inicializa os dados ao mesmo tempo.


## Cascade

Relacionamento entre entidades onde só faz sentido uma existir se outra existir. Ex: Endereço e Aluno. Cascade permite que determinada ação seja determinada na entidade pai e filha. Quando deletamos um Estudante, a entidade Endereço deve ser excluída junto.



## WebSockets

WebSocket é uma tecnologia onde o cliente pode se conectar com o servidor de forma contínua e receber respostas dele de acordo com eventos. Um exemplo clássico de uso de WebSocket são aplicativos de mensagem instantânea, onde o cliente não fica o tempo todo fazendo uma requisição no servidor em busca de novas mensagens, porque o servidor envia para o cliente quando uma nova surgir.

WebSocket usa o conceito de eventos que pode ser entendido como canal de comunicação. Nós devemos criar esses eventos no servidor e cada cliente se conecta em um evento que esteja interessado. Assim, o servidor envia uma mensagem em um evento e todos que estão inscritos naquele evento recebem a mesma mensagem. Isso é chamado de broadcast.

## Autenticação x Autorização

- Autenticação é o processo de identificar quem é o usuário.
- Autorização é o processo de identificar se determinado usuário possui ou não o devido privilégio de acessar determinado recurso.