## Kafka
O Apache Kafka é uma plataforma de streaming de eventos distribuídos de código aberto que é capaz de publicar, subscrever, armazenar e processar fluxos de registro em tempo real, é uma alternativa aos sistemas de mensageria empresarias tradicionais.
O Kafka utiliza o Zookeeper como serviço de hospedagem, ele atua como um serviço centralizado e é usado para manter dados de nomenclatura e configuração e fornecer sincronização flexível e robusta em sistemas distribuídos.

### iniciar zookeeper
```
zookeeper-server-start C:\kafka\kafka_2.12-2.4.0\config\zookeeper.properties
```

### iniciar kafka
```
kafka-server-start C:\kafka\kafka_2.12-2.4.0\config\server.properties
```


### topicos kafka
####  listar
```
kafka-topics --bootstrap-server localhost:9092 --list
```

#### criar 
```
kafka-topics --bootstrap-server localhost:9092 --create --topic teste
```

#### escrever
```
kafka-console-producer --broker-list localhost:9092 --topic teste
```

#### ler
```
kafka-console-consumer --bootstrap-server localhost:9092 --topic teste
```

#### deletar

```
kafka-topics --bootstrap-server localhost:9092 --delete --topic teste
```

#### exibir grupos
```
kafka-consumer-groups.bat --bootstrap-server localhost:9092 --list
```