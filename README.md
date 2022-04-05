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