package service;

import model.Venda;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import serializer.VendaSerializer;

import java.math.BigDecimal;
import java.util.Properties;
import java.util.Random;

public class GeradorVendas {
    private static Random random = new Random();
    private static long operacao = 0;

    public static void main(String[] args) throws InterruptedException {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, VendaSerializer.class.getName());

        try(KafkaProducer<String, Venda> producer = new KafkaProducer<>(properties)) {
            while(true) {
                Venda venda = gerarVenda();
                ProducerRecord<String, Venda> record = new ProducerRecord<>("venda-ingressos", venda);
                producer.send(record);
                System.out.println(venda);
                Thread.sleep(300);

            }
        }
    }

    private static Venda gerarVenda() {
        return new Venda(++operacao, random.nextInt(500), 3,
                new BigDecimal(350.00));

    }
}
