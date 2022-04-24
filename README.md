## Kafka
O Apache Kafka � uma plataforma de streaming de eventos distribu�dos de c�digo aberto que � capaz de publicar, subscrever, armazenar e processar fluxos de registro em tempo real, � uma alternativa aos sistemas de mensageria empresarias tradicionais.
O Kafka utiliza o Zookeeper como servi�o de hospedagem, ele atua como um servi�o centralizado e � usado para manter dados de nomenclatura e configura��o e fornecer sincroniza��o flex�vel e robusta em sistemas distribu�dos.

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